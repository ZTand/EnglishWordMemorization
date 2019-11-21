package com.example.englishwordmemorization;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class ContentAdapter extends RecyclerView.Adapter<ContentViewHolder>{

    private ArrayList<HashMap<String, String>> list;

    public ContentAdapter(ArrayList<HashMap<String, String>> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_item, parent, false);
        return new ContentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ContentViewHolder holder, final int position) {
         HashMap<String, String> hashMap = list.get(position);
         holder.contentEngTextView.setText(hashMap.get("eng"));
         holder.contentKorTextView.setText(hashMap.get("kor"));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
