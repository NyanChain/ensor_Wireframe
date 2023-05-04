package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    private Button qr_move;
    private Button infor_move;
    private Button mypage_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        qr_move = findViewById(R.id.qr_move);
        qr_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, QRscan.class);
                startActivity(intent);
            }
        });

        infor_move = findViewById(R.id.infor_move);
        infor_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, InforList.class);
                startActivity(intent);
            }
        });

        mypage_move = findViewById(R.id.mypage_move);
        mypage_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, MyPage.class);
                startActivity(intent);
            }
        });
    }
}