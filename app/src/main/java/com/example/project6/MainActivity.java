package com.example.project6;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    public DrawerLayout drawer;
    public ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawer = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
        MainActivity.this,drawer, R.string.drawer_open, R.string.drawer_close);
        if (drawer != null) {
            drawer.addDrawerListener(toggle);
            toggle.syncState();
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Первый фрагмент");

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Обработка нажатий на элементы меню
                if (item.getItemId() == R.id.nav_first) {
                    // Переход на первый фрагмент
                    NavController navController = NavHostFragment.findNavController(MainActivity.this.getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment));
                    navController.navigate(R.id.firstFragment);
                    actionBar.setTitle("Первый фрагмент");
                }
                if (item.getItemId() == R.id.nav_second) {
                    // Переход на второй фрагмент
                    NavController navController = NavHostFragment.findNavController(MainActivity.this.getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment));
                    navController.navigate(R.id.secondFragment);
                    actionBar.setTitle("Второй фрагмент");
                }
                if (item.getItemId() == R.id.nav_third) {
                    // Переход на третий фрагмент
                    NavController navController = NavHostFragment.findNavController(MainActivity.this.getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment));
                    navController.navigate(R.id.thirdFragment);
                    actionBar.setTitle("Третий фрагмент");
                }
                if (item.getItemId() == R.id.nav_activity) {
                    // Переход на вторую активность
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
                return true;
            }
        });
    }
}