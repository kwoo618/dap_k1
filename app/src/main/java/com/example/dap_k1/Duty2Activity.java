package com.example.dap_k1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class Duty2Activity  extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    ScrollView scrollView;

    View target1, target2, target3, target4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.duty_2page);

        findViewById(R.id.imageButton3).setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        scrollView = findViewById(R.id.detailscroll);

        target1 = findViewById(R.id.ttt1);
        target2 = findViewById(R.id.ttt2);
        target3 = findViewById(R.id.ttt3);
        target4 = findViewById(R.id.ttt4);

        Button[] buttons = {btn1, btn2, btn3, btn4};
        View[] targets = {target1, target2, target3, target4};

        int defaultColor = Color.WHITE;
        int selectedColor = Color.BLACK;

        for (int i = 0; i < buttons.length; i++) {
            int index = i;
            buttons[i].setOnClickListener(v -> {
                for (Button b : buttons) {
                    b.setTextColor(defaultColor);
                }
                buttons[index].setTextColor(selectedColor);

                // 해당 뷰 위치로 스크롤 이동 (부드럽게)
                scrollView.smoothScrollTo(0, targets[index].getTop());
            });
        }
    }
}
