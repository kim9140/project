package com.example.project;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class CallMainActivity extends AppCompatActivity {
    Button Btn112,Btn119,Btn122,Btn113,Btn125,Btn114;
    String tel = "tel:01012341234";
    Intent i; //시스템액티비티를 부를 Intent 참조변수
    private static final int REQUEST_CALL = 1;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.callmain_layout);
        Btn112 = (Button)findViewById(R.id.Btn112);
        Btn112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int REQUEST_PHONE_CALL= 1;
                uri= Uri.parse("tel:01012345678"); //전화와 관련된 Data는 'Tel:'으로 시작. 이후는 전화번호
                i = new Intent(Intent.ACTION_CALL,uri); //시스템 액티비티인 Dial Activity의 action값
                //권한 실행
                if (ContextCompat.checkSelfPermission(CallMainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CallMainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    startActivity(i);//액티비티 실행
                }





            }
        });
        Btn119 = (Button)findViewById(R.id.Btn119);
        Btn119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int REQUEST_PHONE_CALL= 1;
                uri= Uri.parse("tel:01012345678"); //전화와 관련된 Data는 'Tel:'으로 시작. 이후는 전화번호
                i = new Intent(Intent.ACTION_CALL,uri); //시스템 액티비티인 Dial Activity의 action값
                //권한 실행
                if (ContextCompat.checkSelfPermission(CallMainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CallMainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    startActivity(i);//액티비티 실행
                }





            }
        });

        Btn122 = (Button)findViewById(R.id.Btn122);
        Btn122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int REQUEST_PHONE_CALL= 1;
                uri= Uri.parse("tel:01012345678"); //전화와 관련된 Data는 'Tel:'으로 시작. 이후는 전화번호
                i = new Intent(Intent.ACTION_CALL,uri); //시스템 액티비티인 Dial Activity의 action값
                //권한 실행
                if (ContextCompat.checkSelfPermission(CallMainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CallMainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    startActivity(i);//액티비티 실행
                }





            }
        });

        Btn113 = (Button)findViewById(R.id.Btn113);
        Btn113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int REQUEST_PHONE_CALL= 1;
                uri= Uri.parse("tel:01012345678"); //전화와 관련된 Data는 'Tel:'으로 시작. 이후는 전화번호
                i = new Intent(Intent.ACTION_CALL,uri); //시스템 액티비티인 Dial Activity의 action값
                //권한 실행
                if (ContextCompat.checkSelfPermission(CallMainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CallMainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    startActivity(i);//액티비티 실행
                }





            }
        });

        Btn125 = (Button)findViewById(R.id.Btn125);
        Btn125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int REQUEST_PHONE_CALL= 1;
                uri= Uri.parse("tel:01012345678"); //전화와 관련된 Data는 'Tel:'으로 시작. 이후는 전화번호
                i = new Intent(Intent.ACTION_CALL,uri); //시스템 액티비티인 Dial Activity의 action값
                //권한 실행
                if (ContextCompat.checkSelfPermission(CallMainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CallMainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    startActivity(i);//액티비티 실행
                }





            }
        });

        Btn114 = (Button)findViewById(R.id.Btn114);
        Btn114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int REQUEST_PHONE_CALL= 1;
                uri= Uri.parse("tel:01012345678"); //전화와 관련된 Data는 'Tel:'으로 시작. 이후는 전화번호
                i = new Intent(Intent.ACTION_CALL,uri); //시스템 액티비티인 Dial Activity의 action값
                //권한 실행
                if (ContextCompat.checkSelfPermission(CallMainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CallMainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    startActivity(i);//액티비티 실행
                }





            }
        });





    }
}