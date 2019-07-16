package com.kelompok.udzkuruni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class daftarHuruf extends AppCompatActivity {

    ImageButton alif,ba,ta,tsa,jim,kha,kho,dal,dzal,ro,dza,sin,syin,sod,dlod,to,dho,ain,goin,fak,kof,kaf,lam,mim,nun,wau,hak,lamalif,hamzah,ya;

    @Override
    public void onBackPressed() {
        Intent menuBelajar = new Intent(getApplicationContext(),Belajar.class);
        startActivity(menuBelajar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_huruf);


        alif = findViewById(R.id.alif);
        alif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alif = new Intent(getApplicationContext(),Alif.class);
                startActivity(alif);
            }
        });

        ba = findViewById(R.id.ba);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ba = new Intent(getApplicationContext(),Ba.class);
                startActivity(ba);
            }
        });

        ta = findViewById(R.id.ta);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ta = new Intent(getApplicationContext(),Ta.class);
                startActivity(ta);
            }
        });

        tsa = findViewById(R.id.tsa);
        tsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tsa = new Intent(getApplicationContext(),Tsa.class);
                startActivity(tsa);
            }
        });

        jim = findViewById(R.id.jim);
        jim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jim = new Intent(getApplicationContext(),Jim.class);
                startActivity(jim);
            }
        });

        kha = findViewById(R.id.kha);
        kha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kha = new Intent(getApplicationContext(),Kha.class);
                startActivity(kha);
            }
        });

        kho = findViewById(R.id.kho);
        kho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kho = new Intent(getApplicationContext(),Kho.class);
                startActivity(kho);
            }
        });

        dal = findViewById(R.id.dal);
        dal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dal = new Intent(getApplicationContext(),Dal.class);
                startActivity(dal);
            }
        });

        dzal = findViewById(R.id.dza);
        dzal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dzal = new Intent(getApplicationContext(),Dzal.class);
                startActivity(dzal);
            }
        });

        ro = findViewById(R.id.ro);
        ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ro = new Intent(getApplicationContext(),Ro.class);
                startActivity(ro);
            }
        });

        dza = findViewById(R.id.za);
        dza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dza = new Intent(getApplicationContext(),Dza.class);
                startActivity(dza);
            }
        });

        sin = findViewById(R.id.sin);
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sin = new Intent(getApplicationContext(),Sin.class);
                startActivity(sin);
            }
        });

        syin = findViewById(R.id.syin);
        syin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent syin = new Intent(getApplicationContext(),Syin.class);
                startActivity(syin);
            }
        });

        sod = findViewById(R.id.sad);
        sod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sod = new Intent(getApplicationContext(),Sod.class);
                startActivity(sod);
            }
        });

        dlod = findViewById(R.id.dlod);
        dlod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dlod = new Intent(getApplicationContext(),Dlod.class);
                startActivity(dlod);
            }
        });

        to = findViewById(R.id.to);
        to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent to = new Intent(getApplicationContext(),To.class);
                startActivity(to);
            }
        });

        dho = findViewById(R.id.dzo);
        dho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dho = new Intent(getApplicationContext(),Do.class);
                startActivity(dho);
            }
        });

        ain = findViewById(R.id.ain);
        ain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ain = new Intent(getApplicationContext(),Ain.class);
                startActivity(ain);
            }
        });

        goin = findViewById(R.id.goin);
        goin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goin = new Intent(getApplicationContext(),Goin.class);
                startActivity(goin);
            }
        });

        fak = findViewById(R.id.fak);
        fak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fak = new Intent(getApplicationContext(),Fak.class);
                startActivity(fak);
            }
        });

        kof = findViewById(R.id.kof);
        kof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kof = new Intent(getApplicationContext(),Kof.class);
                startActivity(kof);
            }
        });

        kaf = findViewById(R.id.kaf);
        kaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kaf = new Intent(getApplicationContext(),Kaf.class);
                startActivity(kaf);
            }
        });

        lam = findViewById(R.id.lam);
        lam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lam = new Intent(getApplicationContext(),Lam.class);
                startActivity(lam);
            }
        });

        mim = findViewById(R.id.mim);
        mim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mim = new Intent(getApplicationContext(),Mim.class);
                startActivity(mim);
            }
        });

        nun = findViewById(R.id.nun);
        nun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nun = new Intent(getApplicationContext(),Nun.class);
                startActivity(nun);
            }
        });

        wau = findViewById(R.id.wau);
        wau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wau = new Intent(getApplicationContext(),Wau.class);
                startActivity(wau);
            }
        });

        hak = findViewById(R.id.hak);
        hak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hak = new Intent(getApplicationContext(),Hak.class);
                startActivity(hak);
            }
        });

        lamalif = findViewById(R.id.lamalif);
        lamalif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lamalif = new Intent(getApplicationContext(),LamAlif.class);
                startActivity(lamalif);
            }
        });

        hamzah = findViewById(R.id.hamzah);
        hamzah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hamzah = new Intent(getApplicationContext(),Hamzah.class);
                startActivity(hamzah);
            }
        });

        ya = findViewById(R.id.ya);
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ya = new Intent(getApplicationContext(),Ya.class);
                startActivity(ya);
            }
        });





    }
}
