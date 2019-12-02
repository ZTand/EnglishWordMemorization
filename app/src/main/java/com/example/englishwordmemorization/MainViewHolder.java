package com.example.englishwordmemorization;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class MainViewHolder extends RecyclerView.ViewHolder {
    ImageView mainImage;
    TextView mainName;

    MainViewHolder(View itemView) {
        super(itemView);
        mainImage = itemView.findViewById(R.id.main_image);
        mainName = itemView.findViewById(R.id.main_name);
    }
}
