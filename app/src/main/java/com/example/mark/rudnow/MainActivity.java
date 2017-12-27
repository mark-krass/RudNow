package com.example.mark.rudnow;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static int TIME_OUT = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                startActivity(new Intent(MainActivity.this, EnterActivity.class));
                finish();
            }
        }, TIME_OUT);
    }
}
