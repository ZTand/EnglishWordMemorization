package com.example.englishwordmemorization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class QuizChooseActivity extends AppCompatActivity implements View.OnClickListener{

    Button seeWordSolveMeaningButton;
    Button seeMeaningSolveWordButton;
    Button inputSpellingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_choose);

        seeWordSolveMeaningButton = findViewById(R.id.seeWord_solveMeaning_Button);
        seeMeaningSolveWordButton = findViewById(R.id.seeMeaning_solveWord_Button);
        inputSpellingButton = findViewById(R.id.inputSpelling_Button);

        seeWordSolveMeaningButton.setOnClickListener(this);
        seeMeaningSolveWordButton.setOnClickListener(this);
        inputSpellingButton.setOnClickListener(this);

        Toolbar toolbar = findViewById(R.id.test_choose_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("퀴즈 선택");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v == seeWordSolveMeaningButton) {
            Intent intent = new Intent(this, SolveMeaningActivity.class);
            startActivity(intent);
        }else if(v == seeMeaningSolveWordButton) {
            Intent intent = new Intent(this, SolveWordActivity.class);
            startActivity(intent);
        }else if(v == inputSpellingButton) {
            Intent intent = new Intent(this, SolveSpellingActivity.class);
            startActivity(intent);
        }
    }
}
