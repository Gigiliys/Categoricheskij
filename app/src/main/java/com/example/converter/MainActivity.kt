package com.example.converter

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.act.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        history.setOnClickListener{
            val intent = Intent(this@MainActivity, Act::class.java)
            startActivity(intent)
        }
        calculate_btn.setOnClickListener {


            if (etHeight.text.isNotEmpty() && etWeight.text.isNotEmpty())
            {
                val height = (etHeight.text.toString()).toFloat()
                val weight = (etWeight.text.toString()).toFloat()
                val Result = calculateBMI(height, weight)
                bmi.text = Result.toString()
                bmi.visibility = View.VISIBLE
                bmi_tv.visibility = View.VISIBLE
                ReCalculate.visibility = View.VISIBLE
                calculate_btn.visibility = View.GONE
            }
            else
            {
                Toast.makeText(this, "Поля пусты", Toast.LENGTH_SHORT).show()
            }
        }

        ReCalculate.setOnClickListener {
            ResetEverything()
        }

    }
    private fun ResetEverything()
    {
        calculate_btn.visibility = View.VISIBLE
        ReCalculate.visibility = View.GONE
        etWeight.text.clear()
        bmi.text = " "
        bmi_tv.visibility = View.GONE
    }


    private fun calculateBMI(height: Float, weight: Float): Float {
        val Result = weight * (height / 1000)
        return Result
    }
}