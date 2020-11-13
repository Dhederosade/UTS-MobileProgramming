package com.revan.R18090091

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.revan.R18090091.helper.Constant
import com.revan.R18090091.helper.PreferencesHelper
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    lateinit var  sharedPreferences: PreferencesHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        sharedPreferences = PreferencesHelper(this)

        textUsername.text = sharedPreferences.getString( Constant.PREF_USERNAME)

        buttonLogout.setOnClickListener {
            sharedPreferences.clear()
            showMessage("Keluar")
            moveIntent()
        }
        buttonBerita.setOnClickListener {
            startActivity(Intent(this, Berita::class.java))
            showMessage("Ini adalah Halaman Berita")

        }
        buttonAbout.setOnClickListener {
            startActivity(Intent(this, About::class.java))
            showMessage("Ini adalah Profil Pembuat Aplikasi")

        }
        buttonKalkulator.setOnClickListener {
            startActivity(Intent(this, Kalkulator::class.java))
            showMessage("Ini adalah Kalkulator")
        }

    }
    private  fun moveIntent(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }


    private fun showMessage(message: String){
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}