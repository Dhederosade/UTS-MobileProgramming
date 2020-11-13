package com.revan.R18090091

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kalkulator.*
import kotlinx.android.synthetic.main.activity_user.*

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        btnKeluar.setOnClickListener{
            startActivity(Intent(this, UserActivity::class.java))
            showMessage("Kembali Ke halaman Utama")
        }

    }
    private fun showMessage(message: String){
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }


}