package com.epicodus.productsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {
    private TextView mProductTextView;
    private ListView mListView;
    private String[] locations = new String[] {"BestBuy", "Office Depot", "Apple Store", "Microsoft Store", "Target", "Walmart", "Fry's Electronics", "PSU Bookstore", "Computek", "Geek Choice", "Happy Hamster Computers"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        mListView = (ListView) findViewById(R.id.listView);
        mProductTextView = (TextView) findViewById(R.id.productTextView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, locations);
        mListView.setAdapter(adapter);

        Intent intent = getIntent();
        String product = intent.getStringExtra("product");
        mProductTextView.setText("Here are all the stores that carry '" + product + "':");
    }
}
