package com.kelompok.udzkuruni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Fathah extends AppCompatActivity {

    ImageButton list,next,kotak;

    public void onBackPressed() {
        Intent daftarHarakat = new Intent(getApplicationContext(),daftarHarakat.class);
        startActivity(daftarHarakat);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fathah);

        list = findViewById(R.id.list_huruf);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(getApplicationContext(),daftarHarakat.class);
                startActivity(list);
            }
        });

        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(),Kasrah.class);
                startActivity(next);
            }
        });

        kotak = findViewById(R.id.kotak);
        kotak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent huruf = new Intent(getApplicationContext(),Huruf_Fathah.class);
                startActivity(huruf);
            }
        });

    }
}
