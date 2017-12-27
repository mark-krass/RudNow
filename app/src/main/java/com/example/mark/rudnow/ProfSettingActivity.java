package com.example.mark.rudnow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfSettingActivity extends AppCompatActivity {

    @BindView(R.id.edNameReal)
    protected EditText edName;

    @BindView(R.id.edSur)
    protected EditText edSur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_setting);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSave)
    protected void save(View v){
        switch (v.getId()) {
            case R.id.btnSave:
                Intent intent = new Intent(this, ProfileActivity.class);
                intent.putExtra("name", edName.getText().toString());
                intent.putExtra("sur", edSur.getText().toString());
                startActivity(intent);
                break;
            case R.id.btnPhoto:
                break;
        }
    }
}
