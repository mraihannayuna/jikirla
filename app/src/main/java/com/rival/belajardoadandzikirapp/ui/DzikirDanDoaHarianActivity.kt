package com.rival.belajardoadandzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rival.belajardoadandzikirapp.R
import com.rival.belajardoadandzikirapp.adapter.DzikirDoaAdapter
import com.rival.belajardoadandzikirapp.databinding.ActivityDzikirDanDoaHarianBinding
import com.rival.belajardoadandzikirapp.databinding.ActivityDzikirSetiapSaatBinding
import com.rival.belajardoadandzikirapp.model.DataDzikirDoa
import com.rival.belajardoadandzikirapp.model.DzikirDoaModel

class DzikirDanDoaHarianActivity : AppCompatActivity() {
    lateinit var binding: ActivityDzikirDanDoaHarianBinding
    private val listDoaHarian: ArrayList<DzikirDoaModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirDanDoaHarianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setDataDoa()

        // action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir dan Doa Harian"




        binding.apply {
            rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this@DzikirDanDoaHarianActivity)
            rvDzikirDoaHarian.adapter = DzikirDoaAdapter(listDoaHarian)
        }

    }

    private fun setDataDoa() {
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafaz = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)


        for (data in desc.indices) {
            val doa = DzikirDoaModel(
                desc[data],
                lafaz[data],
                terjemah[data]
            )
            listDoaHarian.add(doa)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}