package com.example.converter

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.act.*
import kotlinx.android.synthetic.main.activity_main.*

class Act:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act)
        bz.setOnClickListener{
            val intent = Intent(this@Act, MainActivity::class.java)
            startActivity(intent)
        }
        b1.setOnClickListener {
            fw.text="1031 кг/m3"
        }
        b2.setOnClickListener {
            fw.text="710 кг/m3"
        }
        b3.setOnClickListener {
            fw.text="1000 кг/m3"
        }
        b4.setOnClickListener {
            fw.text="800 кг/m3"
        }

    }

}