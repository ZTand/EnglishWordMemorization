package com.example.englishwordmemorization;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;

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

        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'art gallery', '미술관')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'parmesan cheese', '파르메산 치즈')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'odd', '이상한, 특이한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'pour in', '~을 안에 붓다, 따르다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'kit', '(도구, 장비)세트')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'slider', '(지퍼)슬라이더, 손잡이')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'trendy', '유행의')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'impact', '영향')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'curator', '큐레이터, 전시책임자')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'depict', '묘사하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'pointillism', '점묘법')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'blend in', '조화를 이루다, (주위환경에)섞여들다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'illustrate', '보여주다, 실증하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'creativity', '창의성')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'unfold', '펴다, 펼쳐지다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'ordinary', '평범한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'creative', '창의적인')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'perspective', '관점')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'nourish', '(감정, 생각 등)키우다, 증진하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'means', '수단')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'sculptor', '조각가')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'carve', '새기다, 조각하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'lead', '납, 연필심')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'sew', '바느질하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'blade', '칼날')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'fragile', '부서지기 쉬운')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'snap', '툭 부러지다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'turn A into B', 'A를 B로 바꾸다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'inspiration', '영감')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'novel', '새로운')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'keen', '날카로운, 예리한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'put A into life', 'A에 생기를 불어넣다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'glow', '빛나다, 타다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'depending on~', '~에 따라')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'pitch-black', '칠흑같이 새까만')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'reproduce', '재현하다, 복사하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'artificial', '인공적인, 인위의')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'seldom', '좀처럼 ~않는')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'gorgeous', '멋진, 훌륭한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'mainstream', '주류, 대세')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'innovative', '혁신적인')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'music sheet', '악보')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'rake', '갈퀴로 모으다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'come alive', '살아나다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'astonish', '깜짝 놀라게 하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'energize', '활기를 북돋우다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'bleak', '암울한, 절망적인')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'mural', '벽화')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'greet', '맞이하다, 환영하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'scatter', '흩어지게 하다, 흩뿌리다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'at a glance', '한눈에')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'line', '~을 따라 늘어서다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'tempt', '유혹하다, 부추기다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'surroundigs', '환경, 주변')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'seek to', '~하려고 시도하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'object', '물건')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'expressive', '표현하는')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'sculpture', '조각(품)')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'beyond one`s expectation', '기대 이상인')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 5', 'awesome', '멋진, 굉장한')");

        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'marine', '해양의, 바다의')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'end up', '결국 ~하게 되다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'grocery bag', '쇼핑가방, 장바구니')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'That`s a pity!', '참 안됐어!')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'endangered', '멸종위기의')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'population', '개체 수, 인구')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'overhunting', '과도한 사냥, 남획')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'extinct / extinction', '멸종된 / 멸종')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'species', '(생물)종')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'mark', '기록하다, 표시하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'food waste disposal box', '음식물쓰레기 처리상자')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'pour', '(비가)내리퍼붓다, (억수같이)쏟아지다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'shortage', '부족')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'container', '저장 장치(용기)')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'storage tank', '저장 탱크')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'rainwater harvesting system', '빗물 이용 시설')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'enormous', '막대한, 엄청난')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'due to', '~때문에')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'put ~ at risk', '~을 위험에 빠뜨리다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'claim', '주장하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'low-lying', '저지대의')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'climate refugee', '기후 난민')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'what`s more', '게다가')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'collapse', '붕괴하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'livestock', '가축')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'confined', '좁힌, 갇힌')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'fertilizer', '비료')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'runoff', '유출수, (흐르는)빗물')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'consumption', '소비')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'turn to', '~에 의존하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'strain', '부담, 압박')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'grain', '곡물')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'consume', '소비하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'agricultural', '농사의, 농업의')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'merely', '그저, 단지')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'cut into', '침해하다, 끼어들다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'supply', '공급, 공급하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'bed', '바닥')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'drain', '물을 퍼내다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'neighboring', '이웃한, 인접한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'portion', '부분')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'unprecedented', '전례없는')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'rate', '속도, 비율')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'predict', '예측하다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'protein', '단백질')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'be bound to', '~할 수밖에 없다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'in sight', '시야 안에, 눈에 보이는')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'give ~ a second thought', '~을 한 번 더 생각해 보다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'industry', '산업')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'income', '소득')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'billion', '10억')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'feed', '먹이, 사료')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'triumph', '대성공, 업적')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'move', '움직임')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'water resources', '수자원')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'vast', '광대한')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'fresh water', '담수')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'raise', '기르다')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'ecosystem', '생태계')");
        db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('고2 영어 교과서', 'Chapter 6', 'bodies of water', '수역')");
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
