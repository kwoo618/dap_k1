package com.example.dap_k1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class asd extends AppCompatActivity {

    private Button btn3;
    private boolean isEnabled = true;  // 버튼 상태 추적용 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asdasd);

        btn3 = findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isEnabled = !isEnabled;           // 상태 반전
                btn3.setEnabled(isEnabled);       // 버튼 활성화/비활성화
                btn3.setText(isEnabled ? "눌러서 비활성화" : "비활성화됨");
            }
        });
    }
}
