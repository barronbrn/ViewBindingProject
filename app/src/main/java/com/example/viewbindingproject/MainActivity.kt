/*
Nama    : Dani Herawan
NIM     : 10122331
Kelas   : P.ANDRO 4
Jam Selesai Pengerjaan : Rabu 14 Mei 2025 , 23:15
*/
package com.example.viewbindingproject

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewbindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /*
    private lateinit var edtValueNim: EditText
    private lateinit var edtValueNama: EditText
    private lateinit var btnValueSimpan: Button
    private lateinit var txtValueNim: TextView
    private lateinit var txtValueNama: TextView
    */
    private lateinit var binding: ActivityMainBinding

    var nim: String = ""
    var nama: String = ""
    var mahasiswa: Mahasiswa = Mahasiswa()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)*/
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSimpan.setOnClickListener {

            nim = binding.edtNim.text.toString()
            nama = binding.edtNama.text.toString()
            mahasiswa.nim = nim
            mahasiswa.nama = nama

            binding.mahasiswa = mahasiswa

            /*binding.txtNim.text = "NIM : " + nim
            binding.txtNama.text = "Nama Anda: " + nama*/

            Toast.makeText(this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show()
        }

        //setContentView(R.layout.activity_main)
        /*
        edtValueNim = findViewById(R.id.edt_nim)
        edtValueNama = findViewById(R.id.edt_nama)
        btnValueSimpan = findViewById(R.id.btn_simpan)
        txtValueNim = findViewById(R.id.txt_nim)
        txtValueNama = findViewById(R.id.txt_nama)

        btnValueSimpan.setOnClickListener {
            nim = edtValueNim.text.toString()
            nama = edtValueNama.text.toString()
            txtValueNim.text = nim
            txtValueNama.text = nama
        }
        */
    }
}