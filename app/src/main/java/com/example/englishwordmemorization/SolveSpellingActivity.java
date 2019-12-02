package com.example.englishwordmemorization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SolveSpellingActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout solve_spelling_layout;
    TextView wordCount;
    TextView seeKoreanWord;
    TextView seeguessWord;

    EditText editText;
    TextView passText;

    ImageView oMarkImageView;
    ImageView xMarkImageView;
    InputMethodManager inputMethodManager;

    ArrayList<String> korList = new ArrayList<>();
    ArrayList<String> engList = new ArrayList<>();

    int i, count;
    int guess, wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_spelling);

        inputMethodManager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        Toolbar toolbar = findViewById(R.id.test3_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" ");

        solve_spelling_layout = findViewById(R.id.solve_spelling_layout);
        wordCount = findViewById(R.id.word_count_textView_three);
        seeKoreanWord = findViewById(R.id.see_korean_word_spelling);
        seeguessWord = findViewById(R.id.wrong_see_guess_word);

        editText = findViewById(R.id.spelling_editText);
        passText = findViewById(R.id.pass_text);
        passText.setOnClickListener(this);

        oMarkImageView = findViewById(R.id.o_mark_three);
        xMarkImageView = findViewById(R.id.x_mark_three);

        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        i = 1; count = 0; guess = 0; wrong = 0;
        Cursor cursor = db.rawQuery("select englishWord, koreanWord from test_word", null);
        while (cursor.moveToNext()) {
            count++;
            engList.add(cursor.getString(0));
            korList.add(cursor.getString(1));
        }
        renewal();
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
        if(v == passText) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(),0);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            String s = editText.getText().toString();
            s = s.replaceAll(" ", "");
            String l = engList.get(i - 1).trim();
            l = l.replaceAll(" ", "");
            if(s.equalsIgnoreCase(l)){
                guess++;
                seeguessWord.setText(engList.get(i - 1));
                oMarkImageView.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        oMarkImageView.setVisibility(View.GONE);
                        i++;
                        renewal();}
                }, 1000);
            }else{
                wrong++;
                seeguessWord.setText(engList.get(i - 1));
                xMarkImageView.setVisibility(View.VISIBLE);
                solve_spelling_layout.setBackgroundColor(Color.rgb(255, 51, 51));
                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        xMarkImageView.setVisibility(View.GONE);
                        solve_spelling_layout.setBackgroundColor(Color.rgb(0, 204, 204));
                        i++;
                        renewal();
                    }
                }, 1000);
            }
        }
    }

    public void renewal() {
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
        if (i > count) {
            finish();
            Intent intent = new Intent(this, TestResultActivity.class);
            intent.putExtra("guess", guess);
            intent.putExtra("wrong", wrong);
            startActivity(intent);
            return;
        }
        editText.setText("");
        inputMethodManager.showSoftInput(editText, 0);
        seeguessWord.setText("");
        wordCount.setText(i + "/" + count);
        seeKoreanWord.setText(korList.get(i - 1));
    }
}
