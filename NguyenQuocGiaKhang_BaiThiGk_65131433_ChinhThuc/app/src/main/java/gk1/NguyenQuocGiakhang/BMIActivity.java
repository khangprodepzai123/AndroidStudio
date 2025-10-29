package gk1.NguyenQuocGiakhang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {

    private EditText edthei, edtwei;
    private Button btnTinh, btnToggleGk, btnToggleCk;
    private TextView tvKetQua;
    private boolean isGkVisible = false;
    private boolean isCkVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);

        // Ánh xạ view
        edthei = findViewById(R.id.height);
        edtwei = findViewById(R.id.weight);
        btnTinh = findViewById(R.id.btnTinh);
        tvKetQua = findViewById(R.id.tvKetQua);
        btnToggleGk = findViewById(R.id.btnToggleGk);
        btnToggleCk = findViewById(R.id.btnToggleCk);

        btnToggleGk.setOnClickListener(v -> {
            if (isGkVisible) {
                edthei.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
                btnToggleGk.setText("👁");
            } else {
                edthei.setInputType(InputType.TYPE_CLASS_NUMBER);
                btnToggleGk.setText("🙈");
            }
            isGkVisible = !isGkVisible;
            edthei.setSelection(edthei.getText().length());
        });

        btnToggleCk.setOnClickListener(v -> {
            if (isCkVisible) {
                edtwei.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
                btnToggleCk.setText("👁");
            } else {
                edtwei.setInputType(InputType.TYPE_CLASS_NUMBER);
                btnToggleCk.setText("🙈");
            }
            isCkVisible = !isCkVisible;
            edtwei.setSelection(edtwei.getText().length());
        });

        btnTinh.setOnClickListener(v -> {
            try {
                double hei = Double.parseDouble(edthei.getText().toString());
                double wei = Double.parseDouble(edtwei.getText().toString());
                double bmi = wei / (hei * hei) * 10000;
                tvKetQua.setText("BMI : " + bmi);
            } catch (Exception e) {
                tvKetQua.setText("Vui lòng nhập đủ đúng!");
            }
        });
    }

    public void vemanhinhchinh(View v) {
        Intent intent = new Intent(BMIActivity.this, MainActivity.class);
        startActivity(intent);
    }
}