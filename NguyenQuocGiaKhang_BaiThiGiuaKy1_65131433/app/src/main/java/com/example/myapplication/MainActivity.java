package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Hàm này sẽ được gọi khi bấm nút trong XML
    public void bmi(View v) {
        Intent intent = new Intent(MainActivity.this, BMIActivity.class);
        startActivity(intent);
    }


}
