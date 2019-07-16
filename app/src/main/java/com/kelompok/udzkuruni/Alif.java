package com.kelompok.udzkuruni;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Alif extends AppCompatActivity {
    ImageButton list,next;
    ImageView kotak;

    @Override
    public void onBackPressed() {
        Intent daftarHuruf = new Intent(getApplicationContext(),daftarHuruf.class);
        startActivity(daftarHuruf);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alif);

        //final MediaPlayer x = MediaPlayer.create(this,R.raw.indo);

        list = findViewById(R.id.list_huruf);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(getApplicationContext(),daftarHuruf.class);
                startActivity(list);
            }
        });

        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(),Ba.class);
                startActivity(next);

            }
        });

        /*
        kotak = findViewById(R.id.kotak);
        kotak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.start();
            }
        });
        */




    }
}
