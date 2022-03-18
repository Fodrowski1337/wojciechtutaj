package com.example.aplikacja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCalculate.setOnClickListener{

            if(etNumber1.text.trim().isNotEmpty() && etNumber2.text.trim().isNotEmpty()) {

                val value1 = etNumber1.text.toString().toInt()
                val value2 = etNumber2.text.toString().toInt()
                val result = value1 + value2
                tvFinalNumber.text = result.toString()
            }
        }

        btnReset.setOnClickListener{
            tvFinalNumber.text = "0"

        }



    }



}