package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

public class ChucNang3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang3);

        String[] dsMon = {"Tin học đại cương", "Lập trình Java", "Phát triển Web", "Kinh tế chính trị"};

        ListView listView = findViewById(R.id.listMonHoc);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsMon);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String mon = dsMon[position];
            Intent i = new Intent(this, Item3Activity.class);
            i.putExtra("monhoc", mon);
            startActivity(i);
        });
    }
}
