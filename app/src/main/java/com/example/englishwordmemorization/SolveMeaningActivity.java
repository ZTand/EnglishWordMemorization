package com.example.englishwordmemorization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.PendingIntent;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SolveMeaningActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout solve_meaning_layout;
    TextView wordCount;
    TextView seeEnglishWord;

    Button button1;
    Button button2;
    Button button3;

    ImageView oMarkImageView;
    ImageView xMarkImageView;

    ArrayList<String> korList = new ArrayList<>();
    ArrayList<String> engList = new ArrayList<>();
    HashSet<Integer> randNumbers = new HashSet<>();
    
    int i, count;
    int guess, wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_meaning);
        Toolbar toolbar = findViewById(R.id.test1_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" ");

        solve_meaning_layout = findViewById(R.id.solve_meaning_layout);
        wordCount = findViewById(R.id.word_count_textView);
        seeEnglishWord = findViewById(R.id.see_english_word);
        button1 = findViewById(R.id.choose_kor_1);
        button2 = findViewById(R.id.choose_kor_2);
        button3 = findViewById(R.id.choose_kor_3);
        oMarkImageView = findViewById(R.id.o_mark);
        xMarkImageView = findViewById(R.id.x_mark);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
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
        if(v == button1) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            if(button1.getText() == korList.get(i - 1)) {
                guess++;
                oMarkImageView.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        oMarkImageView.setVisibility(View.GONE);
                        i++;
                        renewal();
                    }
                }, 1000);
            }else{
                wrong++;
                xMarkImageView.setVisibility(View.VISIBLE);
                solve_meaning_layout.setBackgroundColor(Color.rgb(255, 51, 51));
                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        xMarkImageView.setVisibility(View.GONE);
                        solve_meaning_layout.setBackgroundColor(Color.rgb(0, 204, 204));
                        i++;
                        renewal();
                    }
                }, 1000);
            }
        }else if(v == button2) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            if(button2.getText() == korList.get(i - 1)) {
                guess++;
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
                xMarkImageView.setVisibility(View.VISIBLE);
                solve_meaning_layout.setBackgroundColor(Color.rgb(255, 51, 51));
                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        xMarkImageView.setVisibility(View.GONE);
                        solve_meaning_layout.setBackgroundColor(Color.rgb(0, 204, 204));
                        i++;
                        renewal();
                    }
                }, 1000);
            }
        }else if(v == button3) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            if(button3.getText() == korList.get(i - 1)) {
                guess++;
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
                xMarkImageView.setVisibility(View.VISIBLE);
                solve_meaning_layout.setBackgroundColor(Color.rgb(255, 51, 51));
                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        xMarkImageView.setVisibility(View.GONE);
                        solve_meaning_layout.setBackgroundColor(Color.rgb(0, 204, 204));
                        i++;
                        renewal();
                    }
                }, 1000);
            }
        }
    }

    public void renewal() {
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
        if(i > count) {
            finish();
            Intent intent = new Intent(this, TestResultActivity.class);
            intent.putExtra("guess", guess);
            intent.putExtra("wrong", wrong);
            startActivity(intent);
            return;
        }
        randNumbers.clear();
        wordCount.setText(i + "/" + count);
        seeEnglishWord.setText(engList.get(i - 1));
        // 서로 다른 random 값 두 개 생성
        while (randNumbers.size() < 2) {
            int r = (int)(Math.random() * count);
            if(r != (i-1)) {
                randNumbers.add(r);
            }
        }

        Iterator it = randNumbers.iterator();
        String s1 = null, s2 = null;
        if (it.hasNext()){
            s1 = korList.get((Integer) it.next());
        }
        if (it.hasNext()){
            s2 = korList.get((Integer) it.next());
        }
        int r = (int)(Math.random() * 6);
        if(r == 0) {
            button1.setText(s1);
            button2.setText(s2);
            button3.setText(korList.get(i-1));
        }else if(r == 1) {
            button1.setText(s1);
            button3.setText(s2);
            button2.setText(korList.get(i-1));
        }else if(r == 2) {
            button2.setText(s1);
            button1.setText(s2);
            button3.setText(korList.get(i-1));
        }else if(r == 3) {
            button2.setText(s1);
            button3.setText(s2);
            button1.setText(korList.get(i-1));
        }else if(r == 4) {
            button3.setText(s1);
            button1.setText(s2);
            button2.setText(korList.get(i-1));
        }else if(r == 5) {
            button3.setText(s1);
            button2.setText(s2);
            button1.setText(korList.get(i-1));
        }
    }
}
