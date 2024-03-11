package com.example.project4;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import android.widget.Toast;

public class ThirdFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private List<ListItem> items;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Инициализация данных
        items = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            items.add(new ListItem("Элемент  " + (i + 1), R.mipmap.ic_launcher));
        }

        adapter = new RecyclerViewAdapter(getContext(), items);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ListItem item) {
                Toast.makeText(getContext(), "Вы нажали на " + item.getText(), Toast.LENGTH_SHORT).show();
                Log.d("ThirdFragment", "Пользователь нажал на " + item.getText());
            }
        });

        return view;
    }
}