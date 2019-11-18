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
import java.util.LinkedHashSet;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView mainCategoryListView;
    String[] mainCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainCategoryListView = findViewById(R.id.mainCategory_listView);
        mainCategoryListView.setOnItemClickListener(this);

        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select mainCategory from eng_word", null);
        int count = cursor.getCount();
        mainCategory = new String[count];
        int i = 0;

        try {
            while(cursor.moveToNext()) {
                mainCategory[i++] = cursor.getString(0);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        mainCategory = new LinkedHashSet<>(Arrays.asList(mainCategory)).toArray(new String[0]);
        Arrays.sort(mainCategory, String.CASE_INSENSITIVE_ORDER);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCategory);
        mainCategoryListView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, SubActivity.class);
        intent.putExtra("mainCategoryName", mainCategory[position]);
        startActivity(intent);
    }
}
