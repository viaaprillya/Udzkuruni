package com.kelompok.udzkuruni.quran

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.kelompok.udzkuruni.R
import com.kelompok.udzkuruni.quran.Modules.Database.DatabaseHelper
import com.kelompok.udzkuruni.quran.Modules.Database.DatabasePresenter
import com.kelompok.udzkuruni.quran.Modules.Database.DatabaseView
import com.kelompok.udzkuruni.quran.Support.Utils.Adapter
import com.kelompok.udzkuruni.quran.ViewHolders.VerseViewHolder
import kotlinx.android.synthetic.main.activity_list_verse.*
import kotlinx.android.synthetic.main.list_surah.*
import com.kelompok.udzkuruni.quran.Entities.Models.Quran

class ListVerseActivity : AppCompatActivity(), DatabaseView {

    lateinit var  adapter: Adapter<Quran, VerseViewHolder>
    lateinit var bundle: Bundle

    var presenter = DatabasePresenter(DatabaseHelper(this), this)
    var surahTitle = ""
    var surahId = 1
    var verseId = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_verse)
        setToolbar()


        bundle = intent.extras
        surahTitle = bundle.getString("surahTitle")
        surahId = bundle.getInt("surahId")
        verseId = bundle.getInt("verseId")

        presenter.getDataBySurahId(surahId)

        text_title_surah_1.text = surahTitle

    }

    fun setToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun successGetDataBySurahId(list: List<Quran>) {
        setList(list)
    }

    fun setList(list: List<Quran>) {


        val manager = LinearLayoutManager(this)
        adapter = object : Adapter<Quran, VerseViewHolder>(R.layout.list_verse, VerseViewHolder::class.java,
                Quran::class.java, list) {
            override fun bindView(holder: VerseViewHolder, tipeData: Quran, position: Int) {
                holder.onBind(tipeData)

            }
        }

        list_verse.layoutManager = manager
        list_verse.adapter = adapter
    }
}
