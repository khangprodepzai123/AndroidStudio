package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText edtGk, edtCk;
    private Button btnTinh, btnToggleGk, btnToggleCk;
    private TextView tvKetQua;
    private boolean isGkVisible = false;
    private boolean isCkVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Ánh xạ view
        edtGk = findViewById(R.id.edtGk);
        edtCk = findViewById(R.id.edtCk);
        btnTinh = findViewById(R.id.btnTinh);
        tvKetQua = findViewById(R.id.tvKetQua);
        btnToggleGk = findViewById(R.id.btnToggleGk);
        btnToggleCk = findViewById(R.id.btnToggleCk);

        btnToggleGk.setOnClickListener(v -> {
            if (isGkVisible) {
                edtGk.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
                btnToggleGk.setText("👁");
            } else {
                edtGk.setInputType(InputType.TYPE_CLASS_NUMBER);
                btnToggleGk.setText("🙈");
            }
            isGkVisible = !isGkVisible;
            edtGk.setSelection(edtGk.getText().length());
        });

        btnToggleCk.setOnClickListener(v -> {
            if (isCkVisible) {
                edtCk.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
                btnToggleCk.setText("👁");
            } else {
                edtCk.setInputType(InputType.TYPE_CLASS_NUMBER);
                btnToggleCk.setText("🙈");
            }
            isCkVisible = !isCkVisible;
            edtCk.setSelection(edtCk.getText().length());
        });

        // Nút tính điểm TB
        btnTinh.setOnClickListener(v -> {
            try {
                double gk = Double.parseDouble(edtGk.getText().toString());
                double ck = Double.parseDouble(edtCk.getText().toString());
                double tb = (gk * 0.5) + (ck * 0.5);
                tvKetQua.setText("Điểm trung bình: " + tb);
            } catch (Exception e) {
                tvKetQua.setText("Vui lòng nhập đủ điểm!");
            }
        });
    }

    public void vemanhinhchinh(View v) {
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}
