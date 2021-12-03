package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StretchMainActivity extends AppCompatActivity {
    private Button neckBtn,armBtn,waistBtn,legBtn,footBtn,kneeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stretchingactivity_main);

        neckBtn = (Button)findViewById(R.id.neckBtn);
        neckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NeckActivity.class);
                startActivity(intent);

            }
        });
        armBtn = (Button)findViewById(R.id.armBtn);
        armBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ArmActivity.class);
                startActivity(intent);
            }
        });

        waistBtn = (Button)findViewById(R.id.waistBtn);
        waistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WaistActivity.class);
                startActivity(intent);
            }
        });

        legBtn = (Button)findViewById(R.id.legBtn);
        legBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LegActivity.class);
                startActivity(intent);
            }
        });

        footBtn = (Button)findViewById(R.id.footBtn);
        footBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FootActivity.class);
                startActivity(intent);
            }
        });
        kneeBtn = (Button)findViewById(R.id.kneeBtn);
        kneeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),KneeActivity.class);
                startActivity(intent);
            }
        });
    }
}
