package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    ListView listView;
    String[] subjects = {
            "Tin học đại cương",
            "Lập trình Java",
            "Phát triển Ứng dụng web",
            "Khai phá dữ liệu lớn",
            "Kinh tế chính trị Mác - Lê nin",
            "..."
    };

    String[] descriptions = {
            "Môn học cung cấp kiến thức nền tảng về công nghệ thông tin, máy tính, phần mềm, phần cứng và mạng cơ bản.",
            "Môn học giới thiệu lập trình hướng đối tượng, các khái niệm class, object, kế thừa, đa hình, và phát triển ứng dụng bằng Java.",
            "Học cách xây dựng website động bằng HTML, CSS, JavaScript, PHP hoặc framework web hiện đại.",
            "Tìm hiểu các kỹ thuật xử lý dữ liệu lớn (Big Data), khai phá dữ liệu, và ứng dụng học máy.",
            "Cung cấp kiến thức nền tảng về triết học và kinh tế chính trị Mác - Lênin, vận dụng trong phân tích kinh tế xã hội.",
            "Các môn học khác trong chương trình."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        listView = findViewById(R.id.listView4);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                subjects
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = subjects[position];
                String desc = descriptions[position];

                Toast.makeText(MainActivity4.this, "Bạn chọn: " + selected, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity4.this, Item4Activity.class);
                intent.putExtra("subject_name", selected);
                intent.putExtra("subject_desc", desc);
                startActivity(intent);
            }
        });
    }
}
