package com.example.englishwordmemorization;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class BookmarkViewHolder extends RecyclerView.ViewHolder {

    public TextView bookmarkRemoveTextView;
    public TextView bookmarkEngTextView;
    public TextView bookmarkKorTextView;
    public CheckBox bookmarkCheckBox;
    public LinearLayout itemLinearLayout;

    public BookmarkViewHolder(final View itemView) {
        super(itemView);
        bookmarkRemoveTextView = itemView.findViewById(R.id.remove_item);
        bookmarkEngTextView = itemView.findViewById(R.id.bookmark_eng);
        bookmarkKorTextView = itemView.findViewById(R.id.bookmark_kor);
        bookmarkCheckBox = itemView.findViewById(R.id.bookmark_checkbox);
        itemLinearLayout = itemView.findViewById(R.id.bookmark_item_layout);
    }
}
