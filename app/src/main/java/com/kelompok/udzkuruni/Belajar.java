package com.kelompok.udzkuruni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Belajar extends AppCompatActivity {

    ImageButton belajarHurufbtn,belajarHarakatbtn, panduanBelajarbtn;

    @Override
    public void onBackPressed() {
        Intent menuUtama = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(menuUtama);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        belajarHurufbtn=findViewById(R.id.belajarhuruf);
        belajarHurufbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftarHuruf = new Intent(getApplicationContext(),daftarHuruf.class);
                startActivity(daftarHuruf);
            }
        });

        belajarHarakatbtn =findViewById(R.id.belajarharakat);
        belajarHarakatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftarHarakat = new Intent(getApplicationContext(),daftarHarakat.class);
                startActivity(daftarHarakat);
            }
        });

        panduanBelajarbtn =findViewById(R.id.panduan);
        panduanBelajarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent panduanBelajar = new Intent(getApplicationContext(),panduanBelajar.class);
                startActivity(panduanBelajar);
            }
        });
    }
}
