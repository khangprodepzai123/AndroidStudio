package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Item4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setTextSize(20);
        tv.setPadding(20,20,20,20);
        tv.setText("Chi tiết hoạt động: " + getIntent().getStringExtra("hoatdong"));
        setContentView(tv);
    }
}
