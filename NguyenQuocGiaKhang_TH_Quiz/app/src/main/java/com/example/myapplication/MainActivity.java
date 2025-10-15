package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    TextView tvQuestion;
    Button btn1, btn2, btn3, btn4;
    int correctAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQuestion = findViewById(R.id.tvQuestion);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        generateQuestion();

        btn1.setOnClickListener(v -> checkAnswer(btn1));
        btn2.setOnClickListener(v -> checkAnswer(btn2));
        btn3.setOnClickListener(v -> checkAnswer(btn3));
        btn4.setOnClickListener(v -> checkAnswer(btn4));
    }

    private void generateQuestion() {
        Random rd = new Random();

        int a = rd.nextInt(50) + 1;
        int b = rd.nextInt(50) + 1;
        correctAnswer = a + b;

        if (correctAnswer >= 100) {
            generateQuestion();
            return;
        }

        tvQuestion.setText(a + " + " + b);

        int correctIndex = rd.nextInt(4);
        Button[] buttons = {btn1, btn2, btn3, btn4};

        int[] offsets = new int[3];
        for (int i = 0; i < 3; i++) {
            offsets[i] = rd.nextInt(5) + 1;
        }

        int j = 0;
        for (int i = 0; i < 4; i++) {
            if (i == correctIndex) {
                buttons[i].setText(String.valueOf(correctAnswer));
            } else {
                buttons[i].setText(String.valueOf(correctAnswer + offsets[j]));
                j++;
            }
        }
    }

    private void checkAnswer(Button btn) {
        int ans = Integer.parseInt(btn.getText().toString());
        if (ans == correctAnswer) {
            Toast.makeText(this, " Chính xác!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, " Sai rồi!", Toast.LENGTH_SHORT).show();
        }

        generateQuestion();
    }
}
