package com.example.englishwordmemorization;

import android.graphics.Color;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class ContentViewHolder extends RecyclerView.ViewHolder {

    public TextView contentEngTextView;
    public TextView contentKorTextView;
    public ImageView contentBookmarkAdd;
    public CheckBox contentCheckBox;
    public LinearLayout itemLinearLayout;

    public ContentViewHolder(final View itemView) {
        super(itemView);
        contentEngTextView = itemView.findViewById(R.id.content_eng);
        contentKorTextView = itemView.findViewById(R.id.content_kor);
        contentBookmarkAdd = itemView.findViewById(R.id.bookmark_add);
        contentCheckBox = itemView.findViewById(R.id.content_checkbox);
        itemLinearLayout = itemView.findViewById(R.id.item_layout);
    }
}
