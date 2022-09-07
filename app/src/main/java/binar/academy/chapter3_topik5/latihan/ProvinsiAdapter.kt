package binar.academy.chapter3_topik5.latihan

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import binar.academy.chapter3_topik5.databinding.ItemProvinsiBinding

class ProvinsiAdapter(private val listProvinsi : ArrayList<Provinsi>)
    : RecyclerView.Adapter<ProvinsiAdapter.ViewHolder>(){

    class ViewHolder(binding: ItemProvinsiBinding) : RecyclerView.ViewHolder(binding.root) {
        var nProvinsi = binding.tvProvinsi
        var nIbuKota = binding.tvIbuKota
        var imgRumahAdat = binding.ivRumahAdat
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemProvinsiBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nProvinsi.text = listProvinsi[position].namaProvinsi
        holder.nIbuKota.text = listProvinsi[position].ibuKota
        holder.imgRumahAdat.setImageResource(listProvinsi[position].imgRumahAdat)
    }

    override fun getItemCount(): Int = listProvinsi.size
}