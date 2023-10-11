package com.rival.belajardoadandzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rival.belajardoadandzikirapp.R
import com.rival.belajardoadandzikirapp.adapter.DzikirDoaAdapter
import com.rival.belajardoadandzikirapp.databinding.ActivityDzikirSetiapSaatBinding
import com.rival.belajardoadandzikirapp.databinding.ActivitySunnahQouliyahBinding
import com.rival.belajardoadandzikirapp.model.DataDzikirDoa

class DzikirSetiapSaatActivity : AppCompatActivity() {
    lateinit var binding: ActivityDzikirSetiapSaatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirSetiapSaatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir setiap saat"

        binding.apply {
            rvDzikirSetiapSaat.layoutManager = LinearLayoutManager(this@DzikirSetiapSaatActivity)
            rvDzikirSetiapSaat.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}