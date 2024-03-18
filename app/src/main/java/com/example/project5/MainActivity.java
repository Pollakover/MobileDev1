package com.example.project5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] categories = {"Яблоки", "Бананы", "Апельсины","Груши"}; // пример списка категорий

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categories);
        listView.setAdapter(adapter);

        // Обработчик нажатия на элемент списка
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Определение, какую активность открыть в зависимости от выбранной категории
                switch (position) {
                    case 0: // Яблоки
                        startActivity(new Intent(MainActivity.this, SecondActivity.class));
                        break;
                    case 1: // Бананы
                        startActivity(new Intent(MainActivity.this, ThirdActivity.class));
                        break;
                    case 2: // Апельсины
                        startActivity(new Intent(MainActivity.this, FourthActivity.class));
                        break;
                    case 3: // а
                        startActivity(new Intent(MainActivity.this, FifthActivity.class));
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
