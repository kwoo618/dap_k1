package com.example.dap_k1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class dutymiriActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dutymiri_layout);

        findViewById(R.id.duty2).setOnClickListener(v -> {
            startActivity(new Intent(this, Duty2Activity.class));
        });
    }
}
