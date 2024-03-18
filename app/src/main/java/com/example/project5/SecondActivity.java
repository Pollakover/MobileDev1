package com.example.project5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AppleAdapter adapter;
    private ArrayList<Apple> appleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.recyclerViewApples);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Создание списка яблок (пример)
        appleList = new ArrayList<>();
        appleList.add(new Apple("Сорт 1", R.drawable.apple));
        appleList.add(new Apple("Сорт 2", R.drawable.apple));
        appleList.add(new Apple("Сорт 3", R.drawable.apple));

        adapter = new AppleAdapter(this, appleList);
        recyclerView.setAdapter(adapter);
    }
}
