package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ActivityItem> list = new ArrayList<>();
        list.add(new ActivityItem("Tiêu đề hoạt động 1", "Thời gian: 10/03/2025", R.drawable.ic_launcher_foreground));
        list.add(new ActivityItem("Tiêu đề hoạt động 2", "Thời gian: 20/04/2025", R.drawable.ic_launcher_foreground));
        list.add(new ActivityItem("Tiêu đề hoạt động 3", "Thời gian: 01/05/2025", R.drawable.ic_launcher_foreground));

        ActivityAdapter adapter = new ActivityAdapter(this, list);
        recyclerView.setAdapter(adapter);
    }
}
