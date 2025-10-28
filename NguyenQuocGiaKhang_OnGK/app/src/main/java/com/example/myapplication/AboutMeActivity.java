package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.ImageView;

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        // Ánh xạ View
        ImageView imgAvatar = findViewById(R.id.imgAvatar);
        TextView txtName = findViewById(R.id.txtName);
        TextView txtStudentId = findViewById(R.id.txtStudentId);
        TextView txtClass = findViewById(R.id.txtClass);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtHobby = findViewById(R.id.txtHobby);

        // Gán dữ liệu (bạn có thể sửa lại theo thông tin thật của mình)
        txtName.setText("Họ và tên: Nguyễn Văn Khang");
        txtStudentId.setText("MSSV: 12345678");
        txtClass.setText("Lớp: CNTT - K17");
        txtEmail.setText("Email: khang@example.com");
        txtHobby.setText("Sở thích: Lập trình Android, nghe nhạc, đá bóng");
    }
}
