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
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
    HashSet<SubClassData> data = new HashSet<>();
    ArrayList<String> nameData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        subClassRecyclerView = findViewById(R.id.subClass_recyclerView);

        Intent intent = getIntent();
        mainCategoryName = intent.getStringExtra("mainCategoryName");

        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select subClass from eng_word where mainCategory = (?);", new String[]{mainCategoryName});
        int count = cursor.getCount();

        try {
            while (cursor.moveToNext()) {
                SubClassData subclass = new SubClassData();
                String tmp = cursor.getString(0);
                subclass.setClassName(tmp);
                data.add(subclass);
                nameData.add(tmp);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        ArrayList<SubClassData> data2 = new ArrayList<>(data);
        subClassRecyclerView.setAdapter(new SubClassAdapter(data2, mainCategoryName, nameData));
        subClassRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

