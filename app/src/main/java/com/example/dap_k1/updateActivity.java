package com.example.dap_k1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class updateActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_layout);

        findViewById(R.id.btleft_btn).setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });

    }
}
