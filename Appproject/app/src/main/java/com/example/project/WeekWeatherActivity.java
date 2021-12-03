package com.example.project;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class WeekWeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekweather);
        TextView textView1_1 = (TextView) findViewById(R.id.week_View1_1);
        TextView textView1_2 = (TextView) findViewById(R.id.week_View1_2);
        TextView textView1_3 = (TextView) findViewById(R.id.week_View1_3);
        TextView textView1_4 = (TextView) findViewById(R.id.week_View1_4);

        TextView textView2_1 = (TextView) findViewById(R.id.week_View2_1);
        TextView textView2_2 = (TextView) findViewById(R.id.week_View2_2);
        TextView textView2_3 = (TextView) findViewById(R.id.week_View2_3);
        TextView textView2_4 = (TextView) findViewById(R.id.week_View2_4);

        TextView textView3_1 = (TextView) findViewById(R.id.week_View3_1);
        TextView textView3_2 = (TextView) findViewById(R.id.week_View3_2);
        TextView textView3_3 = (TextView) findViewById(R.id.week_View3_3);
        TextView textView3_4 = (TextView) findViewById(R.id.week_View3_4);

        TextView textView4_1 = (TextView) findViewById(R.id.week_View4_1);
        TextView textView4_2 = (TextView) findViewById(R.id.week_View4_2);
        TextView textView4_3 = (TextView) findViewById(R.id.week_View4_3);
        TextView textView4_4 = (TextView) findViewById(R.id.week_View4_4);

        TextView textView5_1 = (TextView) findViewById(R.id.week_View5_1);
        TextView textView5_2 = (TextView) findViewById(R.id.week_View5_2);
        TextView textView5_3 = (TextView) findViewById(R.id.week_View5_3);
        TextView textView5_4 = (TextView) findViewById(R.id.week_View5_4);

        TextView textView6_1 = (TextView) findViewById(R.id.week_View6_1);
        TextView textView6_2 = (TextView) findViewById(R.id.week_View6_2);
        TextView textView6_3 = (TextView) findViewById(R.id.week_View6_3);
        TextView textView6_4 = (TextView) findViewById(R.id.week_View6_4);

        TextView textView7_1 = (TextView) findViewById(R.id.week_View7_1);
        TextView textView7_2 = (TextView) findViewById(R.id.week_View7_2);
        TextView textView7_3 = (TextView) findViewById(R.id.week_View7_3);
        TextView textView7_4 = (TextView) findViewById(R.id.week_View7_4);



        WeatherConnection1_1 weatherConnection1_1 = new WeatherConnection1_1();
        AsyncTask<String, String, String> result1_1 = weatherConnection1_1.execute("", "");
        WeatherConnection1_2 weatherConnection1_2 = new WeatherConnection1_2();
        AsyncTask<String, String, String> result1_2 = weatherConnection1_2.execute("", "");
        WeatherConnection1_3 weatherConnection1_3 = new WeatherConnection1_3();
        AsyncTask<String, String, String> result1_3 = weatherConnection1_3.execute("", "");
        WeatherConnection1_4 weatherConnection1_4 = new WeatherConnection1_4();
        AsyncTask<String, String, String> result1_4 = weatherConnection1_4.execute("", "");

        WeatherConnection2_1 weatherConnection2_1 = new WeatherConnection2_1();
        AsyncTask<String, String, String> result2_1 = weatherConnection2_1.execute("", "");
        WeatherConnection2_2 weatherConnection2_2 = new WeatherConnection2_2();
        AsyncTask<String, String, String> result2_2 = weatherConnection2_2.execute("", "");
        WeatherConnection2_3 weatherConnection2_3 = new WeatherConnection2_3();
        AsyncTask<String, String, String> result2_3 = weatherConnection2_3.execute("", "");
        WeatherConnection2_4 weatherConnection2_4 = new WeatherConnection2_4();
        AsyncTask<String, String, String> result2_4 = weatherConnection2_4.execute("", "");

        WeatherConnection3_1 weatherConnection3_1 = new WeatherConnection3_1();
        AsyncTask<String, String, String> result3_1 = weatherConnection3_1.execute("", "");
        WeatherConnection3_2 weatherConnection3_2 = new WeatherConnection3_2();
        AsyncTask<String, String, String> result3_2 = weatherConnection3_2.execute("", "");
        WeatherConnection3_3 weatherConnection3_3 = new WeatherConnection3_3();
        AsyncTask<String, String, String> result3_3 = weatherConnection3_3.execute("", "");
        WeatherConnection3_4 weatherConnection3_4 = new WeatherConnection3_4();
        AsyncTask<String, String, String> result3_4 = weatherConnection3_4.execute("", "");

        WeatherConnection4_1 weatherConnection4_1 = new WeatherConnection4_1();
        AsyncTask<String, String, String> result4_1 = weatherConnection4_1.execute("", "");
        WeatherConnection4_2 weatherConnection4_2 = new WeatherConnection4_2();
        AsyncTask<String, String, String> result4_2 = weatherConnection4_2.execute("", "");
        WeatherConnection4_3 weatherConnection4_3 = new WeatherConnection4_3();
        AsyncTask<String, String, String> result4_3 = weatherConnection4_3.execute("", "");
        WeatherConnection4_4 weatherConnection4_4 = new WeatherConnection4_4();
        AsyncTask<String, String, String> result4_4 = weatherConnection4_4.execute("", "");

        WeatherConnection5_1 weatherConnection5_1 = new WeatherConnection5_1();
        AsyncTask<String, String, String> result5_1 = weatherConnection5_1.execute("", "");
        WeatherConnection5_2 weatherConnection5_2 = new WeatherConnection5_2();
        AsyncTask<String, String, String> result5_2 = weatherConnection5_2.execute("", "");
        WeatherConnection5_3 weatherConnection5_3 = new WeatherConnection5_3();
        AsyncTask<String, String, String> result5_3 = weatherConnection5_3.execute("", "");
        WeatherConnection5_4 weatherConnection5_4 = new WeatherConnection5_4();
        AsyncTask<String, String, String> result5_4 = weatherConnection5_4.execute("", "");

        WeatherConnection6_1 weatherConnection6_1 = new WeatherConnection6_1();
        AsyncTask<String, String, String> result6_1 = weatherConnection6_1.execute("", "");
        WeatherConnection6_2 weatherConnection6_2 = new WeatherConnection6_2();
        AsyncTask<String, String, String> result6_2 = weatherConnection6_2.execute("", "");
        WeatherConnection6_3 weatherConnection6_3 = new WeatherConnection6_3();
        AsyncTask<String, String, String> result6_3 = weatherConnection6_3.execute("", "");
        WeatherConnection6_4 weatherConnection6_4 = new WeatherConnection6_4();
        AsyncTask<String, String, String> result6_4 = weatherConnection6_4.execute("", "");

        WeatherConnection7_1 weatherConnection7_1 = new WeatherConnection7_1();
        AsyncTask<String, String, String> result7_1 = weatherConnection7_1.execute("", "");
        WeatherConnection7_2 weatherConnection7_2 = new WeatherConnection7_2();
        AsyncTask<String, String, String> result7_2 = weatherConnection7_2.execute("", "");
        WeatherConnection7_3 weatherConnection7_3 = new WeatherConnection7_3();
        AsyncTask<String, String, String> result7_3 = weatherConnection7_3.execute("", "");
        WeatherConnection7_4 weatherConnection7_4 = new WeatherConnection7_4();
        AsyncTask<String, String, String> result7_4 = weatherConnection7_4.execute("", "");

       


        try {
            String msg1_1 = result1_1.get();
            textView1_1.setText(msg1_1.toString());
            String msg1_2 = result1_2.get();
            textView1_2.setText(msg1_2.toString());
            String msg1_3 = result1_3.get();
            textView1_3.setText(msg1_3.toString());
            String msg1_4 = result1_4.get();
            textView1_4.setText(msg1_4.toString());

            String msg2_1 = result2_1.get();
            textView2_1.setText(msg2_1.toString());
            String msg2_2 = result2_2.get();
            textView2_2.setText(msg2_2.toString());
            String msg2_3 = result2_3.get();
            textView2_3.setText(msg2_3.toString());
            String msg2_4 = result2_4.get();
            textView2_4.setText(msg2_4.toString());

            String msg3_1 = result3_1.get();
            textView3_1.setText(msg3_1.toString());
            String msg3_2 = result3_2.get();
            textView3_2.setText(msg3_2.toString());
            String msg3_3 = result3_3.get();
            textView3_3.setText(msg3_3.toString());
            String msg3_4 = result3_4.get();
            textView3_4.setText(msg3_4.toString());

            String msg4_1 = result4_1.get();
            textView4_1.setText(msg4_1.toString());
            String msg4_2 = result4_2.get();
            textView4_2.setText(msg4_2.toString());
            String msg4_3 = result4_3.get();
            textView4_3.setText(msg4_3.toString());
            String msg4_4 = result4_4.get();
            textView4_4.setText(msg4_4.toString());

            String msg5_1 = result5_1.get();
            textView5_1.setText(msg5_1.toString());
            String msg5_2 = result5_2.get();
            textView5_2.setText(msg5_2.toString());
            String msg5_3 = result5_3.get();
            textView5_3.setText(msg5_3.toString());
            String msg5_4 = result5_4.get();
            textView5_4.setText(msg5_4.toString());

            String msg6_1 = result6_1.get();
            textView6_1.setText(msg6_1.toString());
            String msg6_2 = result6_2.get();
            textView6_2.setText(msg6_2.toString());
            String msg6_3 = result6_3.get();
            textView6_3.setText(msg6_3.toString());
            String msg6_4 = result6_4.get();
            textView6_4.setText(msg6_4.toString());

            String msg7_1 = result7_1.get();
            textView7_1.setText(msg7_1.toString());
            String msg7_2 = result7_2.get();
            textView7_2.setText(msg7_2.toString());
            String msg7_3 = result7_3.get();
            textView7_3.setText(msg7_3.toString());
            String msg7_4 = result7_4.get();
            textView7_4.setText(msg7_4.toString());

        } catch (Exception e) {
        }

    }

    // 네트워크 작업은 AsyncTask 를 사용해야 한다
    public class WeatherConnection1_1 extends AsyncTask<String, String, String> {
        //백그라운드작업
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_date]");
                Element targetElement = elements.get(1);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection1_2 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(2);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection1_3 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(3);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection1_4 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_temperature]");
                Element targetElement = elements.get(1);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public class WeatherConnection2_1 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_date]");
                Element targetElement = elements.get(2);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection2_2 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(4);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection2_3 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(5);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection2_4 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_temperature]");
                Element targetElement = elements.get(2);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public class WeatherConnection3_1 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_date]");
                Element targetElement = elements.get(3);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection3_2 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(6);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection3_3 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(7);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection3_4 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_temperature]");
                Element targetElement = elements.get(3);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public class WeatherConnection4_1 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_date]");
                Element targetElement = elements.get(4);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection4_2 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(8);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection4_3 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(9);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection4_4 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_temperature]");
                Element targetElement = elements.get(4);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public class WeatherConnection5_1 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_date]");
                Element targetElement = elements.get(5);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection5_2 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(10);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection5_3 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(11);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection5_4 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_temperature]");
                Element targetElement = elements.get(5);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public class WeatherConnection6_1 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_date]");
                Element targetElement = elements.get(6);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection6_2 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(12);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection6_3 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(13);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection6_4 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_temperature]");
                Element targetElement = elements.get(6);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public class WeatherConnection7_1 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_date]");
                Element targetElement = elements.get(7);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection7_2 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(14);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection7_3 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("span[class=weather_inner]");
                Element targetElement = elements.get(15);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class WeatherConnection7_4 extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String path = "https://weather.naver.com/today/";
                Document document = Jsoup.connect(path).get();
                Elements elements = document.select("div[class=cell_temperature]");
                Element targetElement = elements.get(7);
                String text = targetElement.text();
                return text;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    
}