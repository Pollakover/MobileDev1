package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "User_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"onCreate message");
        setContentView(R.layout.activity_main);

        Button programmed = findViewById(R.id.button);

        // Реализация обработчика программно
        programmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Реализация обработчика программно", Toast.LENGTH_LONG).show();

                EditText nameText = findViewById(R.id.name);
                EditText ageText = findViewById(R.id.age);

                String name = nameText.getText().toString();
                int age = Integer.parseInt(ageText.getText().toString());

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                startActivity(intent);

            }
        });
    }

    // Реализация обработчика декларативно
    public void onNextActivity(View view) {
        Toast.makeText(this, "Реализация обработчика декларативно", Toast.LENGTH_LONG).show();
        EditText nameText = findViewById(R.id.name);
        EditText ageText = findViewById(R.id.age);

        String name = nameText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name", name);
        intent.putExtra("age", age);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"onStart message");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG,"onResume message");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG,"onPause message");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop message");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy message");
    }
}