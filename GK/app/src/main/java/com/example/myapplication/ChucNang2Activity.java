package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ChucNang2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang2);

        EditText edtGiuaKy = findViewById(R.id.edtGiuaKy);
        EditText edtCuoiKy = findViewById(R.id.edtCuoiKy);
        TextView tvKetQua = findViewById(R.id.tvKetQua);
        Button btnTinh = findViewById(R.id.btnTinhTB);

        btnTinh.setOnClickListener(v -> {
            try {
                double gk = Double.parseDouble(edtGiuaKy.getText().toString());
                double ck = Double.parseDouble(edtCuoiKy.getText().toString());
                double tb = gk * 0.5 + ck * 0.5;
                tvKetQua.setText("Điểm trung bình: " + tb);
            } catch (Exception e) {
                Toast.makeText(this, "Nhập sai định dạng!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
