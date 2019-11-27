package com.example.englishwordmemorization;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SubClassAdapter extends RecyclerView.Adapter<SubClassViewHolder> {

    private ArrayList<SubClassData> list;
    String mainCategoryName;
    ArrayList<String> datas;

    public SubClassAdapter(ArrayList<SubClassData> list, String mainCategoryName, ArrayList<String> datas) {
        this.list = list;
        this.mainCategoryName = mainCategoryName;
        this.datas = datas;
    }

    @NonNull
    @Override
    public SubClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.subclass_item, parent, false);
        return new SubClassViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubClassViewHolder holder, final int position) {
        TextView listTextView;
        TextView TestTextView;
        final SubClassData data = list.get(position);
        holder.subClassName.setText(data.getClassName());
        holder.subClassListPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ContentActivity.class);
                intent.putExtra("mainCategoryName", mainCategoryName);
                intent.putExtra("subClassName", data.getClassName());
                v.getContext().startActivity(intent);
            }
        });
        holder.subClassTestPlay.setOnClickListener(new View.OnClickListener() {
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

                Cursor cursor = db.rawQuery("select englishWord, koreanWord from eng_word where mainCategory = (?) and subClass = (?);", new String[]{mainCategoryName, data.getClassName()});
                while (cursor.moveToNext()) {
                    eng = cursor.getString(0);
                    kor = cursor.getString(1);
                    db.execSQL("insert into test_word (mainCategory, subClass, englishWord, koreanWord) values (?,?,?,?)", new String[]{mainCategoryName, data.getClassName(), eng, kor});
                }
                Intent intent = new Intent(v.getContext(), QuizChooseActivity.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}