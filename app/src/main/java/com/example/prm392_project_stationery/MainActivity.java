package com.example.prm392_project_stationery;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize your product list
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Product 1", 100.0, "Description 1"));
        productList.add(new Product("Product 2", 200.0, "Description 2"));
        productList.add(new Product("Product 3", 300.0, "Description 3"));
        productList.add(new Product("Product 4", 400.0, "Description 4"));
        productList.add(new Product("Product 5", 100.0, "Description 5"));
        productList.add(new Product("Product 6", 200.0, "Description 6"));
        productList.add(new Product("Product 7", 300.0, "Description 7"));
        productList.add(new Product("Product 8", 400.0, "Description 8"));
        productList.add(new Product("Product 9", 100.0, "Description 9"));
        productList.add(new Product("Product 10", 200.0,"Description 10"));
        productList.add(new Product("Product 11", 300.0, "Description 11"));
        productList.add(new Product("Product 12", 400.0, "Description 12"));
        // Add more products as needed

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new ProductAdapter(productList, this));
    }
}