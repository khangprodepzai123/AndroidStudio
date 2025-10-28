package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Item3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setTextSize(20);
        tv.setPadding(20,20,20,20);
        tv.setText("Bạn đã chọn: " + getIntent().getStringExtra("monhoc"));
        setContentView(tv);
    }
}
