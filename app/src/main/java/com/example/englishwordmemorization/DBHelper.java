package com.example.englishwordmemorization;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 2;

    public DBHelper(Context context) {
        super(context, "engWordDB", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            String tableSql = "create table test_word (" +
                "_id integer primary key autoincrement," +
                "mainCategory " +
                "subClass" +
                "englishWord not null, " +
                "koreanWord not null)";
            db.execSQL(tableSql);
        }catch (SQLiteException e) {
            e.printStackTrace();
        }

        try {
            String tableSql = "create table bookmark_word (" +
                "_id integer primary key autoincrement," +
                "englishWord not null, " +
                "koreanWord not null)";
            db.execSQL(tableSql);
        }catch (SQLiteException e) {
            e.printStackTrace();
        }

        try { String tableSql = "create table eng_word (" +
                "_id integer primary key autoincrement," +
                "mainCategory, " +
                "subClass, " +
                "englishWord not null, " +
                "koreanWord not null)";
            db.execSQL(tableSql);
        } catch (SQLiteException e) {
            e.printStackTrace();
        }

        String main[] = new String[]{"고1 영어 교과서", "고2 영어 교과서"};
        String sub[] = new String[]{"Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1",
                "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1",
                "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1",
                "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1",
                "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1",

                "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2",
                "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2",
                "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2",
                "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2",
                "Chapter 2",

                "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3",
                "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3",
                "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3",
                "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3",
                "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3",

                "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4",
                "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4",
                "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4",
                "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4",
                "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4", "Chapter 4",
                "Chapter 4", "Chapter 4",

                "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5",
                "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5",
                "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5",
                "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5", "Chapter 5",

                "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6",
                "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6",
                "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6",
                "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6", "Chapter 6",

                "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1",
                "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1",
                "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1",
                "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1",
                "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1",
                "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1", "Chapter 1",

                "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2",
                "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2",
                "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2",
                "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2",
                "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2",
                "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2", "Chapter 2",

                "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3",
                "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3",
                "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3",
                "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3",
                "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3",
                "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3", "Chapter 3"};


        String eng[] = new String[]{"the other day", "perform", "performance", "trick", "envious", "set one`s mind on", "psychologyn", "deal with", "troubleshooter", "instantly",
                "instant", "assess", "value", "personality", "suitable", "appropriate", "available", "narrow down", "occupation", "requirement",
                "outlook", "earning", "earn", "eliminate", "be interested in", "in-depth", "depth", "first-hand", "second-hand", "conduct",
                "get oneself involved in", "unfold", "producer", "day off", "in person", "equipment", "complexity", "arrange", "edit", "head",
                "composer", "technician", "technique", "repeat", "exhausted", "cheer up", "occasional", "on top of", "come up with", "develop",

                "be in fashion", "tend to", "current", "create", "showcase", "charm", "individuality", "personal", "signature", "experiment",
                "as for", "go well with", "avoid", "realize", "shade", "eventually", "suit", "discover", "combine", "analogous",
                "complementary", "elegant", "bold", "inpression", "tricky", "result in", "clash", "uniform", "pay attention to", "casual",
                "layer", "outfit", "frame", "angular", "square", "in terms of", "material", "eyebrow", "expressive", "hide",
                "strict",

                "be all the rage", "promote", "promotion", "eco-friendly", "green", "make sense", "unplug", "innovator", "take on", "chances are",
                "throw ~ away", "Dutch", "be filled with", "pavement", "community", "tansparent", "reveal", "landfill", "global", "annually",
                "waste", "found", "tackle", "distribute", "disposable", "massive", "dispose of", "drive", "novel",
                "novelty", "edible", "structure", "soaked", "mess", "photocopy", "font", "ruin", "readability", "perspective",
                "entire", "adopt", "adapt", "activist",

                "thrilled", "thrill", "conservatory", "abroad", "force", "in earnest", "sightseeing", "sightsee", "ancient", "construction",
                "construct", "famous", "be famous for", "fountain", "ensure", "sure", "miss out on", "Pope", "be known as", "border",
                "sculpture", "sculpt", "masterpiece", "ceiling", "linger", "convince", "conviction", "out of this world", "a couple of", "seaside",
                "as well", "explore", "exploration", "alley", "wander", "wanderer", "canal", "prime", "primary", "pigeon",
                "steal", "gondola", "snake", "find out", "fare", "afford", "comment", "no comment", "exchange", "definitely",
                "definite", "lifetime", "so far",

                "miner", "bury", "rescue", "triumph", "faith", "lock", "surrender", "despair", "dig for", "vibration",
                "immediately", "explosion", "fill up with", "initial", "collapse", "exploratory", "spark", "celebration", "operational", "shelter",
                "live on", "bother", "severely", "humidity", "unite", "organize", "vote", "break down", "religious", "morale",
                "relief", "enthusiastically", "priority", "democratic", "anthem", "heroics", "humanity", "involve",

                "decision", "consumer", "commercial", "shout", "pop-up", "resource", "affect", "retail", "inventory", "make room for",
                "purchase", "regular", "motivate", "prove", "associate ~ with...", "appealing", "be up to", "clerk", "suggestion", "in addition to",
                "up-selling", "inexpensive", "strategically", "arrangement", "random", "subtle", "load", "autopilot", "instead of", "deliberate",
                "automatically", "simply", "assume", "taste", "be aware of", "overwhelmed", "guide",

                "from time to time", "be told", "think outside the box", "easier said than done", "perspective", "approach", "handle", "work", "following", "weight",
                "professor", "raise", "various", "reply", "matter", "depend on", "fairly", "light", "ache", "entire",
                "likely", "cramp up", "which", "force", "eventually", "in each case", "for a short while", "a bit", "all day long", "numb",
                "be incapable of", "else", "until", "coffee beans", "complain", "struggle with", "frustrated", "take A to B", "pot", "place",
                "grind", "boil", "turn off", "hastily", "closer", "shortly after", "peel off", "shell", "note", "firm",
                "take a sip", "aroma", "try to V", "explain", "object", "face", "adversity", "react", "weak", "frgile",

                "intangible", "heritage", "humanity", "intangible cultural heritage", "link", "means", "shpae", "be rooted", "identity", "provide A with B",
                "foundation", "wisdom", "knowledge", "sustainable", "development", "precious", "asset", "community", "individual", "across the world",
                "protect", "generation", "following", "offer", "insight", "diversity", "rapid", "profound", "strengthen", "resolve",
                "take action", "preserve", "benefit", "between A and B", "autumn", "each other", "raise", "ten levels", "formation", "bottom base",
                "in Ving", "be willing to V", "senior citizen", "by Ving", "collapse", "from", "one another", "wave", "crowd", "below",
                "accumulate", "hand down", "sense of belonging", "heighten", "spirit", "cooperation", "require", "element", "long for", "paly a role",

                "human being", "be capable of", "through", "sprinter", "catcher", "precision", "whatever", "govern", "explain", "break the world record",
                "clock", "adult", "cheetah", "limit", "influence", "this is why", "the + A, the + A", "in the air", "which", "reduce",
                "the number of", "therefore", "maximum", "attain", "combination", "apply", "stride", "frequency", "optimal", "unfortunately",
                "depend on", "length", "factor", "vary", "among", "expert", "predict", "probably", "method", "curler",
                "sweep", "broom", "furiously", "slide", "a sheet of ice", "settle into", "house", "bump", "fist", "indicate",
                "expect", "according to", "Newton`s first law of motion", "curl", "even though", "direct", "rub", "generate", "friction", "result in"};


        String kor[] = new String[]{"일전에, 최근에", "해 보이다, 공연하다", "공연", "마술, 장난", "부러워하는, 선망하는", "~을 마음에 두다", "심리학", "~을 다루다", "해결사, 분쟁 중재자", "즉시",
                "즉각적인, 순간", "평가하다, 가늠하다", "가치", "가치관", "적합한 , 적절한", "적절한", "이용할 수 있는", "좁히다, 줄이다", "직업", "필요, 필요한 것",
                "전망", "소득, 수입", "돈을 벌다", "없애다, 제거하다", "~에 관심이 있다", "면밀한, 상세한", "깊이, 심도", "직접 경험한", "간접의, 전해 들은", "수행하다",
                "스스로 ~에 몰두하다", "펼쳐지다", "(음반)제작자", "쉬는 날", "직접, 몸소", "장비", "복잡함", "편곡하다, 정리하다, 배열하다", "편집하다", "~로 향하다",
                "작곡가", "기술자, 기사", "기술, 기법", "되풀이하다", "지친, 기운이 빠진", "~을 격려하다", "가끔의", "~뿐만 아니라", "~을 찾아내다", "개발하다, 성장시키다, 현상하다",

                "유행하고 있다", "~하는 경향이 있다", "현재의, 지금의", "만들다, 창조하다", "~을 돋보이게 하다", "매력", "개성, 특성", "개인의 개인적인", "특징적인, 특징", "실험하다",
                "~에 관해 말하자면", "~와 잘 어울리다", "피하다", "깨닫다, 알아차리다", "색조", "마침내, 결국", "어울리다", "알아내다, 발견하다", "결합하다", "유사한",
                "상호 보완적인", "우아한, 품격 있는", "뚜렷한, 두드러진", "인상", "힘든, 까다로운", "~을 낳다", "안 어울리다", "교복, 제복", "~에 주의를 기울이다", "평상시의, 캐주얼한",
                "겹, 겹침", "복장, 옷", "안경테", "각이 진", "직각의, 직각을 이루는", "~면에서, ~에 관하여", "재료", "눈썹", "감정을 나타내는", "가리다, 숨기다",
                "엄한, 엄격한",

                "엄청하게 유행하다", "홍보하다, 촉진하다", "홍보, 승진, 진급", "친환경적인", "친환경적인", "타당하다, 이치에 맞다", "플러그를 뽑다", "개혁자, 혁신자", "맡다, 책임지다", "아마 ~일 것이다",
                "~을 버리다", "네덜란드의", "~로 가득 차다", "인도, 보도", "지역 사회, 공동체", "투명한", "드러내 보이다", "쓰레기 매립지", "전 세계의, 전반적인", "매년, 해마다",
                "낭비하다, 쓰레기", "설립하다", "다루다, 씨름하다", "분배하다, 나누어 주다", "일회용의", "일회용품들", "대량의, 엄청나게 큰", "~을 없애다, ~을 처분하다", "몰다, 추동하다", "새로운, 참신한",
                "참신성", "먹을 수 있는", "구조", "흠뻑 젖은", "지저분한 것, 범벅이 된 음식", "복사(물)", "서체", "망치다, 몰락, 파산", "가독성, 읽기 쉬움", "관점, 시각",
                "전체의, 온", "채택하다, 받아들이다", "적응하다", "운동가, 활동가",

                "아주 흥분한, 신이 난", "흥분, 설렘", "음악 학교", "해외로", "강요하다, ~하게 만들다", "본격적으로", "관광", "구경하다", "옛날의, 고대의", "건설",
                "건설하다", "유명한", "~으로 유명하다", "반드시 ~하게 하다", "확신하는", "~을 놓치다", "교황", "~로 알려져 있다", "국경, 경계",
                "조각품", "조각하다", "걸작, 명작", "천장", "남다, 계속되다", "설득하다, 납득시키다", "확신", "너무도 훌륭한", "두서너 개의", "바닷가, 해변",
                "또한, 역시", "탐험하다", "탐험, 탐사", "좁은 길, 골목", "돌아다니다", "방랑자", "운하, 수로", "주요한, 주된", "주요한, 주된", "비둘기",
                "훔치다", "곤돌라", "구불구불 가다", "발견하다, 알게 되다", "요금", "~할 여유가 있다", "논평하다", "할말 없음", "교환하다", "분명히",
                "확실한, 분명한", "일생, 평생", "지금까지, 이 시점까지",

                "광부", "묻다, 뒤덮다", "구조하다, 구조", "대성공", "신념, 믿음", "~을 가두다", "굴복하다", "절망", "~을 찾아 땅을 파다", "진동",
                "즉시", "폭발", "~을 가득 채우다, ~로 가득 차다", "초기의", "붕괴", "탐사의", "~의 발단이 되다", "기념행사", "사용할 수 있는", "피난처, 은신처",
                "~을 먹고 살다", "괴롭히다", "혹독하게", "습기", "결합하다, 단결하다", "조직하다", "투표(권)", "부서지다, 와해되다, 무너지다", "종교의, 종교적인", "사기, 의욕",
                "안도, 안심", "열광적으로", "우선 사항", "민주주의의, 민주적인", "축가, 송가", "용단, 영웅적 행위", "인간애", "연루시키다",

                "결정, 판단", "소비자", "광고, 상업의, 상업적인", "외치다, 소리치다", "튀어나오는", "자원, 자금, 재산", "~에 영향을 미치다", "소매", "재고(품)", "~을 위해 자리를 만들다",
                "구매", "보통의, 평상시의", "동기를 부여하다", "입증하다, 증명하다", "~을 ...에 연관 짓다", "매력적인, 호소하는", "~에 달려 있다", "점원, 직원", "제안", "~에 대하야",
                "연쇄 판매", "비싸지 않은", "전략적으로", "진열, 배열", "무작위의", "교묘한, 영리한, 미묘한", "마구 주다, 싣다", "자동 조종 장치", "~대신에", "신중히 생각하다",
                "자동적으로, 기계적으로", "그냥, 간단히", "추정하다", "취향", "~을 알아차리다", "압도된", "인도하다, 이끌다",

                "때때로", "듣다", "고정관념 밖에서 생각하다", "행동하는 것보다 말하는 것이 쉽다", "관점", "접근", "~을 다루다", "효과가 있다", "앞으로 나오게 되는", "무게",
                "교수", "들어 올리다", "다양한", "대답하다", "중요하다", "~에 의존하다", "꽤, 상당히", "가벼운", "아프다", "전체의",
                "아마도", "경련이 일어나다", "그리고 그것은", "강요하다", "결국", "각각의 경우에서", "잠시 동안", "약간, 조금", "하루 종일", "감각이 없는",
                "~할 수 없다", "또 다른, 그 밖의", "~할 때까지", "커피콩", "불평하다", "고심하다, 씨름하다", "좌절한", "A를 B로 데려가다", "냄비", "~를 놓다",
                "갈다, 빻다", "끓다", "끄다", "성급하게, 서둘러", "더 자세히", "~하자마자", "(껍질 등을 벗기다)", "껍질", "주목하다, 알아차리다", "단단한, 확고환",
                "한모금 마시다", "냄새, 향기", "~하려고 노력하다", "설명하다", "사물, 물체", "직면하다", "역경", "반응하다", "약한", "연약한",

                "만질 수 없는, 무형의", "유산", "인류", "무형 문화재", "연결하다", "수단, 방법", "이해하다, 형성하다", "뿌리를 두다", "정체성", "A에게 B를 제공하다",
                "토대, 기본", "지혜", "지식", "지속가능한", "발전", "귀중한", "자산", "지역사회", "개인, 사람", "전 세계적으로",
                "보호하다", "세대", "앞으로 나오게 되는", "제공", "통찰력", "다양성", "빠른", "심오한, 깊은", "강화시키다", "결심, 각오",
                "조치를 취하다", "보존하다", "이익", "A와 B 사이에", "가을", "서로서로", "(들어)올리다", "10층", "형성, 구성", "바닥",
                "~할 때, ~함에 있어서", "기꺼이 ~하다", "노인, 어르신", "~함으로써", "붕괴되다", "형성하다, 만들다", "서로서로", "(팔을)흔들다", "군중, 대중", "밑에",
                "축적하다", "~을 물려주다, 건네주다", "소속감", "강화하다, 높이다", "정신", "협력", "요구하다", "요소", "갈망하다, 그리워하다", "역할을 하다",

                "사람, 인간", "~를 할 수 있다", "~를 통해서", "단거리 달리기 선수", "포수", "정확성", "무엇이든지", "지배하다, 통치하다", "설명하다", "세계 기록을 깨다",
                "기록하다", "어른, 성인", "치타", "한계", "영향을 끼치다", "그래서", "~하면 할수록 점점 더 ~하다", "공중에서", "그리고 그것은", "줄이다",
                "~의 수", "그래서, 그러므로", "최대", "달성하다, 얻다", "결합", "누르다", "걸음", "빈도", "최적의", "불행히도",
                "~에 의존하다", "길이", "요소", "다양하다", "~사이에서", "전문가", "예측하다", "아마도", "방법", "컬링 선수",
                "쓸다", "빗자루", "맹렬하게", "미끄러지다", "얼음판", "자리잡다", "(컬링 경기의 가운데)원", "부딧히다", "주먹", "나타내다",
                "예상하다", "~에 따라서", "뉴턴의 운동의 제1법칙", "휘어지다", "비록 ~일지라도", "방향을 맞추다", "문지르다", "발생시키다, 만들어내다", "마찰", "~을 초래하다, 야기하다",};

        int len = eng.length;
        for(int i = 0; i < len; i++) {
            try{
                String m;
                db.beginTransaction();
                if(i < 262) {
                    m = main[0];
                }else {
                    m = main[1];
                }
                String s = sub[i];
                String e = eng[i];
                String k = kor[i];
                db.execSQL("insert into eng_word (mainCategory, subClass, englishWord, koreanWord) values ('" + m + "','" + s + "','" + e + "','" + k + "');");
                db.setTransactionSuccessful();
            }catch (SQLException e) {
                e.printStackTrace();
            }finally {
                db.endTransaction();
            }
        }



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
        try {
            db.execSQL("drop table eng_word");
            db.execSQL("drop table test_word");
            db.execSQL("drop table bookmark_word");
        } catch (SQLiteException e) {
             e.printStackTrace();
        }
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            db.execSQL("drop table eng_word");
            db.execSQL("drop table test_word");
            db.execSQL("drop table bookmark_word");
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        onCreate(db);
    }
}
