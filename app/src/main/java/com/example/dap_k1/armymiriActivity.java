package com.example.dap_k1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class armymiriActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.armymiri_layout);

        findViewById(R.id.imageButton11).setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });
    }
}
