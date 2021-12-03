package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NewsAdapter newsAdapter;
    private List<NewsData> newsDataList = new ArrayList<>();
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_news);
        Intent intent = getIntent();
        NewsDataPrepare();

    }

    private void NewsDataPrepare(){
        String url = "https://newsapi.org/v2/top-headlines?country=kr&apiKey=030b57aa4f0d47368940ce41411975af";
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                recyclerView = findViewById(R.id.recycler_view);
                imageView = findViewById(R.id.imageView);
                newsAdapter = new NewsAdapter(newsDataList);
                RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(), 1);
                recyclerView.setLayoutManager(manager);
                recyclerView.setAdapter(newsAdapter);
                JSONArray jsonArray = null;
                try {
                    jsonArray = response.getJSONArray("articles");
                    NewsData newsData = new NewsData(jsonArray.getJSONObject(0).get("title").toString(),jsonArray.getJSONObject(0).get("description").toString(), jsonArray.getJSONObject(0).get("url").toString(),
                            jsonArray.getJSONObject(0).get("urlToImage").toString(), imageView);
                    for (int i = 1, size = jsonArray.length(); i < size; i++) {
                        JSONObject objectInArray = jsonArray.getJSONObject(i);
                        newsData = new NewsData(objectInArray.get("title").toString(), objectInArray.get("description").toString(), objectInArray.get("url").toString(), objectInArray.get("urlToImage").toString()
                                , imageView);
                        newsDataList.add(newsData);

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(NewsActivity.this,"에러",Toast.LENGTH_LONG).show();
            }

        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String,String> headers = new HashMap<String, String>();
                headers.put("User-Agent","Mozilla/5.0");
                return headers;
            }
        };
        requestQueue.add(jsonObjectRequest);
    }
}