package com.epicodus.productsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mFindProductButton;
    private EditText mProductEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProductEditText = (EditText) findViewById(R.id.productEditText);
        mFindProductButton = (Button) findViewById(R.id.findProductButton);
            mFindProductButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String product = mProductEditText.getText().toString();
                    Log.d(TAG, product);
                    Intent intent = new Intent(MainActivity.this, ProductActivity.class);
                    startActivity(intent);
                }
            });
    }
}

