package com.tao.tlog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tao.tlog.log.TLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TLog.init(true);

        TLog.e("test");
    }
}
