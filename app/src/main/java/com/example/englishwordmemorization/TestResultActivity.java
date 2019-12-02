package com.example.englishwordmemorization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TestResultActivity extends AppCompatActivity {

    LinearLayout layout;
    TextView answerPercentage;
    TextView testNum;
    TextView guessNum;
    TextView wrongNum;

    TextView reTest;
    TextView reMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_result);

        layout = findViewById(R.id.test_result_layout);
        answerPercentage = findViewById(R.id.answer_percentage);
        testNum = findViewById(R.id.text_num);
        guessNum = findViewById(R.id.guess_num);
        wrongNum = findViewById(R.id.wrong_num);
        reTest = findViewById(R.id.re_test_textView);
        reMain = findViewById(R.id.re_main_textView);

        Intent intent = getIntent();
        int guess = intent.getIntExtra("guess", -1);
        int wrong = intent.getIntExtra("wrong", -1);

        if(guess != -1 && wrong != -1) {
            testNum.setText("총 단어 개수 : " + (guess + wrong) + "개");
            guessNum.setText("맞힌 단어 개수 : " + guess + "개");
            wrongNum.setText("틀린 단어 개수 : " + wrong + "개");
            int p = (int)(100.0 * guess / (guess + wrong));
            answerPercentage.setText(p + "");
            if(p >= 80) {
                layout.setBackgroundColor(Color.rgb(0, 102, 255));
            }else {
                layout.setBackgroundColor(Color.rgb(255, 51, 0));
            }
        }

        reTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent1 = new Intent(v.getContext(), SolveMeaningActivity.class);
                startActivity(intent1);
            }
        });
        reMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
