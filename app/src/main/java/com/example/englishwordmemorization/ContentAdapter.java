package com.example.englishwordmemorization;

import android.app.PendingIntent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;

public class ContentAdapter extends RecyclerView.Adapter<ContentViewHolder>{

    CheckBox allCheckBox;
    private ArrayList<ContentData> list;

    public ContentAdapter(ArrayList<ContentData> list, CheckBox allCheckBox) {
        this.list = list;
        this.allCheckBox = allCheckBox;
    }

    @NonNull
    @Override
    public ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_item, parent, false);
        return new ContentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ContentViewHolder holder, final int position) {
         final ContentData data = list.get(position);
         holder.contentEngTextView.setText(data.getEnglish());
         holder.contentKorTextView.setText(data.getKorean());
         holder.contentCheckBox.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(position != RecyclerView.NO_POSITION) {
                     data.setCheck(!data.getCheck());
                     notifyDataSetChanged();
                 }
             }
         });
         holder.contentBookmarkAdd.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 DBHelper helper = new DBHelper(v.getContext());
                 SQLiteDatabase db = helper.getWritableDatabase();
                 db.execSQL("insert into bookmark_word (englishWord, koreanWord) values (?,?)",
                         new String[]{data.getEnglish(), data.getKorean()});
                 Toast.makeText(v.getContext(), "북마크에 추가되었습니다", Toast.LENGTH_SHORT).show();
             }
         });
         if(data.getCheck()) {
             holder.contentCheckBox.setChecked(true);
             boolean b = true;
             for(int i = 0; i < list.size(); i++) {
                 ContentData contentData= list.get(i);
                 if(!contentData.getCheck()) {
                     b = false;
                     break;
                 }
             }
             if(b) {
                 allCheckBox.setChecked(true);
             }
             holder.itemLinearLayout.setBackgroundResource(R.color.ContentCheckedColor);
             holder.contentBookmarkAdd.setImageResource(R.drawable.checkedbookmark);
         }else{
             holder.contentCheckBox.setChecked(false);
             allCheckBox.setChecked(false);
             holder.itemLinearLayout.setBackgroundResource(R.color.ContentUncheckedColor);
             holder.contentBookmarkAdd.setImageResource(R.drawable.bookmark);
         }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
