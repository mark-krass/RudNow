package com.example.mark.rudnow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileActivity extends AppCompatActivity {

    @BindView(R.id.tName)
    protected TextView tName;

    @BindView(R.id.tSur)
    protected TextView tSur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String sur = intent.getStringExtra("sur");

        tName.setText(name);
        tSur.setText(sur);
    }
}
