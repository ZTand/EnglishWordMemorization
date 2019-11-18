package com.example.englishwordmemorization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView mainCategoryListView;
    String[] mainCategory = {"고2 영어 교과서"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainCategoryListView = findViewById(R.id.mainCategory_listView);
        mainCategoryListView.setOnItemClickListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCategory);
        mainCategoryListView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, SubActivity.class);
        intent.putExtra("mainCategoryName", mainCategory[position]);
        startActivity(intent);
    }
}
