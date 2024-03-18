package com.example.project5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Spinner spinnerOranges = findViewById(R.id.spinnerOranges);
        // Создаем массив сортов апельсинов или получаем его из ресурсов
        String[] orangeVarieties = {"Сорт 1", "Сорт 2", "Сорт 3", "Сорт 4"};

        // Создаем адаптер для spinner с использованием стандартного шаблона и массива сортов апельсинов
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, orangeVarieties);

        // Присваиваем адаптер spinner'у
        spinnerOranges.setAdapter(adapter);

        // Устанавливаем слушатель на выбор элемента
        spinnerOranges.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Показываем Toast с выбранным сортом апельсина
                Toast.makeText(FourthActivity.this, "Выбран: " + orangeVarieties[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Действие при отсутствии выбора (можно оставить пустым)
            }
        });
    }
}
