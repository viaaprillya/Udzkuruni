package com.kelompok.udzkuruni;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Huruf_Fathah extends AppCompatActivity {

    ImageButton alif,ba,ta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf__fathah);

        final MediaPlayer alif_fathah = MediaPlayer.create(this,R.raw.aliffathah);
        final MediaPlayer ba_fathah = MediaPlayer.create(this,R.raw.bafathah);
        final MediaPlayer ta_fathah = MediaPlayer.create(this,R.raw.tafathah);

        alif = findViewById(R.id.alif);
        alif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alif_fathah.start();
            }
        });

        ba = findViewById(R.id.ba);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ba_fathah.start();
            }
        });

        ta = findViewById(R.id.ta);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ta_fathah.start();
            }
        });
    }
}
