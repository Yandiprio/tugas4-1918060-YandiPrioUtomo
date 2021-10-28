package com.example.pertemuan4_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private itemAdapter adapter;
    private ArrayList<item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new itemAdapter(itemArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData(){
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new item("Tom And Jerry", "Tom Story", "Comedy",R.drawable.tomjerry));
        itemArrayList.add(new item("Fast And Forious 9", "Justin Lin", "Action",R.drawable.f9));
        itemArrayList.add(new item("Insidious", "James Wan", "Horror",R.drawable.insidious));
        itemArrayList.add(new item("Spongebob", "Tim Hill", "Cartoon",R.drawable.spongebob));
        itemArrayList.add(new item("Cinderella", "Kenneth Branagh", "Fantasy",R.drawable.cinderella));
        itemArrayList.add(new item("The Raid", "Gareth Evans", "Action",R.drawable.theraid));
        itemArrayList.add(new item("Dilan 1991", "Pidi Baiq", "Action",R.drawable.dilan));
    }
}