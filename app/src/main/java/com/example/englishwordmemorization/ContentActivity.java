package com.example.englishwordmemorization;

import androidx.appcompat.app.AppCompatActivity;

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

public class ContentActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView contentListView;
    String mainCategoryName;
    String subClassName;
    ArrayList<HashMap<String, String>> datas = new ArrayList<>();
    HashMap<String, String> content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        contentListView = findViewById(R.id.content_listView);
        contentListView.setOnItemClickListener(this);

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
                content = new HashMap<>();
                content.put("eng", cursor.getString(0));
                content.put("kor", cursor.getString(1));
                datas.add(content);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        SimpleAdapter adapter = new SimpleAdapter(this, datas, android.R.layout.simple_list_item_2,
                new String[]{"eng", "kor"}, new int[]{android.R.id.text1, android.R.id.text2});
        contentListView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, position + "번째 선택...", Toast.LENGTH_SHORT).show();
    }
}
