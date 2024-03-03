package com.example.project2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    //Получение данных
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView messageText = new TextView(this);
        messageText.setTextSize(40);
        setContentView(messageText);

        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
            String name = arguments.get("name").toString();
            int age = arguments.getInt("age");
            messageText.setText("Имя: " + name + "\nВозраст: " + age);
        }
    }
}