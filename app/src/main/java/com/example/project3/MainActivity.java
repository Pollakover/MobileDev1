package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.second_layout);
        setContentView(R.layout.activity_main);

        //Программная реализация интерфейса
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setBackgroundColor(0xFFE0E0E0);
        textView.setText("Программная реализация интерфейса");
        textView.setTextSize(20);

        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(20,30,40,50);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        textView.setLayoutParams(layoutParams);
        textView.setPadding(20,20,20,20);
        constraintLayout.addView(textView);
        //setContentView(constraintLayout);

    }
}