package com.epicodus.productsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.findProductButton) Button mFindProductButton;
    @Bind(R.id.productEditText) EditText mProductEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

            mFindProductButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String product = mProductEditText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, ProductActivity.class);
                    intent.putExtra("product", product);
                    startActivity(intent);
                }
            });
    }
}

