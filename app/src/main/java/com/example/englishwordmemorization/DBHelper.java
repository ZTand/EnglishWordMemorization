package com.example.englishwordmemorization;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public DBHelper(Context context) {
        super(context, "engWordList", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String wordSQL = "create table eng_word " +
                "(_id integer primary key autoincrement," +
                "english, " +
                "korean)";
        db.execSQL(wordSQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(newVersion == DATABASE_VERSION) {
            db.execSQL("drop table eng_word");
            onCreate(db);
        }
    }
}
