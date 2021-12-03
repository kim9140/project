package com.example.project;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class WeatherActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        TextView textView = (TextView) findViewById(R.id.date_View);
        TextView textView2 = (TextView) findViewById(R.id.date_View2);
        TextView textView3 = (TextView) findViewById(R.id.date_View3);
        Button weekbtn = (Button) findViewById(R.id.week_weather);

        WeatherConnection weatherConnection = new WeatherConnection();
        AsyncTask<String, String, String> result = weatherConnection.execute("", "");

        WeatherConnection2 weatherConnection2 = new WeatherConnection2();
        AsyncTask<String, String, String> result2 = weatherConnection2.execute("", "");

        WeatherConnection3 weatherConnection3 = new WeatherConnection3();
        AsyncTask<String, String, String> result3 = weatherConnection3.execute("", "");

        try {
            String msg = result.get();
            textView.setText(msg.toString());
            String msg2 = result2.get();
            textView2.setText(msg2.toString());
            String msg3 = result3.get();
            textView3.setText(msg3.toString());

        } catch (Exception e) {
        }
        weekbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WeekWeatherActivity.class);
                startActivity(intent);
            }
        });
    }

    // 네트워크 작업은 AsyncTask 를 사용해야 한다
    public class WeatherConnection extends AsyncTask<String, String, String> {
        //백그라운드작업
        @Override
        protected String doInBackground(String... params) {
            try {

                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();

                Elements elements = document.select("strong[class=current]");
                Element targetElement = elements.get(0);

                String text = targetElement.text();
                return text;


            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public class WeatherConnection2 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {

                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();

                Elements elements = document.select("p[class=summary]");

                Element targetElement = elements.get(0);

                String text = targetElement.text();
                return text;


            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public class WeatherConnection3 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {

                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();

                Elements elements = document.select("dl[class=summary_list]");

                Element targetElement = elements.get(0);

                String text = targetElement.text();
                return text;


            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}