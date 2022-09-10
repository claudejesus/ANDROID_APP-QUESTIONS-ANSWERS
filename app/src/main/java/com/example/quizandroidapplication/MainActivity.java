package com.example.quizandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  StringselectedTopicName = "" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout php = findViewById(R.id.phpLayout);
        final  LinearLayout html = findViewById(R.id.htmlLayout);
        final LinearLayout android =findViewById(R.id.androidLayout);

        final Button startBtn = findViewById(R.id.StartQuizBtn);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view) {

                String selectedTopicName = "java";

                java.setBackgroundResource(R.drawable.round_back_white_stroke10) ;

                php.setBackgroundResource(R.drawable.round_back_white_stroke10);
                html.setBackgroundResource(R.drawable.round_back_white_stroke10);
                android.setBackgroundResource(R.drawable.round_back_white_stroke10);
            }
        });

        php.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                String selectedTopicName = "php";

                php.setBackgroundResource(R.drawable.round_back_white_stroke10) ;

                java.setBackgroundResource(R.drawable.round_back_white_stroke10);
                html.setBackgroundResource(R.drawable.round_back_white_stroke10);
                android.setBackgroundResource(R.drawable.round_back_white_stroke10);
            }
        });
        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedTopicName = "html";

                html.setBackgroundResource(R.drawable.round_back_white_stroke10) ;

                java.setBackgroundResource(R.drawable.round_back_white_stroke10);
                php.setBackgroundResource(R.drawable.round_back_white_stroke10);
                android.setBackgroundResource(R.drawable.round_back_white_stroke10);

            }
        });
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedTopicName = "android";

                android.setBackgroundResource(R.drawable.round_back_white_stroke10) ;

                php.setBackgroundResource(R.drawable.round_back_white_stroke10);
                java.setBackgroundResource(R.drawable.round_back_white_stroke10);
                html.setBackgroundResource(R.drawable.round_back_white_stroke10);

            }
        });
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedTopicName;
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,text "please select the topic", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(action: MainActivity.this, QuizActivity.class);
                    intent.putExtra(name: "selectedTopic", selectedTopicName);
                    StartActivity(intent);
                }
            }
        });
    }
}

