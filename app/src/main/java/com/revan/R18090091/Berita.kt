package com.revan.R18090091


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_berita.*

import kotlinx.android.synthetic.main.activity_main.*

class Berita : AppCompatActivity() {

    val list = ArrayList<Users>()

    val listUsers = arrayOf(
        "Pendidikan Kewarganegaraan",
        "Matematika",
        "Pendidikan Agama",
        "IPA",
        "IPS",
        "Pendidikan Jasmani Dan Rohani"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)

        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)

        for (i in 0 until listUsers.size){

            list.add(Users(listUsers.get(i)))

            if(listUsers.size - 1 == i){
                // init adapter yang telah dibuat tadi
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()

                //tampilkan data dalam recycler view
                mRecyclerView.adapter = adapter
            }

        }

    }


}
