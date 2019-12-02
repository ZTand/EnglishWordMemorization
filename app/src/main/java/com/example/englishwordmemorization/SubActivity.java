package com.example.englishwordmemorization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SubActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView subClassRecyclerView;
    String mainCategoryName;
    LinkedHashSet<SubClassData> data = new LinkedHashSet<>();
    ArrayList<String> nameData = new ArrayList<>();

    TextView chapterNumTextView;
    TextView wordNumTextView;
    Button allWordTestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        chapterNumTextView = findViewById(R.id.sub_chapter_num);
        wordNumTextView = findViewById(R.id.sub_word_num);
        allWordTestButton = findViewById(R.id.all_word_test);
        allWordTestButton.setOnClickListener(this);

        subClassRecyclerView = findViewById(R.id.subClass_recyclerView);
        Intent intent = getIntent();
        mainCategoryName = intent.getStringExtra("mainCategoryName");

        Toolbar toolbar = findViewById(R.id.sub_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(mainCategoryName);

        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select subClass from eng_word where mainCategory = (?);", new String[]{mainCategoryName});
        int count = 0;
        try {
            while (cursor.moveToNext()) {
                SubClassData subclass = new SubClassData();
                String tmp = cursor.getString(0);
                subclass.setClassName(tmp);
                data.add(subclass);
                nameData.add(tmp);
                count++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        chapterNumTextView.setText(data.size() + "챕터");
        wordNumTextView.setText(count + "단어");
        ArrayList<SubClassData> data2 = new ArrayList<>(data);
        subClassRecyclerView.setAdapter(new SubClassAdapter(data2, mainCategoryName, nameData));
        subClassRecyclerView.setLayoutManager(new LinearLayoutManager(this));
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
        if(v == allWordTestButton) {
            String sub, eng, kor;
            DBHelper helper = new DBHelper(this);
            SQLiteDatabase db = helper.getWritableDatabase();

            db.execSQL("drop table test_word");
            String tableSql = "create table test_word (" +
                    "_id integer primary key autoincrement," +
                    "mainCategory not null, " +
                    "subClass not null, " +
                    "englishWord not null, " +
                    "koreanWord not null)";
            db.execSQL(tableSql);

            Cursor cursor = db.rawQuery("select subClass, englishWord, koreanWord from eng_word where mainCategory = (?);", new String[]{mainCategoryName});
            while(cursor.moveToNext()) {
                try{
                    db.beginTransaction();
                    sub = cursor.getString(0);
                    eng = cursor.getString(1);
                    kor = cursor.getString(2);
                    db.execSQL("insert into test_word (mainCategory, subClass, englishWord, koreanWord) values (?,?,?,?)", new String[]{mainCategoryName, sub, eng, kor});
                    db.setTransactionSuccessful();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    db.endTransaction();
                }
            }
            Intent intent = new Intent(this, QuizChooseActivity.class);
            startActivity(intent);
        }
    }
}

