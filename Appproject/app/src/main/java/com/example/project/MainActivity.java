package com.example.project;

import android.Manifest;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private Button btnmap;
    private Button newsbtn;
    private Button singbtn;
    private Button weatherbtn;
    private Button micbtn;
    private Button stretchbtn;
    private Button emergencybtn;
    private Button alarmbtn;
    private Button sportsbtn;
    private Button setbtn;
    private SpeechRecognizer mRecognizer;

    final int PERMISSION = 1;
    static final int SMS_RECEIVE_PERMISSON=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= 23) {
            //퍼미션 체크
            ActivityCompat.requestPermissions(this, new String[]{ android.Manifest.permission.INTERNET,
                    Manifest.permission.RECORD_AUDIO }, PERMISSION);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            //퍼미션 체크
            ActivityCompat.requestPermissions(this, new String[]{ Manifest.permission.SEND_SMS}, PERMISSION);
        }

        micbtn = (Button) findViewById(R.id.micbtn);


        //RecognizerIntent 객체 생성
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE,getPackageName());
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ko-KR");

        micbtn.setOnClickListener(v -> {
            // - 객체에 Context와 listener를 할당한 후 실행
            mRecognizer = SpeechRecognizer.createSpeechRecognizer(this);
            mRecognizer.setRecognitionListener(listener);
            mRecognizer.startListening(intent);
        });

//      위치를 보여주기 위한 버튼 활성화
        btnmap = (Button) findViewById(R.id.mapbtn);
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mapActivity.class);
                startActivity(intent);
            }
        });

        //뉴스를 위한 버튼 활성화
        newsbtn = (Button) findViewById(R.id.newsbtn);
        newsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(intent);//엑티비티 이동
            }
        });
        //노래를 위한 버튼 활성화
        singbtn = (Button) findViewById(R.id.singbtn);
        singbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SingActivity.class);
                startActivity(intent);//엑티비티 이동
            }
        });

        //날씨를 위한 버튼 활성화
        weatherbtn = (Button) findViewById(R.id.weatherbtn);
        weatherbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WeatherActivity.class);
                startActivity(intent);
            }
        });

        //스트레칭을 위한 버튼 활성화
        stretchbtn = (Button)findViewById(R.id.stretchbtn);
        stretchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,StretchMainActivity.class);
                startActivity(intent);//엑티비티 이동
            }
        });

        //긴급전화 버튼 활성화
        emergencybtn = (Button)findViewById(R.id.emergencybtn);
        emergencybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((SetActivity)SetActivity.context).send_sms();
                Intent intent = new Intent(MainActivity.this,CallMainActivity.class);
                startActivity(intent);//엑티비티 이동
            }
        });

        //알람 버튼 활성화
        alarmbtn = (Button)findViewById(R.id.alarmbtn);
        alarmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AlarmMainActivity.class);
                startActivity(intent);//엑티비티 이동
            }
        });

        //운동 버튼 활성화
        sportsbtn = (Button)findViewById(R.id.sportsbtn);
        sportsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PedometerActivity.class);
               startActivity(intent);//엑티비티 이동
            }
        });

        //설정 버튼 활성화
        setbtn = (Button)findViewById(R.id.setbtn);
        setbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SetActivity.class);
                startActivity(intent);//엑티비티 이동
            }
        });
    }

    private RecognitionListener listener = new RecognitionListener() {
        @Override
        public void onReadyForSpeech(Bundle params) {
            Toast.makeText(getApplicationContext(), "음성인식을 시작합니다.", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onBeginningOfSpeech() {
        }

        @Override
        public void onRmsChanged(float rmsdB) {
        }

        @Override
        public void onBufferReceived(byte[] buffer) {
        }

        @Override
        public void onEndOfSpeech() {
        }

        @Override
        public void onError(int error) {
            String message;
            switch (error) {
                case SpeechRecognizer.ERROR_AUDIO:
                    message = "오디오 에러";
                    break;
                case SpeechRecognizer.ERROR_CLIENT:
                    message = "클라이언트 에러";
                    break;
                case SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS:
                    message = "퍼미션 없음";
                    break;
                case SpeechRecognizer.ERROR_NETWORK:
                    message = "네트워크 에러";
                    break;
                case SpeechRecognizer.ERROR_NETWORK_TIMEOUT:
                    message = "네트웍 타임아웃";
                    break;
                case SpeechRecognizer.ERROR_NO_MATCH:
                    message = "찾을 수 없음";
                    break;
                case SpeechRecognizer.ERROR_RECOGNIZER_BUSY:
                    message = "RECOGNIZER가 바쁨";
                    break;
                case SpeechRecognizer.ERROR_SERVER:
                    message = "서버가 이상함";
                    break;
                case SpeechRecognizer.ERROR_SPEECH_TIMEOUT:
                    message = "말하는 시간초과";
                    break;
                default:
                    message = "알 수 없는 오류임";
                    break;
            }

            Toast.makeText(getApplicationContext(), "에러가 발생하였습니다. : " + message, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onResults(Bundle results) {
            // 말을 하면 ArrayList에 단어를 넣고 textView에 단어를 이어줍니다.
            ArrayList<String> matches = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
            for (int i = 0; i < matches.size(); i++) {
                if (matches.get(i).equals("위치")) {
                    Intent intent = new Intent(getApplicationContext(), mapActivity.class);
                    startActivity(intent);
                }
                else if (matches.get(i).equals("날씨")) {
                    Intent intent = new Intent(getApplicationContext(), WeatherActivity.class);
                    startActivity(intent);
                }
                else if (matches.get(i).equals("뉴스")) {
                    Intent intent = new Intent(getApplicationContext(), NewsActivity.class);
                    startActivity(intent);
                }
                else if (matches.get(i).equals("운동")) {
                    Intent intent = new Intent(getApplicationContext(),PedometerActivity.class);
                    startActivity(intent);
                }
                else if (matches.get(i).equals("스트레칭")) {
                    Intent intent = new Intent(getApplicationContext(), StretchMainActivity.class);
                    startActivity(intent);
                }
                else if (matches.get(i).equals("노래")) {
                    Intent intent = new Intent(getApplicationContext(), SingActivity.class);
                    startActivity(intent);
                }
                else if (matches.get(i).equals("긴급")) {
                    ((SetActivity)SetActivity.context).send_sms();
                    Intent intent = new Intent(getApplicationContext(), CallMainActivity.class);
                    startActivity(intent);
                }
                else if (matches.get(i).equals("알람")) {
                    Intent intent = new Intent(getApplicationContext(), AlarmMainActivity.class);
                    startActivity(intent);
                }
                else if (matches.get(i).equals("설정")) {
                    Intent intent = new Intent(getApplicationContext(), SetActivity.class);
                    startActivity(intent);
                }
            }
        }

        @Override
        public void onPartialResults(Bundle partialResults) {
        }

        @Override
        public void onEvent(int eventType, Bundle params) {
        }
    };

}