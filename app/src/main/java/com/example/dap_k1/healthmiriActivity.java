package com.example.dap_k1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class healthmiriActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.healthmiri_layout);

        findViewById(R.id.imageView888).setOnClickListener(v -> {
            startActivity(new Intent(this, updateActivity.class));
        });
    }
}
