package com.jo.testalivideo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.aliyun.svideo.recorder.activity.AlivcSvideoRecordActivity;
import com.aliyun.svideo.recorder.bean.AlivcRecordInputParam;

public class MainActivity extends AppCompatActivity {
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Button button = findViewById(R.id.button);
        view = findViewById(R.id.view);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRecord(view);
            }
        });
    }

    public void startRecord(View view) {
        AlivcRecordInputParam recordParam = new AlivcRecordInputParam.Builder()
                .build();
        AlivcSvideoRecordActivity.startRecord(this, recordParam);
    }
}