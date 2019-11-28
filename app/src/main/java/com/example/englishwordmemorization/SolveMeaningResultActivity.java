package com.example.englishwordmemorization;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SolveMeaningResultActivity extends AppCompatActivity {

    LinearLayout testResultLayout;
    TextView answerPercentageTextView;
    RecyclerView testSynthesisRecyclerView;
    TextView reTestTextView;
    TextView reMainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_meaning_result);
    }
}
