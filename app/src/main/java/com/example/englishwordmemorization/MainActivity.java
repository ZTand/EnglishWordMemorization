package com.example.englishwordmemorization;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] categoryArr;
    String[] englishArr;
    String[] koreanArr;
    String[] datas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        categoryArr = getResources().getStringArray(R.array.category);
        englishArr = getResources().getStringArray(R.array.english);
        koreanArr = getResources().getStringArray(R.array.korean);

        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        int i;
        for(i = 0; i < categoryArr.length; i++) {
            db.execSQL("insert into eng_word (category, english, korean) values (?,?,?)",
                    new String[]{categoryArr[i], englishArr[i], koreanArr[i]});
        }
        i = 0;
        datas = new String[categoryArr.length];
        Cursor cursor = db.rawQuery("select category, english, korean from eng_word", null);
        while (cursor.moveToNext()) {
            datas[i++] = cursor.getString(0) + "      " + cursor.getString(1) + "      " + cursor.getString(2);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datas);
        listView.setAdapter(adapter);
    }
}
