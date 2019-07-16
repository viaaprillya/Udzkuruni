package com.kelompok.udzkuruni;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Kuis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

    }

    public void checkAnswer(View view ){
        ImageButton jawaban = findViewById(view.getId());
        String btnDesc = jawaban.getContentDescription().toString();

        String alert;

        if(btnDesc.equals("Alif")){
            alert="Benar!";
        }
        else{
            alert="Salah!";
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(alert);
        builder.show();
    }
}
