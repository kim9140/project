package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

public class SingActivity extends AppCompatActivity {
    private Button search30;
    private Button search40;
    private Button search50;
    private Button search60;
    private Button search70;
    private Button search80;
    private Button search90;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing);

        SearchView searchview;
        searchview = findViewById(R.id.search_sing);

        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
            @Override
            public boolean onQueryTextSubmit (String query){
                //검색버튼 눌렀을때
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query="+searchview.getQuery()+""));
                    startActivity(intent);
                return true;
            }
            @Override
            public boolean onQueryTextChange (String netText){
                return false;
            }
        });

        search30 = (Button)findViewById(R.id.search_30);
        search30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=784z9hNs_T4"));
                startActivity(intent);//엑티비티 이동
            }
        });

        search40 = (Button)findViewById(R.id.search_40);
        search40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=BmAbG-zj7X0"));
                startActivity(intent);//엑티비티 이동
            }
        });

        search50 = (Button)findViewById(R.id.search_50);
        search50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=OHOU1bF53Vg"));
                startActivity(intent);//엑티비티 이동
            }
        });

        search60 = (Button)findViewById(R.id.search_60);
        search60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=KiY60bncGgQ"));
                startActivity(intent);//엑티비티 이동
            }
        });

        search70 = (Button)findViewById(R.id.search_70);
        search70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ubMloolBj7A"));
                startActivity(intent);//엑티비티 이동
            }
        });

        search80 = (Button)findViewById(R.id.search_80);
        search80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=AiXurzwXhMI"));
                startActivity(intent);//엑티비티 이동
            }
        });
        search90 = (Button)findViewById(R.id.search_90);
        search90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6zZw5J6GK4E"));
                startActivity(intent);//엑티비티 이동
            }
        });
    }


}