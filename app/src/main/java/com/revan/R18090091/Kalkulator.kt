package com.revan.R18090091

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kalkulator.*
import kotlinx.android.synthetic.main.activity_main.*

class Kalkulator : AppCompatActivity() {
    private val AngkaLogic = angkaLogic()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)
        val angka1 = edtAngka1.text
        val angka2 = edtAngka2.text
        val angka3 = edtAngka3.text

        btnKeluar.setOnClickListener{
            startActivity(Intent(this, UserActivity::class.java))
            showMessage("Kembali Ke halaman Utama")
        }

        btnplus.setOnClickListener{
            if (edtAngka1.text.toString() == "" || edtAngka2.text.toString() == "" || edtAngka3.text.toString() == "") {
                edtAngka3.setError("Diisi yah")
            } else {
            }
            edtHasil.text = "Hasil =${AngkaLogic.hitungplus(angka1.toString().toDouble(),
                angka2.toString().toDouble(),
                angka3.toString().toDouble()
            )
            }"
        }
        btnkurang.setOnClickListener{
            if (edtAngka1.text.toString() == "" || edtAngka2.text.toString() == "" || edtAngka3.text.toString() == "") {
                edtAngka3.setError("Diisi yah")
            } else {
            }
            edtHasil.text = "Hasil =${AngkaLogic.hitungkurang(angka1.toString().toDouble(),
                angka2.toString().toDouble(),
                angka3.toString().toDouble()
            )
            }"
        }
        btnbagi.setOnClickListener{
            if (edtAngka1.text.toString() == "" || edtAngka2.text.toString() == "" || edtAngka3.text.toString() == "") {
                edtAngka3.setError("Diisi yah")
            } else {
                edtHasil.text = "Hasil =${AngkaLogic.hitungbagi(angka1.toString().toDouble(),
                    angka2.toString().toDouble(),
                    angka3.toString().toDouble()
                )
                }"
            }

        }
    }
    private fun showMessage(message: String){
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}
