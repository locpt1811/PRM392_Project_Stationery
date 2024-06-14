package com.example.prm392_project_stationery;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        String productName = getIntent().getStringExtra("productName");
        double productPrice = getIntent().getDoubleExtra("productPrice", 0.0);
        String productDescription = getIntent().getStringExtra("productDescription");

        TextView productNameTextView = findViewById(R.id.productName);
        TextView productPriceTextView = findViewById(R.id.productPrice);
        TextView productDescriptionTextView = findViewById(R.id.productDescription);

        productNameTextView.setText(productName);
        productPriceTextView.setText(String.valueOf(productPrice));
        productDescriptionTextView.setText(productDescription);
    }
}