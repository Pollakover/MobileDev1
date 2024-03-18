package com.example.project5;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FifthActivity extends AppCompatActivity {

    private ArrayList<String> fruitsList = new ArrayList<>();
    private ArrayAdapter<String> adapter;
    private EditText editTextFruit;
    private ListView listViewFruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        editTextFruit = findViewById(R.id.editTextFruit);
        listViewFruits = findViewById(R.id.listViewFruits);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonRemove = findViewById(R.id.buttonRemove);

        fruitsList.add("Груша 1");
        fruitsList.add("Груша 2");
        fruitsList.add("Груша 3");

        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_multiple_choice, fruitsList);
        listViewFruits.setAdapter(adapter);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fruit = editTextFruit.getText().toString();
                if (!fruit.isEmpty()) {
                    fruitsList.add(fruit);
                    adapter.notifyDataSetChanged();
                    editTextFruit.setText("");
                }
            }
        });

        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = listViewFruits.getCount() - 1; i >= 0; i--) {
                    if (listViewFruits.isItemChecked(i)) {
                        fruitsList.remove(i);
                    }
                }
                listViewFruits.clearChoices();
                adapter.notifyDataSetChanged();
            }
        });
    }
}
