package com.rival.belajardoadandzikirapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rival.belajardoadandzikirapp.databinding.RowItemDzikirDoaBinding
import com.rival.belajardoadandzikirapp.model.DzikirDoaModel

    class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoaModel>):
            RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {
        class MyViewHolder(val binding: RowItemDzikirDoaBinding) : RecyclerView.ViewHolder(binding.root)
        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): DzikirDoaAdapter.MyViewHolder {
            val bindingDzikirDoa = RowItemDzikirDoaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return MyViewHolder(bindingDzikirDoa)
        }

        override fun onBindViewHolder(holder: DzikirDoaAdapter.MyViewHolder, position: Int) {
            val dataDzikirDoa = listDzikirDoa[position]

            holder.binding.apply {
                tvDesc.text = dataDzikirDoa.desc
                tvLafaz.text = dataDzikirDoa.lafaz
                tvTerjemah.text = dataDzikirDoa.terjemah
            }

        }

        override fun getItemCount(): Int = listDzikirDoa.size

    }
