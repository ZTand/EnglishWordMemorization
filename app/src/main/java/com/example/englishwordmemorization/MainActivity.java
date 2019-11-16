package com.example.englishwordmemorization;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        String[] eng = {"apple", "banana", "mango"};
        String[] kor = {"사과", "바나나", "망고"};

        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        for(int i = 0; i < eng.length; i++) {
            db.execSQL("insert into eng_word (english, korean) values(?, ?)",
                    new String[]{eng[i], kor[i]});
        }

        int count = 0;
        String[] datas = new String[3];

        Cursor cursor = db.rawQuery("select english, korean from eng_word", null);
        while (cursor.moveToNext()) {
            datas[count++] = cursor.getString(0) + "      " + cursor.getString(1);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datas);
        listView.setAdapter(adapter);
    }
}
