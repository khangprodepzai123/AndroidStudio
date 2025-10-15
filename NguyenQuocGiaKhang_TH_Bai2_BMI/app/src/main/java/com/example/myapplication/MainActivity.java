package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Switch switchasian;
    private int c = 0;


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

    public void TinhBMI(View view ){

        EditText ehei = findViewById(R.id.hei);
        EditText ewei = findViewById(R.id.wei);
        EditText ebmi = findViewById(R.id.bmi);
        EditText ecom = findViewById(R.id.com);

        String strhei =ehei.getText().toString();
        String strwei =ewei.getText().toString();

        double a = Double.parseDouble(strhei);
        double b = Double.parseDouble(strwei);

        switchasian = findViewById(R.id.asia);
        switchasian.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                c = 1;
            }else{
                c = 2;
            }
        });
        double d = b / (a*a);
        String outbmi =String.valueOf(d);
        ebmi.setText(outbmi);

        String classification;
        if(d < 18.50 && c==2){
            classification = "Underweight";

        }else if(d>=18.50 && d< 24.99){
            classification = "Normalweight";
        }else if(d>=25.00 && d<29.99){
            classification = "OverWeight";
        }else{
            classification = "Obese";

        }

        if(d < 17.50 && c==1){
            classification = "Underweight";

        }else if(d>=17.50 && d< 22.99){
            classification = "Normalweight";
        }else if(d>=23.00 && d<27.99){
            classification = "OverWeight";
        }else{
            classification = "Obese";

        }

        ecom.setText(classification);








    }
}