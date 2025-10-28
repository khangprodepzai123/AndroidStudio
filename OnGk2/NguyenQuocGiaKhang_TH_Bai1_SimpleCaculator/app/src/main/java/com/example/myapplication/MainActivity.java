package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Tong(View view){
        EditText edita = findViewById(R.id.inpA);
        EditText editb = findViewById(R.id.inpB);
        EditText editc = findViewById(R.id.outC);

        String stra= edita.getText().toString();
        String strb= editb.getText().toString();

        int a = Integer.parseInt(stra);
        int b = Integer.parseInt(strb);

        int tong = a + b;
        String strtong = String.valueOf(tong);
        editc.setText(strtong);


    }
    public void Hieu(View view){
        EditText edita = findViewById(R.id.inpA);
        EditText editb = findViewById(R.id.inpB);
        EditText editc = findViewById(R.id.outC);

        String stra= edita.getText().toString();
        String strb= editb.getText().toString();

        int a = Integer.parseInt(stra);
        int b = Integer.parseInt(strb);

        int hieu = a - b;
        String strhieu = String.valueOf(hieu);
        editc.setText(hieu);
    }
    public void Tich(View view){
        EditText edita = findViewById(R.id.inpA);
        EditText editb = findViewById(R.id.inpB);
        EditText editc = findViewById(R.id.outC);

        String stra= edita.getText().toString();
        String strb= editb.getText().toString();

        int a = Integer.parseInt(stra);
        int b = Integer.parseInt(strb);

        int tich = a * b;
        String strtich = String.valueOf(tich);
        editc.setText(tich);
    }

    public void Phan(View view){
        EditText edita = findViewById(R.id.inpA);
        EditText editb = findViewById(R.id.inpB);
        EditText editc = findViewById(R.id.outC);

        String stra= edita.getText().toString();
        String strb= editb.getText().toString();

        int a = Integer.parseInt(stra);
        int b = Integer.parseInt(strb);

        int phan = a / b;
        String strphan = String.valueOf(phan);
        editc.setText(phan);
    }
}