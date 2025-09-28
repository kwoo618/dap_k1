package com.example.dap_k1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class moneymiriActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moneymiri_layout);

        findViewById(R.id.imageView888).setOnClickListener(v -> {
            startActivity(new Intent(this, updateActivity.class));
        });
    }
}
