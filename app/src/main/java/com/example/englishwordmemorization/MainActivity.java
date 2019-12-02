package com.example.englishwordmemorization;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MainActivity extends AppCompatActivity {

    LinearLayout bookmarkLayout;
    TextView bookmarkWordNum;
    RecyclerView mainRecyclerView;
    LinkedHashSet<MainData> categoryList = new LinkedHashSet<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.bookmark_toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("영어단어 암기장");
        }

        bookmarkLayout = findViewById(R.id.bookmark_box);
        bookmarkLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BookmarkActivity.class);
                startActivity(intent);
            }
        });

        bookmarkWordNum = findViewById(R.id.bookmark_word_num);
        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select englishWord from bookmark_word", null);
        int count = 0;
        try{
            while(cursor.moveToNext()) {
                count++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        bookmarkWordNum.setText("총 단어 수   " + count);

        mainRecyclerView = findViewById(R.id.main_recyclerView);
        try {
            cursor = db.rawQuery("select mainCategory from eng_word", null);
            while(cursor.moveToNext()) {
                MainData mainData = new MainData();
                String tmp = cursor.getString(0);
                mainData.setCategory(tmp);
                categoryList.add(mainData);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        ArrayList<MainData> list = new ArrayList<>(categoryList);
        mainRecyclerView.setAdapter(new MainAdapter(list));
        mainRecyclerView.setLayoutManager(new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false));
    }

    @Override
    protected void onResume() {
        super.onResume();
        int count = 0;
        try{
            DBHelper helper = new DBHelper(this);
            SQLiteDatabase db = helper.getWritableDatabase();
            Cursor cursor = db.rawQuery("select englishWord from bookmark_word", null);
            while(cursor.moveToNext()) {
                count++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        bookmarkWordNum.setText("총 단어 수   " + count);
    }
}
