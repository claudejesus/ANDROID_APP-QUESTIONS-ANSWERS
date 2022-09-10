package com.example.quizandroidapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewBtn = findViewById(R.id.startNewQuizBtn);
        final TextView correctAnswer = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswers = findViewById(R.id.incorrectAnswers);

        final int getcorrectAnswers = getIntent().getStringExtra( name: "correct", defaultValue: 0);
        final int getIncorrectAnnswers = getIntent().getIntExtra( name: "incorrect", defaultValue: 0);

        correctAnswer.setText(String.valueOf(getcorrectAnswers));
        incorrectAnswers.setText(String.valueOf(getIncorrectAnnswers));

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( createPackageContext: QuizResults.this, MainActivity.class));
                finish();
            }
        });
    }
    public void onBackPressed() {
        super.onBackPressed();
    }
}