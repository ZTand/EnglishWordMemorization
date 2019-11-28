package com.example.englishwordmemorization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class BookmarkActivity extends AppCompatActivity {

    RecyclerView bookmarkRecyclerView;
    Button allDropButton;
    Button checkButton;
    CheckBox allCheckBox;
    ArrayList<BookMarkData> data = new ArrayList<>();
    BookmarkAdapter bookmarkAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark);

        bookmarkRecyclerView = findViewById(R.id.bookmark_recyclerView);
        allDropButton = findViewById(R.id.bookmark_drop);
        checkButton = findViewById(R.id.bookmark_check_test);
        allCheckBox = findViewById(R.id.bookmark_all_check);

        Toolbar toolbar = findViewById(R.id.bookmark_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("북마크");

        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();

        Cursor cursor = db.rawQuery("select englishWord, koreanWord from bookmark_word", null);
        int count = 0;
        try {
            while(cursor.moveToNext()) {
                BookMarkData bookmark = new BookMarkData();
                bookmark.setEnglish(cursor.getString(0));
                bookmark.setKorean(cursor.getString(1));
                bookmark.setCheck(false);
                data.add(bookmark);
                count++;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        bookmarkAdapter = new BookmarkAdapter(data, allCheckBox);
        bookmarkRecyclerView.setAdapter(bookmarkAdapter);
        bookmarkRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        final int finalCount = count;

        allDropButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper helper = new DBHelper(v.getContext());
                SQLiteDatabase db = helper.getWritableDatabase();
                db.execSQL("drop table bookmark_word");
                String tableSql = "create table bookmark_word (" +
                        "_id integer primary key autoincrement," +
                        "englishWord not null, " +
                        "koreanWord not null)";
                db.execSQL(tableSql);
                Toast.makeText(v.getContext(), "삭제되었습니다", Toast.LENGTH_SHORT).show();
                bookmarkAdapter.clear();
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper helper = new DBHelper(v.getContext());
                SQLiteDatabase db = helper.getWritableDatabase();

                db.execSQL("drop table test_word");
                String tableSql = "create table test_word (" +
                        "_id integer primary key autoincrement," +
                        "mainCategory, " +
                        "subClass," +
                        "englishWord not null, " +
                        "koreanWord not null)";
                db.execSQL(tableSql);

                int count = 0;
                for(int i = 0; i < finalCount; i++) {
                    if(data.get(i).getCheck()) {
                        db.execSQL("insert into test_word (englishWord, koreanWOrd) values (?, ?)",
                                new String[]{data.get(i).getEnglish(), data.get(i).getKorean()});
                        count++;
                    }
                }
                if(count < 3) {
                    Toast.makeText(v.getContext(), "단어를 3개 이상 선택하세요!", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(v.getContext(), QuizChooseActivity.class);
                    v.getContext().startActivity(intent);
                }
            }
        });

        allCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked()) {
                    for(int i = 0; i < finalCount; i++) {
                        BookMarkData bookMarkData= data.get(i);
                        bookMarkData.setCheck(true);
                        bookmarkRecyclerView.getAdapter().notifyDataSetChanged();
                    }
                }else if(!((CheckBox)v).isChecked()) {
                    for(int i = 0; i < finalCount; i++) {
                        BookMarkData bookMarkData= data.get(i);
                        bookMarkData.setCheck(false);
                        bookmarkRecyclerView.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
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
}
