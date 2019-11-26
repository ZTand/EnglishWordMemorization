package com.example.englishwordmemorization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SubActivity extends AppCompatActivity {

    RecyclerView subClassRecyclerView;
    String mainCategoryName;
    LinkedHashSet<SubClassData> data = new LinkedHashSet<>();
    ArrayList<String> nameData = new ArrayList<>();

    TextView chapterNumTextView;
    TextView wordNumTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        chapterNumTextView = findViewById(R.id.sub_chapter_num);
        wordNumTextView = findViewById(R.id.sub_word_num);

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
}

