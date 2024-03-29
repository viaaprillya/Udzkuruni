package com.kelompok.udzkuruni;

import android.content.Intent;
import android.media.Image;
import android.nfc.Tag;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Kuis extends AppCompatActivity {

    //TODO::  tambah Soal (Supaya yang dirandom makin banyak)

    String[][] soal_1= {{"alif_pg","ba_pg","ta_pg"}, // nama file gambar soal
            {"Alif","Ba", "Ta"}, // content description soal
            {"satux","dua","tiga","empat","lima","enam"}, // nama file gambar braille
            {"1","","","","",""}, // content description gambar braille
            {"Alif"}}; // Jawaban
    String[][] soal_2 = {{"alif_pg","ba_pg","ta_pg"}, // nama file gambar soal
            {"Alif","Ba", "Ta"}, // content description soal
            {"satux","duax","tiga","empat","lima","enam"}, // nama file gambar braille
            {"1","2","","","",""}, // content description gambar braille
            {"Ba"}}; // Jawaban
    String[][] soal_3= {{"ba_pg","jim_pg","ta_pg"}, // nama file gambar soal
            {"Ba","Jim", "Ta"}, // content description soal
            {"satu","duax","tigax","empatx","limax","enam"}, // nama file gambar braille
            {"","2","3","4","5",""}, // content description gambar braille
            {"Ta"}}; // Jawaban
    String[][] soal_4 = {{"kha_pg","jim_pg","tsa_pg"}, // nama file gambar soal
            {"Kha","Jim", "Tsa"}, // content description soal
            {"satux","dua","tiga","empatx","limax","enamx"}, // nama file gambar braille
            {"1","","","4","5","6"}, // content description gambar braille
            {"Tsa"}}; // Jawaban
    String[][] soal_5 = {{"ain_pg","jim_pg","ya_pg"}, // nama file gambar soal
            {"Ain","Jim", "Ya"}, // content description soal
            {"satu","duax","tiga","empatx","limax","enam"}, // nama file gambar braille
            {"","2","","4","5",""}, // content description gambar braille
            {"Jim"}}; // Jawaban
    String[][] soal_6 = {{"ba_pg","kha_pg","ta_pg"}, // nama file gambar soal
            {"Ba","Kha", "Ta"}, // content description soal
            {"satux","dua","tiga","empat","limax","enamx"}, // nama file gambar braille
            {"1","","","","5","6"}, // content description gambar braille
            {"Kha"}}; // Jawaban
    String[][] soal_7 = {{"kha_pg","jim_pg","kho_pg"}, // nama file gambar soal
            {"Kha","Jim","Kho"}, // content description soal
            {"satux","dua","tigax","empatx","lima","enamx"}, // nama file gambar braille
            {"1","","3","4","","6"}, // content description gambar braille
            {"Kho"}}; // Jawaban
    String[][] soal_8 = {{"dal_pg","jim_pg","tsa_pg"}, // nama file gambar soal
            {"Dal","Jim", "Tsa"}, // content description soal
            {"satux","dua","tiga","empatx","limax","enam"}, // nama file gambar braille
            {"1","","","4","5",""}, // content description gambar braille
            {"Dal"}}; // Jawaban
    String[][] soal_9 = {{"za_pg","dza_pg","kha_pg"}, // nama file gambar soal
            {"Za","Dzal", "Kha"}, // content description soal
            {"satu","duax","tigax","empatx","lima","enamx"}, // nama file gambar braille
            {"","2","3","4","","6"}, // content description gambar braille
            {"Dzal"}}; // Jawaban
    String[][] soal_10 = {{"za_pg","ro_pg","sin_pg"}, // nama file gambar soal
            {"Za","Ro", "Sin"}, // content description soal
            {"satux","duax","tigax","empat","limax","enam"}, // nama file gambar braille
            {"1","2","3","","5",""}, // content description gambar braille
            {"Ro"}}; // Jawaban

    String[][][] kunci = {soal_1, soal_2,soal_3,soal_4,soal_5,soal_6,soal_7,soal_8,soal_9,soal_10};

    ImageButton pilhan1, pilhan2,pilhan3;
    ImageView satu, dua, tiga, empat, lima, enam;
    TextView levelTV, skorTV;
    Integer level = 1;
    Integer skor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        setKuis();
    }


    public void setKuis() {
//        selected = getRandom(kunci);
        shuffleArray(kunci);
        pilhan1 =  findViewById(R.id.pilihan1);
        pilhan2 =  findViewById(R.id.pilihan2);
        pilhan3 =  findViewById(R.id.pilihan3);


        pilhan1.setBackgroundResource(getResources().getIdentifier(kunci[level-1][0][0] , "drawable", getPackageName()));
        pilhan2.setBackgroundResource(getResources().getIdentifier(kunci[level-1][0][1] , "drawable", getPackageName()));
//        pilhan2.setBackgroundResource(R.drawable.alif);
        pilhan3.setBackgroundResource(getResources().getIdentifier(kunci[level-1][0][2] , "drawable", getPackageName()));

        pilhan1.setContentDescription(kunci[level-1][1][0]);
        pilhan2.setContentDescription(kunci[level-1][1][1]);
        pilhan3.setContentDescription(kunci[level-1][1][2]);

        satu = findViewById(R.id.satu);
        dua =  findViewById(R.id.dua);
        tiga =  findViewById(R.id.tiga);
        empat =  findViewById(R.id.empat);
        lima =  findViewById(R.id.lima);
        enam =  findViewById(R.id.enam);

        satu.setBackgroundResource(getResources().getIdentifier(kunci[level-1][2][0] , "drawable", getPackageName()));
        dua.setBackgroundResource(getResources().getIdentifier(kunci[level-1][2][1] , "drawable", getPackageName()));
        tiga.setBackgroundResource(getResources().getIdentifier(kunci[level-1][2][2] , "drawable", getPackageName()));
        empat.setBackgroundResource(getResources().getIdentifier(kunci[level-1][2][3] , "drawable", getPackageName()));
        lima.setBackgroundResource(getResources().getIdentifier(kunci[level-1][2][4] , "drawable", getPackageName()));
        enam.setBackgroundResource(getResources().getIdentifier(kunci[level-1][2][5] , "drawable", getPackageName()));

        satu.setContentDescription(kunci[level-1][3][0]);
        dua.setContentDescription(kunci[level-1][3][1]);
        tiga.setContentDescription(kunci[level-1][3][2]);
        empat.setContentDescription(kunci[level-1][3][3]);
        lima.setContentDescription(kunci[level-1][3][4]);
        enam.setContentDescription(kunci[level-1][3][5]);

        levelTV = findViewById(R.id.textKuis);
        levelTV.setText(level.toString());

        skorTV = findViewById(R.id.textNilaiSkor);
        skorTV.setText(skor.toString());

    }
    public static String[][] getRandom(String[][][] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    // Implementing Fisher–Yates shuffle
    static void shuffleArray(String[][][] array)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String[][] a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    public void checkAnswer(View view ){
        ImageButton jawaban = findViewById(view.getId());
        String btnDesc = jawaban.getContentDescription().toString();

        String alert;
        String answer = kunci[level-1][4][0];
        System.out.println(answer);
        if(btnDesc.equals(answer)){
            alert="Benar!";
            if (level < 10){
                skor+=10;
                level++;
                setKuis();
            }

            else if (level == 10){
                skor+=10;
                Intent intent = new Intent(Kuis.this, KuisSkorActivity.class);
                intent.putExtra("skor", skor);
                startActivity(intent);
            }
        }
        else{
            alert="Salah!";
            skor-=5;
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(alert);
        builder.show();
    }
}
