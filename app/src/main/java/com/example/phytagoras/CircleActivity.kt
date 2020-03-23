package com.example.phytagoras

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_circle.*

class CircleActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        val radius = radius as EditText

        calculate.setOnClickListener {
            if (radius.text.isEmpty()) {
                Toast.makeText(applicationContext, "Radius cannot be empty", Toast.LENGTH_LONG)
                    .show()
            } else {
                val result =
                    (radius.text.toString().toDouble()) * (radius.text.toString().toDouble()) * 3.14
                tv_result.text = "Area = $result"
            }
        }

        clear.setOnClickListener {
            radius.text.clear()
        }
    }
}
