package com.example.englishwordmemorization;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 2;

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

        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'translate', '번역하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'community center', '주민 센터')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'NGO(non-governmental organization)', '비정부기구')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'sponsor', '후원자')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'keep up with', '~을 따라잡다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'convey', '전달하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'original language', '원어(번역하기 전의 말)')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'keep ~ in mind', '명심하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'annual', '연례의')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'charity bazaar', '자선 바자회')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'gym', '체육관')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'a variety of', '다양한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'goods', '상품, 제품')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'reasonable', '합리적인, 적정한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'organizer', '주최자')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'in need', '~이 필요한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'broadcasting club', '방송반')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'donate', '기부하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'participate in', '~에 참여하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'portrait', '초상화')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'auction', '경매')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'unsung', '찬양받지 못한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'breast', '가슴')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'accidentally', '우연히')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'clue', '실마리, 단서')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'identify', '식별하다, 판명하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'quote', '인용하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'contribution', '공헌')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'practice medicine', '의료업에 종사하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'manage to', '(가까스로)~을 해내다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'contract', '병에 걸리다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'reputation', '명성')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'collapse', '붕괴 / 붕괴하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'stress', '강조하다 / 스트레스')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'shrink from', '~을 피하다, 꺼리다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'dusky', '거무스름한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'aspiration', '열망')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'stock', '재고(품), 주식')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'be supposed to', '~하기로 되어있다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'sutler', '종군상인')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'testify', '증언하다, 진술하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'admiration', '찬사')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'numbing', '감각을 마비시키는')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'brave', '용감히 맞서다, 용감한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'physician surgeon', '(내과)의사, 외과의사')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'doctor', '치료하다 / 의사')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'extraordinary', '뛰어난, 놀라운')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'in attendance', '돌보는, 시중드는')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'blessing', '축복')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'turn out', '결국 ~으로 되다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'broke', '무일푼의, 파산한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'veteran', '참전군인')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'organize', '준비하다, 조직하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'benefit', '자선행사, 혜택')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'contributor', '기부자')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'vividly', '생생하게')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'depict', '묘사하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 4', 'publish', '출판하다, 발행하다')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table eng_word");
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table eng_word");
        onCreate(db);
    }
}
