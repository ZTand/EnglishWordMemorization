package com.example.englishwordmemorization;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class ContentActivity extends AppCompatActivity {

    RecyclerView contentRecyclerView;
    String mainCategoryName;
    String subClassName;
    ArrayList<ContentData> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        contentRecyclerView = findViewById(R.id.content_recyclerView);

        Intent intent = getIntent();
        mainCategoryName = intent.getStringExtra("mainCategoryName");
        subClassName = intent.getStringExtra("subClassName");

        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select englishWord, koreanWord from eng_word where mainCategory = (?) and subClass = (?);",
                new String[]{mainCategoryName, subClassName});
        int count = cursor.getCount();

        try{
            while(cursor.moveToNext()) {
                ContentData content = new ContentData();
                content.setEnglish(cursor.getString(0));
                content.setKorean(cursor.getString(1));
                content.setCheck(false);
                data.add(content);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        contentRecyclerView.setAdapter(new ContentAdapter(data));
        contentRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
