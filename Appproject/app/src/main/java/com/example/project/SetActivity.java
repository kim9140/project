package com.example.project;

import android.content.Context;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SetActivity extends AppCompatActivity {
    Button set_number;
    EditText input_phone_number;
    public String phone_number = "";
    private String sms = "★☆긴급알람메세지☆★" +
            "사용자가 긴급전화를 사용하였습니다." +
            "문제발생가능성이 있으니 " +
            "본인에게 연락바랍니다.";
    public static Context context;
    TextView number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        set_number = (Button) findViewById(R.id.set_number);
        input_phone_number = (EditText) findViewById(R.id.input_phone_number);
        number = (TextView) findViewById(R.id.number);

        //버튼 클릭이벤트
        set_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone_number = input_phone_number.getText().toString();
                number.setText("보호자 :"+phone_number);
            }
        });
    }
    public void send_sms(){
        try {
            //전송
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phone_number, null, sms, null, null);
            Toast.makeText(getApplicationContext(), "메세지 전송 완료!", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "전송 오류!", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}
