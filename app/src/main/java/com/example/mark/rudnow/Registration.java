package com.example.mark.rudnow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Registration extends AppCompatActivity {

    @BindView(R.id.edNameR)
    protected EditText edNameR;

    @BindView(R.id.edPassR)
    protected EditText edPassR;

    @BindView(R.id.cBox1)
    protected CheckBox cBox1;

    @BindView(R.id.cBox2)
    protected CheckBox cBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);
    }

    private final String LOG_TAG = "myLogs";

    @OnClick(R.id.btnRegR)
    protected void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRegR:
                Log.d(LOG_TAG, edNameR.getText().toString());
                //if((edNameR.getText().toString() != "") && (edPassR.getText().toString() != "") && (cBox1.isChecked()) && (cBox2.isChecked()))
                if(cBox2.isChecked() && (cBox1.isChecked()))
                startActivity(new Intent(Registration.this, ProfSettingActivity.class));
                else
                    Toast.makeText(this, "Примите лицензионное соглашение", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
