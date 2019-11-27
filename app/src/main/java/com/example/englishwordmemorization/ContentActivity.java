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
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class ContentActivity extends AppCompatActivity {

    RecyclerView contentRecyclerView;
    Button checkButton;
    CheckBox allCheckBox;
    String mainCategoryName;
    String subClassName;
    ArrayList<ContentData> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        contentRecyclerView = findViewById(R.id.content_recyclerView);
        checkButton = findViewById(R.id.check_test);
        allCheckBox = findViewById(R.id.all_check);

        Intent intent = getIntent();
        mainCategoryName = intent.getStringExtra("mainCategoryName");
        subClassName = intent.getStringExtra("subClassName");

        Toolbar toolbar = findViewById(R.id.content_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(subClassName);

        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select englishWord, koreanWord from eng_word where mainCategory = (?) and subClass = (?);",
                new String[]{mainCategoryName, subClassName});
        int count = 0;
        try{
            while(cursor.moveToNext()) {
                ContentData content = new ContentData();
                content.setEnglish(cursor.getString(0));
                content.setKorean(cursor.getString(1));
                content.setCheck(false);
                data.add(content);
                count++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        contentRecyclerView.setAdapter(new ContentAdapter(data, allCheckBox));
        contentRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        final int finalCount = count;

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eng, kor;
                DBHelper helper = new DBHelper(v.getContext());
                SQLiteDatabase db = helper.getWritableDatabase();

                db.execSQL("drop table test_word");
                String tableSql = "create table test_word (" +
                        "_id integer primary key autoincrement," +
                        "mainCategory not null, " +
                        "subClass not null, " +
                        "englishWord not null, " +
                        "koreanWord not null)";
                db.execSQL(tableSql);
                int count = 0;
                for(int i = 0; i < finalCount; i++) {
                    if(data.get(i).getCheck()) {
                        db.execSQL("insert into test_word (mainCategory, subClass, englishWord, koreanWord) values (?,?,?,?)",
                                new String[]{mainCategoryName, subClassName, data.get(i).getEnglish(), data.get(i).getKorean()});
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
                        ContentData contentData= data.get(i);
                        contentData.setCheck(true);
                        contentRecyclerView.getAdapter().notifyDataSetChanged();
                    }
                }else if(!((CheckBox)v).isChecked()) {
                    for(int i = 0; i < finalCount; i++) {
                        ContentData contentData= data.get(i);
                        contentData.setCheck(false);
                        contentRecyclerView.getAdapter().notifyDataSetChanged();
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
