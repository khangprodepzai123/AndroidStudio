package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Item5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item5);

        TextView txtTitle = findViewById(R.id.txtTitle);
        TextView txtTime = findViewById(R.id.txtTime);
        ImageView imgThumb = findViewById(R.id.imgThumb);

        String title = getIntent().getStringExtra("title");
        String time = getIntent().getStringExtra("time");
        int imageResId = getIntent().getIntExtra("imageResId", 0);

        txtTitle.setText(title);
        txtTime.setText(time);
        imgThumb.setImageResource(imageResId);
    }
}
