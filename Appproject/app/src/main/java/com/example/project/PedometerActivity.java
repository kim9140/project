package com.example.project;

import android.Manifest;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class PedometerActivity extends AppCompatActivity implements SensorEventListener {

    TextView tv_sensor,cal,distance;
    SensorManager sm;
    Sensor sensor_step_detector;

    int steps = 0;
    float dis = 0;
    float cals = 0;
    final int PERMISSION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedometer);

        if (Build.VERSION.SDK_INT >= 23) {
            //퍼미션 체크
            ActivityCompat.requestPermissions(this, new String[]{ Manifest.permission.ACTIVITY_RECOGNITION}, PERMISSION);
        }

        distance = (TextView)findViewById(R.id.DISTANCE);
        distance.setText("0");
        cal = (TextView)findViewById(R.id.CALORIES);
        cal.setText("0");
        tv_sensor = (TextView)findViewById(R.id.setp_count);        // 텍스트뷰 인식
        tv_sensor.setText("0"); // 걸음 수 초기화 및 출력
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);   // 센서 매니저 생성
        sensor_step_detector = sm.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR);  // 스템 감지 센서 등록

    }
    public void sener(){
        tv_sensor = (TextView)findViewById(R.id.setp_count);        // 텍스트뷰 인식
        tv_sensor.setText("0"); // 걸음 수 초기화 및 출력
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);   // 센서 매니저 생성
        sensor_step_detector = sm.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR);  // 스템 감지 센서 등록
    }

    @Override
    protected void onResume(){
        super.onResume();
        sm.registerListener(this, sensor_step_detector, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause(){
        super.onPause();
        sm.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy){

    }
    // 센서값이 변할때
    @Override
    public void onSensorChanged(SensorEvent event){
        // 센서 유형이 스텝감지 센서인 경우 걸음수 +1
        switch (event.sensor.getType()){
            case Sensor.TYPE_STEP_DETECTOR:
                tv_sensor.setText("" + (++steps));
                break;
        }
        //  칼로리 구하기
        switch (event.sensor.getType()){
            case Sensor.TYPE_STEP_DETECTOR:
                cal.setText("" + (++cals/20) + "cal");
                break;
        }
        //  거리 구하기
        switch (event.sensor.getType()){
            case Sensor.TYPE_STEP_DETECTOR:
                distance.setText("" + (++dis/1000) + "km");
                break;
        }

    }

}
