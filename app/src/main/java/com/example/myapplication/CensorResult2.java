package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CensorResult2 extends AppCompatActivity {

    private Button main_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_censor_result2);

        main_move = findViewById(R.id.main_move);
        main_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CensorResult2.this, QRscan.class);
                startActivity(intent);
            }
        });
    }
}