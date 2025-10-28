package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn2 = findViewById(R.id.btnChucNang2);
        Button btn3 = findViewById(R.id.btnChucNang3);
        Button btn4 = findViewById(R.id.btnChucNang4);
        //Button btnAbout = findViewById(R.id.btnAbout);

        btn2.setOnClickListener(v -> startActivity(new Intent(this, ChucNang2Activity.class)));
        btn3.setOnClickListener(v -> startActivity(new Intent(this, ChucNang3Activity.class)));
        btn4.setOnClickListener(v -> startActivity(new Intent(this, ChucNang4Activity.class)));
        //btnAbout.setOnClickListener(v -> startActivity(new Intent(this, AboutMeActivity.class)));
    }
}
