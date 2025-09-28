package com.example.dap_k1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private FrameLayout menuBar;
    private LinearLayout menuPanel; // 파란색 메뉴 UI
    private ImageButton menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 메뉴 관련 UI
        menuBar = findViewById(R.id.menubar);
        menuPanel = findViewById(R.id.menu_panel); // 파란색 메뉴 부분
        menuButton = findViewById(R.id.menu_btn);

        // 메뉴 여는 버튼
        menuButton.setOnClickListener(v -> menuBar.setVisibility(View.VISIBLE));

        // 메뉴바 외부 클릭 시 숨기기
        menuBar.setOnTouchListener((v, event) -> {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                int[] location = new int[2];
                menuPanel.getLocationOnScreen(location);
                int left = location[0];
                int top = location[1];
                int right = left + menuPanel.getWidth();
                int bottom = top + menuPanel.getHeight();

                float x = event.getRawX();
                float y = event.getRawY();

                // 파란 메뉴 영역 바깥이면 숨김
                if (x < left || x > right || y < top || y > bottom) {
                    menuBar.setVisibility(View.INVISIBLE);
                    return true;
                }
            }
            return false;
        });


        // 사전 액티비티로 이동
        findViewById(R.id.dic_image).setOnClickListener(v -> {
            startActivity(new Intent(this, DicActivity.class));
        });

        // 각 기능별 버튼들
        findViewById(R.id.tax_button).setOnClickListener(v -> {
            startActivity(new Intent(this, dutymiriActivity.class));
        });

        findViewById(R.id.health_button).setOnClickListener(v -> {
            startActivity(new Intent(this, healthmiriActivity.class));
        });

        findViewById(R.id.tech_button).setOnClickListener(v -> {
            startActivity(new Intent(this, moneymiriActivity.class));
        });

        findViewById(R.id.job_button).setOnClickListener(v -> {
            startActivity(new Intent(this, jobmiriActivity.class));
        });

        findViewById(R.id.personal_button).setOnClickListener(v -> {
            startActivity(new Intent(this, lifemiriActivity.class));
        });

        findViewById(R.id.imageButton9).setOnClickListener(v -> {
            startActivity(new Intent(this, updateActivity.class));
        });

        findViewById(R.id.imageView888).setOnClickListener(v -> {
            startActivity(new Intent(this, updateActivity.class));
        });

        findViewById(R.id.calendar_image).setOnClickListener(v -> {
            startActivity(new Intent(this, updateActivity.class));
        });

        findViewById(R.id.question).setOnClickListener(v -> {
            startActivity(new Intent(this, updateActivity.class));
        });

        findViewById(R.id.gov).setOnClickListener(v -> {
            String url = "https://www.gov.kr/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        findViewById(R.id.work24).setOnClickListener(v -> {
            String url = "www.work24.go.kr";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        //--------------------------------------메뉴------------------------------------

        findViewById(R.id.star_text).setOnClickListener(v -> {
            startActivity(new Intent(this, updateActivity.class));
        });

        findViewById(R.id.tax_text).setOnClickListener(v -> {
            startActivity(new Intent(this, dutymiriActivity.class));
        });

        findViewById(R.id.health_text).setOnClickListener(v -> {
            startActivity(new Intent(this, healthmiriActivity.class));
        });

        findViewById(R.id.monet_text).setOnClickListener(v -> {
            startActivity(new Intent(this, moneymiriActivity.class));
        });

        findViewById(R.id.jop_text).setOnClickListener(v -> {
            startActivity(new Intent(this, jobmiriActivity.class));
        });

        findViewById(R.id.life_text).setOnClickListener(v -> {
            startActivity(new Intent(this, lifemiriActivity.class));
        });

        findViewById(R.id.school_text).setOnClickListener(v -> {
            startActivity(new Intent(this, schoolmiriActivity.class));
        });

        findViewById(R.id.army_text).setOnClickListener(v -> {
            startActivity(new Intent(this, armymiriActivity.class));
        });

        findViewById(R.id.gov_text).setOnClickListener(v -> {
            String url = "https://www.gov.kr/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        findViewById(R.id.work24_text).setOnClickListener(v -> {
            String url = "www.work24.go.kr";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        findViewById(R.id.bohum_text).setOnClickListener(v -> {
            String url = "https://www.nhis.or.kr/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        findViewById(R.id.hometax_text).setOnClickListener(v -> {
            String url = "https://hometax.go.kr/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        findViewById(R.id.janghak_text).setOnClickListener(v -> {
            String url = "https://www.kosaf.go.kr";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        //--------------------------------------메뉴------------------------------------

    }
}
