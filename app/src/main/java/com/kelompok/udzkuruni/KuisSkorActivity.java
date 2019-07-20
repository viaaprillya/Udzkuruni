package com.kelompok.udzkuruni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class KuisSkorActivity extends AppCompatActivity {

    Integer skor;
    ImageView bintang;
    TextView skorTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_skor);

        skor = getIntent().getIntExtra("skor",0);
        bintang = findViewById(R.id.bintang);
        skorTV = findViewById(R.id.text_skor2);
        setResult();
    }

    @Override
    public void onBackPressed() {
        finish();
        Intent intent = new Intent(KuisSkorActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void setResult() {
        if (skor == 100){
            // Bintang 3
            bintang.setBackgroundResource(R.drawable.threestarsfull);
            skorTV.setText(skor.toString());
        }else if( (skor < 100) && (skor >= 50) ){
            // Bintang 2
            bintang.setBackgroundResource(R.drawable.threestars2);
            skorTV.setText(skor.toString());
        }else if( (skor < 50) && (skor >= 10) ){
            // Bintang 1
            bintang.setBackgroundResource(R.drawable.threestars1);
            skorTV.setText(skor.toString());
        }else if( skor < 10 ){
            // Bintang 0
            bintang.setBackgroundResource(R.drawable.threestars);
            skorTV.setText(skor.toString());

        }
    }
}
