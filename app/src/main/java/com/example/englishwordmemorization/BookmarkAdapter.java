package com.example.englishwordmemorization;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookmarkAdapter extends RecyclerView.Adapter<BookmarkViewHolder> {
    CheckBox allCheckBox;
    private ArrayList<BookMarkData> list;

    public BookmarkAdapter(ArrayList<BookMarkData> list, CheckBox allCheckBox) {
        this.list = list;
        this.allCheckBox = allCheckBox;
    }

    @NonNull
    @Override
    public BookmarkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bookmark_item, parent, false);
        return new BookmarkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookmarkViewHolder holder, final int position) {
        final BookMarkData data = list.get(position);
        holder.bookmarkEngTextView.setText(data.getEnglish());
        holder.bookmarkKorTextView.setText(data.getKorean());
        holder.bookmarkCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position != RecyclerView.NO_POSITION) {
                    data.setCheck(!data.getCheck());
                    notifyDataSetChanged();
                }
            }
        });
        if(data.getCheck()) {
            holder.bookmarkCheckBox.setChecked(true);
            boolean b = true;
            for(int i = 0; i < list.size(); i++) {
                BookMarkData bookMarkData = list.get(i);
                if(!bookMarkData.getCheck()) {
                    b = false;
                    break;
                }
            }
            if(b) {
                allCheckBox.setChecked(true);
            }
            holder.itemLinearLayout.setBackgroundResource(R.color.ContentCheckedColor);
        }else{
            holder.bookmarkCheckBox.setChecked(false);
            allCheckBox.setChecked(false);
            holder.itemLinearLayout.setBackgroundResource(R.color.ContentUncheckedColor);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void clear() {
        int size = list.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                list.remove(0);
            }

            notifyItemRangeRemoved(0, size);
        }
    }
}
