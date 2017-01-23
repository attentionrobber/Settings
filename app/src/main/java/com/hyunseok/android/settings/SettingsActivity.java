package com.hyunseok.android.settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // findviewById로 뷰 세팅
        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textview);

        //버튼에 setOnlickListener 달기
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button :
                tv.setText(BuildConfig.MYURL);
        }
    }
}
