package gk1.NguyenQuocGiakhang;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedicalQuizActivity extends AppCompatActivity {

    private TextView txtQuestion, txtScore;
    private Button btnA, btnB, btnC, btnD, btnNext;
    private int currentQuestion = 0;
    private int score = 0;

    private List<Question> questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_quiz);

        txtQuestion = findViewById(R.id.txtQuestion);
        txtScore = findViewById(R.id.txtScore);
        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);
        btnNext = findViewById(R.id.btnNext);

        loadQuestions();
        showQuestion();

        btnA.setOnClickListener(v -> checkAnswer(btnA));
        btnB.setOnClickListener(v -> checkAnswer(btnB));
        btnC.setOnClickListener(v -> checkAnswer(btnC));
        btnD.setOnClickListener(v -> checkAnswer(btnD));

        btnNext.setOnClickListener(v -> nextQuestion());
    }

    private void loadQuestions() {
        questionList = new ArrayList<>();
        questionList.add(new Question("Cơ quan nào trong cơ thể người chịu trách nhiệm lọc máu?",
                "Phổi", "Tim", "Thận", "Gan", "Thận"));
        questionList.add(new Question("Nhóm máu hiếm nhất là gì?",
                "A", "O", "B", "AB", "AB"));
        questionList.add(new Question("Vitamin nào giúp tăng cường thị lực?",
                "Vitamin A", "Vitamin C", "Vitamin D", "Vitamin B12", "Vitamin A"));
        questionList.add(new Question("Huyết áp bình thường của người trưởng thành là bao nhiêu?",
                "90/60", "120/80", "150/100", "180/120", "120/80"));
        questionList.add(new Question("Bệnh nào sau đây do virus gây ra?",
                "Cảm cúm", "Tiểu đường", "Loãng xương", "Ung thư", "Cảm cúm"));

        Collections.shuffle(questionList);
    }

    private void showQuestion() {
        if (currentQuestion >= questionList.size()) {
            txtQuestion.setText(" Hoàn thành quiz!\nĐiểm của bạn: " + score + "/" + questionList.size());
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnNext.setText("Chơi lại");
            btnNext.setOnClickListener(v -> resetGame());
            return;
        }

        Question q = questionList.get(currentQuestion);
        txtQuestion.setText(q.question);
        btnA.setText(q.optionA);
        btnB.setText(q.optionB);
        btnC.setText(q.optionC);
        btnD.setText(q.optionD);
        txtScore.setText("Điểm: " + score);
    }

    private void checkAnswer(Button selectedBtn) {
        Question q = questionList.get(currentQuestion);
        String answer = selectedBtn.getText().toString();

        if (answer.equals(q.correctAnswer)) {
            score++;
            Toast.makeText(this, "✅ Chính xác!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "❌ Sai rồi! Đáp án đúng là: " + q.correctAnswer, Toast.LENGTH_LONG).show();
        }

        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
    }

    private void nextQuestion() {
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        currentQuestion++;
        showQuestion();
    }

    private void resetGame() {
        score = 0;
        currentQuestion = 0;
        Collections.shuffle(questionList);
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnNext.setText("Câu tiếp");
        btnNext.setOnClickListener(v -> nextQuestion());
        showQuestion();
    }

    static class Question {
        String question, optionA, optionB, optionC, optionD, correctAnswer;

        Question(String q, String a, String b, String c, String d, String correct) {
            question = q;
            optionA = a;
            optionB = b;
            optionC = c;
            optionD = d;
            correctAnswer = correct;
        }
    }
}
