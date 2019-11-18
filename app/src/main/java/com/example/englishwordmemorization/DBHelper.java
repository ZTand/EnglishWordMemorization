package com.example.englishwordmemorization;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 7;

    public DBHelper(Context context) {
        super(context, "engWordDB", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tableSql = "create table eng_word (" +
                "_id integer primary key autoincrement," +
                "mainCategory not null, " +
                "subClass not null, " +
                "englishWord not null, " +
                "koreanWord not null)";
        db.execSQL(tableSql);

        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 1', 'apple', '사과')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 1', 'banana', '바나나')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 1', 'kiwi', '키위')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 2', 'cook', '요리하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 2', 'eat', '먹다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 2', 'test1', '테스트1')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 3', 'test2', '테스트2')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 3', 'test3', '테스트3')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 3', 'test4', '테스트4')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 3', 'test5', '테스트5')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table eng_word");
        onCreate(db);
    }
}
