package com.example.dap_k1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class DicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dic_layout);  // 연결할 레이아웃

        findViewById(R.id.imageButton3).setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });
    }
}
