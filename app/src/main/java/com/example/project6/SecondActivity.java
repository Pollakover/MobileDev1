package com.example.project6;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        // Получаем ActionBar
        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true); // Показать кнопку назад
            actionBar.setTitle("Четвертый фрагмент"); // Установить заголовок
            BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
            bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
                if (item.getItemId() == R.id.fourth) {
                    actionBar.setTitle("Четвертый фрагмент");
                    NavController navController = NavHostFragment.findNavController(SecondActivity.this.getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment));
                    navController.navigate(R.id.fourthFragment);
                } else if (item.getItemId() == R.id.fifth) {
                    actionBar.setTitle("Пятый фрагмент");
                    NavController navController = NavHostFragment.findNavController(SecondActivity.this.getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment));
                    navController.navigate(R.id.fifthFragment);
                } else if (item.getItemId() == R.id.sixth) {
                    actionBar.setTitle("Шестой фрагмент");
                    NavController navController = NavHostFragment.findNavController(SecondActivity.this.getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment));
                    navController.navigate(R.id.sixthFragment);
                }
                return true;
            });
        }
    }
}