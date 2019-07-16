package com.kelompok.udzkuruni;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class daftarHarakat extends AppCompatActivity {

    ImageButton fathah,kasrah,dommah,fathahtain,kasrahtain,dommahtain,sukun,tasydid;

    public void onBackPressed() {
        Intent menuBelajar = new Intent(getApplicationContext(),Belajar.class);
        startActivity(menuBelajar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_harakat);

        fathah = findViewById(R.id.fathah);
        fathah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fathah = new Intent(getApplicationContext(),Fathah.class);
                startActivity(fathah);
            }
        });

        kasrah = findViewById(R.id.kasrah);
        kasrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kasrah = new Intent(getApplicationContext(),Kasrah.class);
                startActivity(kasrah);
            }
        });

        dommah = findViewById(R.id.dommah);
        dommah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dommah = new Intent(getApplicationContext(),Dommah.class);
                startActivity(dommah);
            }
        });
    }
}
