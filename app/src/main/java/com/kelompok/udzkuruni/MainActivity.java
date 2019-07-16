package com.kelompok.udzkuruni;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton belajarBtn,evaluasiBtn,quranBtn,tentangBtn;

    public void onBackPressed() {
        moveTaskToBack(true);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        belajarBtn = findViewById(R.id.belajar);
        belajarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent belajar = new Intent(getApplicationContext(),Belajar.class);
                startActivity(belajar);
            }
        });

        evaluasiBtn = findViewById(R.id.evaluasi);
        evaluasiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent evaluasi = new Intent(getApplicationContext(),Kuis.class);
                startActivity(evaluasi);
            }
        });

        quranBtn = findViewById(R.id.quran);
        quranBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Quran = new Intent(getApplicationContext(),Quran.class);
                startActivity(Quran);
            }
        });

        tentangBtn = findViewById(R.id.tentang);
        tentangBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Tentang = new Intent(getApplicationContext(),Tentang.class);
                startActivity(Tentang);
            }
        });
    }
}
