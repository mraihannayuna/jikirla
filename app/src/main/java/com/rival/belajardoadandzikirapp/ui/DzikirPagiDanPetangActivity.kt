package com.rival.belajardoadandzikirapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import com.rival.belajardoadandzikirapp.R
import com.rival.belajardoadandzikirapp.adapter.ArtikelAdapter
import com.rival.belajardoadandzikirapp.adapter.DzikirDoaAdapter
import com.rival.belajardoadandzikirapp.databinding.ActivityDzikirPagiDanPetangBinding
import com.rival.belajardoadandzikirapp.databinding.ActivityDzikirSetiapSaatBinding
import com.rival.belajardoadandzikirapp.model.DataDzikirDoa
import com.rival.belajardoadandzikirapp.model.DzikirDoaModel
import com.rival.belajardoadandzikirapp.ui.detail.DzikirPagiActivity
import com.rival.belajardoadandzikirapp.ui.detail.DzikirPetangActivity

class DzikirPagiDanPetangActivity : AppCompatActivity(), View.OnClickListener {
        private lateinit var binding: ActivityDzikirPagiDanPetangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagiDanPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Pagi Dan Petang"

        setView()


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }

    private fun setView() {
        binding.apply {
            imgBtnDzikirPagi.setOnClickListener(this@DzikirPagiDanPetangActivity)
            imgBtnDzikirPetang.setOnClickListener(this@DzikirPagiDanPetangActivity)
        }



    }

// REGNO SESAT ( ini arahan dari regno buat bikin beginian "semuanya" )

    override fun onClick(v:View?) {
        when(v?.id){

            R.id.img_btn_dzikir_pagi -> {
                val btnPagi = Intent(this@DzikirPagiDanPetangActivity, DzikirPagiActivity::class.java)
                startActivity(btnPagi)
            }

            R.id.img_btn_dzikir_petang -> {
                val btnPetang = Intent(this@DzikirPagiDanPetangActivity, DzikirPetangActivity::class.java)
                startActivity(btnPetang)
            }

        }
    }


}
