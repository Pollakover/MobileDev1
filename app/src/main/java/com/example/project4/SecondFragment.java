package com.example.project4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);

        ListView listView = view.findViewById(R.id.listView);

        // Создание списка элементов для адаптера
        List<ListItem> items = new ArrayList<>();

        for (int i = 0; i < 200; i++) {
            items.add(new ListItem("Элемент " + (i+1), R.mipmap.ic_launcher));
        }

        ListViewAdapter adapter = new ListViewAdapter(getContext(), items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListItem clickedItem = items.get(position);
                Toast.makeText(getContext(), "Вы нажали на " + clickedItem.getText(), Toast.LENGTH_SHORT).show();
                Log.d("SecondFragment", "Пользователь нажал на " + clickedItem.getText());
            }
        });

        return view;
    }
}