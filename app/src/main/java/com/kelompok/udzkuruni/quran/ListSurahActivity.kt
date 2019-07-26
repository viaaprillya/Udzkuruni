package com.kelompok.udzkuruni.quran

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager

import com.kelompok.udzkuruni.R
import com.kelompok.udzkuruni.quran.Entities.List.Surah
import com.kelompok.udzkuruni.quran.Entities.Models.SurahModel
import com.kelompok.udzkuruni.quran.Support.Utils.Adapter
import com.kelompok.udzkuruni.quran.ViewHolders.SurahViewHolder
import kotlinx.android.synthetic.main.activity_list_surrah.*

class ListSurahActivity : AppCompatActivity() {

    lateinit var  adapter : Adapter<SurahModel, SurahViewHolder>
    val surah = Surah()
    val listSurah: ArrayList<SurahModel>
        get() = surah.surahList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_surrah)
        setToolbar()
        setList()
    }

    private fun setToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
    }

    private fun setList(){
        val manager = LinearLayoutManager(this)
        adapter = object : Adapter<SurahModel, SurahViewHolder>(R.layout.list_surah, SurahViewHolder::class.java,
                SurahModel::class.java, listSurah){
            override fun bindView(holder: SurahViewHolder, tipeData: SurahModel, position: Int) {
                holder.onBind(applicationContext, tipeData)
            }
        }

        list_surah.layoutManager = manager
        list_surah.adapter = adapter


    }
}
