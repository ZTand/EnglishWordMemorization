package com.example.englishwordmemorization;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
