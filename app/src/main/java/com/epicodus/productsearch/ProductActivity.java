package com.epicodus.productsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {
    private TextView mProductTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        mProductTextView = (TextView) findViewById(R.id.productTextView);
        Intent intent = getIntent();
        String product = intent.getStringExtra("product");
        mProductTextView.setText("Here are all the stores that carry " + product);
    }
}
