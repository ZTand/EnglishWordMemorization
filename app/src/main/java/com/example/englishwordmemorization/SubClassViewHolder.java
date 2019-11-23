package com.example.englishwordmemorization;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class SubClassViewHolder extends RecyclerView.ViewHolder {
    public TextView subClassName;
    public TextView subClassListPlay;
    public TextView subClassTestPlay;

    public SubClassViewHolder(final View itemView) {
        super(itemView);
        subClassName = itemView.findViewById(R.id.subclass_name);
        subClassListPlay = itemView.findViewById(R.id.subclass_list);
        subClassTestPlay = itemView.findViewById(R.id.subclass_test);
    }
}
