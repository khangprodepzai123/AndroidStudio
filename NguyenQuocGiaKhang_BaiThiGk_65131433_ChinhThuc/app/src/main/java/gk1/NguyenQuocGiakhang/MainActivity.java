package gk1.NguyenQuocGiakhang;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bmi(View v) {
        Intent intent = new Intent(MainActivity.this, BMIActivity.class);
        startActivity(intent);
    }
    public void food(View v) {
        Intent intent = new Intent(MainActivity.this, FoodActivity.class);
        startActivity(intent);
    }

    public void thuoc(View v) {
        Intent intent = new Intent(MainActivity.this, ThuocActivity.class);
        startActivity(intent);
    }


    public void aboutme(View v) {
        Intent intent = new Intent(MainActivity.this, AboutMeActivity.class);
        startActivity(intent);
    }


    public void quiz(View v) {
        Intent intent = new Intent(MainActivity.this, MedicalQuizActivity.class);
        startActivity(intent);
    }


}