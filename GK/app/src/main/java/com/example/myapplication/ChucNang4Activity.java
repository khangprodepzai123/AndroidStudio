package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class ChucNang4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang4);

        RecyclerView recycler = findViewById(R.id.recyclerHD);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        List<HoatDong> ds = new ArrayList<>();
        ds.add(new HoatDong("Hoạt động 1", "20/10/2025"));
        ds.add(new HoatDong("Hoạt động 2", "21/10/2025"));
        ds.add(new HoatDong("Hoạt động 3", "22/10/2025"));

        HoatDongAdapter adapter = new HoatDongAdapter(this, ds);
        recycler.setAdapter(adapter);
    }
}
