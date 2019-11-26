package com.example.englishwordmemorization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.PendingIntent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SolveMeaningActivity extends AppCompatActivity implements View.OnClickListener{

    TextView wordCount;
    TextView seeEnglishWord;

    Button button1;
    Button button2;
    Button button3;

    ArrayList<String> korList = new ArrayList<>();
    ArrayList<String> engList = new ArrayList<>();
    HashSet<Integer> randNumbers = new HashSet<>();

    int i, count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_meaning);
        Toolbar toolbar = findViewById(R.id.test1_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" ");

        wordCount = findViewById(R.id.word_count_textView);
        seeEnglishWord = findViewById(R.id.see_english_word);
        button1 = findViewById(R.id.choose_kor_1);
        button2 = findViewById(R.id.choose_kor_2);
        button3 = findViewById(R.id.choose_kor_3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        i = 1; count = 0;
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
            if(button1.getText() == korList.get(i - 1)) {
                Toast.makeText(this, "정답", Toast.LENGTH_SHORT).show();
                i++;
                renewal();
            }else{
                Toast.makeText(this, "오답", Toast.LENGTH_SHORT).show();
                i++;
                renewal();
            }
        }else if(v == button2) {
            if(button2.getText() == korList.get(i - 1)) {
                Toast.makeText(this, "정답", Toast.LENGTH_SHORT).show();
                i++;
                renewal();
            }else{
                Toast.makeText(this, "오답", Toast.LENGTH_SHORT).show();
                i++;
                renewal();
            }
        }else if(v == button3) {
            if(button3.getText() == korList.get(i - 1)) {
                Toast.makeText(this, "정답", Toast.LENGTH_SHORT).show();
                i++;
                renewal();
            }else{
                Toast.makeText(this, "오답", Toast.LENGTH_SHORT).show();
                i++;
                renewal();
            }
        }
    }

    public void renewal() {
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