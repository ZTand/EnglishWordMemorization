package com.example.englishwordmemorization;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    public ImageView mainImage;
    public TextView mainName;

    public MainViewHolder(View itemView) {
        super(itemView);
        mainImage = itemView.findViewById(R.id.main_image);
        mainName = itemView.findViewById(R.id.main_name);
    }
}
