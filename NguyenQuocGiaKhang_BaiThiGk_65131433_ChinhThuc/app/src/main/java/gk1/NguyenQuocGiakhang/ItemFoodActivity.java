package gk1.NguyenQuocGiakhang;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_food);

        TextView txtTitle = findViewById(R.id.txtTitle);
        TextView txtDescription = findViewById(R.id.txtDescription);
        Button btnBack = findViewById(R.id.btnBack);

        String subject = getIntent().getStringExtra("subject_name");
        String desc = getIntent().getStringExtra("subject_desc");

        txtTitle.setText(subject);
        txtDescription.setText(desc);

        // Xử lý nút quay lại
        btnBack.setOnClickListener(v -> finish());
    }
}
