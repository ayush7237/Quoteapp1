package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.quoteapp.categories.categoriesAdapter;
import com.example.quoteapp.categories.categoriesList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
 private final List<categoriesList> categoriesLists = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView categoriesRecyclerView = findViewById(R.id.categoriesRecyclerView);
        categoriesRecyclerView.setHasFixedSize(true);
        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));

        // add categories to categoriesLists
        categoriesList motivationcategory = new categoriesList("motivation",R.drawable.img_207571_tonyrobbins);
        categoriesLists.add(motivationcategory); // add motivation category to categoriesLists

        // add categories to categoriesLists
        categoriesList lovecategory = new categoriesList("love",R.drawable.img_207569_thomasedison);
        categoriesLists.add(lovecategory); // add love category to categoriesLists

        // add categories to categoriesLists
        categoriesList motherlovecategory = new categoriesList("motherlove",R.drawable.img);
        categoriesLists.add(motherlovecategory); // add motherlove category to categoriesLists

        categoriesList gymcategory = new categoriesList("gym",R.drawable.img);
        categoriesLists.add(gymcategory); // add gym category to categoriesLists

        // set adapter to recyclerview
        categoriesRecyclerView.setAdapter(new categoriesAdapter(categoriesLists,MainActivity.this));
    }
}