package com.example.cravrrkakhaanapeena.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.cravrrkakhaanapeena.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after delay
                finish();
                startActivity(new Intent(MainActivity.this,AddOrderActivity.class));
            }
        }, 3000);
    }

}