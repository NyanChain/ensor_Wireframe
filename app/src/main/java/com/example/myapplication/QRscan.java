package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QRscan extends AppCompatActivity {

    private Button result1_move;
    private Button result2_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrscan);

        result1_move = findViewById(R.id.result1_move);
        result1_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QRscan.this, CensorResult1.class);
                startActivity(intent);
            }
        });

        result2_move = findViewById(R.id.result2_move);
        result2_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QRscan.this, CensorResult2.class);
                startActivity(intent);
            }
        });
    }
}