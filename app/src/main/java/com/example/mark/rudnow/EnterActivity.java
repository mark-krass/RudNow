package com.example.mark.rudnow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class EnterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnEnter, R.id.btnReg})
    protected void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnEnter:
                startActivity(new Intent(EnterActivity.this, ProfileActivity.class));
                break;
            case R.id.btnReg:
                startActivity(new Intent(EnterActivity.this, Registration.class));
                break;
        }
    }
}
