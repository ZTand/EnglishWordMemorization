package com.example.englishwordmemorization;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private ArrayList<MainData> list;
    ArrayList<String> datas;

    public MainAdapter(ArrayList<MainData> list, ArrayList<String> datas) {
        this.list = list;
        this.datas = datas;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, final int position) {
        MainData data = list.get(position);
        holder.mainName.setText(data.getCategory());
        if(position == 0) {
            holder.mainImage.setImageResource(R.drawable.high1);
        }else if(position == 1) {
            holder.mainImage.setImageResource(R.drawable.high2);
        }

        holder.mainImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SubActivity.class);
                intent.putExtra("mainCategoryName", list.get(position).getCategory());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
