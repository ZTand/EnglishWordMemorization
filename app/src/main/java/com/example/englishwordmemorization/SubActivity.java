package com.example.englishwordmemorization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SubActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView subClassListView;
    String mainCategoryName;
    String[] subClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        subClassListView = findViewById(R.id.subClass_listView);
        subClassListView.setOnItemClickListener(this);

        Intent intent = getIntent();
        mainCategoryName = intent.getStringExtra("mainCategoryName");
        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select subClass from eng_word where mainCategory = (?);", new String[]{mainCategoryName});
        int count = cursor.getCount();
        subClass = new String[count];
        int i = 0;

        try {
            while (cursor.moveToNext()) {
                subClass[i++] = cursor.getString(0);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        subClass = new LinkedHashSet<>(Arrays.asList(subClass)).toArray(new String[0]);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, subClass);
        subClassListView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}

