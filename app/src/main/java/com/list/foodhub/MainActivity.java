package com.list.foodhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lookup the recyclerview in activity layout
        RecyclerView tvItems = (RecyclerView) findViewById(R.id.tvItem);

        // Initialize contacts
        items = Item.createItemsList(20);
        // Create adapter passing in the sample user data
        ItemsAdapter adapter = new ItemsAdapter(items);
        // Attach the adapter to the recyclerview to populate items
        tvItems.setAdapter(adapter);
        // Set layout manager to position the items
        tvItems.setLayoutManager(new LinearLayoutManager(this));
    }
}