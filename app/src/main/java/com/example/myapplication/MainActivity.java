package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent iHome=new Intent(MainActivity.this,splasescreen.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivities(new Intent[]{iHome});
                finish();
            }
        },4000);{



        }
    }
}