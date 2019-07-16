package com.kelompok.udzkuruni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Dommah extends AppCompatActivity {

    public void onBackPressed() {
        Intent daftarHarakat = new Intent(getApplicationContext(),daftarHarakat.class);
        startActivity(daftarHarakat);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dommah);
    }
}
