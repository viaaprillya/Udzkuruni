package com.kelompok.udzkuruni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Lam extends AppCompatActivity {

    ImageButton list,next,previous;

    @Override
    public void onBackPressed() {
        Intent daftarHuruf = new Intent(getApplicationContext(),daftarHuruf.class);
        startActivity(daftarHuruf);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lam);

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
                Intent next = new Intent(getApplicationContext(),Mim.class);
                startActivity(next);
            }
        });

        previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previous = new Intent(getApplicationContext(),Kaf.class);
                startActivity(previous);
            }
        });
    }
}
