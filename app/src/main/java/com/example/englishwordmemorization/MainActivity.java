package com.example.englishwordmemorization;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainRecyclerView;
    LinkedHashSet<MainData> category = new LinkedHashSet<>();
    ArrayList<String> mainCategory = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRecyclerView = findViewById(R.id.main_recyclerView);

        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select mainCategory from eng_word", null);

        try {
            while(cursor.moveToNext()) {
                MainData mainData = new MainData();
                String tmp = cursor.getString(0);
                mainData.setCategory(tmp);
                category.add(mainData);
                mainCategory.add(tmp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        ArrayList<MainData> data2 = new ArrayList<>(category);
        mainRecyclerView.setAdapter(new MainAdapter(data2, mainCategory));
        mainRecyclerView.setLayoutManager(new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false));
    }
}
