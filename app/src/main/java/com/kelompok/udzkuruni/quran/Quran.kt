package com.kelompok.udzkuruni.quran

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kelompok.udzkuruni.R
import com.kelompok.udzkuruni.quran.Modules.Database.DatabaseHelper
import com.kelompok.udzkuruni.quran.Modules.ImportFromFile.Literation
import com.kelompok.udzkuruni.quran.Modules.ImportFromFile.LiterationInteractor

class Quran :  AppCompatActivity(), Literation {

    val interactor = LiterationInteractor(this, this)
    val databaseHelper = DatabaseHelper(this)

    override fun successInputDatabase() {
        openNextActivity()
    }

    override fun failedInputDatabase() {
        databaseHelper.clearTable()
        interactor.setData()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (databaseHelper.isDataAvailable()){
            openNextActivity()
        }else{
            databaseHelper.clearTable()
            interactor.setData()
        }
    }

    fun openNextActivity(){
        val intent = Intent(this, ListSurahActivity::class.java)
        startActivity(intent)
        finish()
    }
}
