package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    EditText edtMonth, edtYear;
    TextView txtResult;

    // Mốc đúng: Chiến dịch Hồ Chí Minh - Toàn thắng: tháng 4 năm 1975
    final int CORRECT_MONTH = 4;
    final int CORRECT_YEAR = 1975;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edtMonth = findViewById(R.id.edtMonth);
        edtYear = findViewById(R.id.edtYear);
        txtResult = findViewById(R.id.txtResult);
    }

    public void kiemTra(View view) {
        try {
            int month = Integer.parseInt(edtMonth.getText().toString().trim());
            int year = Integer.parseInt(edtYear.getText().toString().trim());

            if (month == CORRECT_MONTH && year == CORRECT_YEAR) {
                txtResult.setText("✅ Chính xác! Chiến dịch Hồ Chí Minh toàn thắng tháng 4 năm 1975.");
                Toast.makeText(this, "Đúng rồi!", Toast.LENGTH_SHORT).show();
            } else {
                txtResult.setText("❌ Sai rồi! Đáp án đúng là tháng 4 năm 1975.");
                Toast.makeText(this, "Sai rồi!", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            txtResult.setText("⚠️ Vui lòng nhập đầy đủ và đúng định dạng!");
        }
    }
}
