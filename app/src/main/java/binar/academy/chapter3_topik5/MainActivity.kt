package binar.academy.chapter3_topik5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import binar.academy.chapter3_topik5.databinding.ActivityMainBinding
import binar.academy.chapter3_topik5.latihan.Provinsi
import binar.academy.chapter3_topik5.latihan.ProvinsiAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val listStudent = arrayListOf(
//            Student("Rahmadina", "00000034690", R.drawable.gunhoo),
//            Student("Budi", "00000034556", R.drawable.gunhoo),
//            Student("Putri", "00000033422", R.drawable.gunhoo),
//            Student("Wini", "00000035674", R.drawable.gunhoo),
//            Student("Lala", "00000032565", R.drawable.gunhoo)
//        )
//
//        var adapterStudent = StudentAdapter(listStudent)
//        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//
//        binding.recyclerview.layoutManager = layoutManager
//        binding.recyclerview.adapter = adapterStudent

        val listProvinsi = arrayListOf(
            Provinsi("Bali", "Denpasar", R.drawable.bali_gapura_candi_bentar),
            Provinsi("Banten", "Serang", R.drawable.banten_rumah_baduy),
            Provinsi("Bengkulu", "Bengkulu", R.drawable.bengkul_rumah_bubungan_lima),
            Provinsi("DI Yogyakarta", "Yogyakarta", R.drawable.di_yogyakarta_rumah_joglo),
            Provinsi("DKI Jakarta", "Jakarta", R.drawable.dki_jakarta_rumah_kebaya),
            Provinsi("Gorontalo", "Gorontalo", R.drawable.gorontalo_rumah_dulohupa),
            Provinsi("Jambi", "Jambi", R.drawable.jambi_rumah_panggung),
            Provinsi("Jawa Barat", "Bandung", R.drawable.jawa_barat),
            Provinsi("Jawa Tengah", "Semarang", R.drawable.jawa_tengah),
            Provinsi("Jawa Timur", "Surabaya", R.drawable.jawa_timur)
        )

        var adapterProvinsi = ProvinsiAdapter(listProvinsi)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.recyclerview.layoutManager = layoutManager
        binding.recyclerview.adapter = adapterProvinsi
    }
}