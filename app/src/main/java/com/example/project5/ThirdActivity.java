package com.example.project5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // Пример текста для ScrollView
        //TextView textView = findViewById(R.id.textViewBananas);
        //StringBuilder stringBuilder = new StringBuilder();
        //for (int i = 0; i < 20; i++) {
            //stringBuilder.append("Банан ").append(i + 1).append("\n");
        //}
        //textView.setText(stringBuilder.toString());

        // Пример EditText
        EditText editText = findViewById(R.id.editTextBananas);
        // Здесь вы можете добавить логику для обработки введенного текста
    }
}
