package com.example.phytagoras

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ractangle.*

class RactangleActivity : AppCompatActivity() {
    @SuppressLint("SetText")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ractangle)

        val side1 = side1 as EditText
        val side2 = side2 as EditText

        calculate.setOnClickListener {
            if (side1.text.isEmpty()) {
                Toast.makeText(applicationContext, "Side cannot be empty", Toast.LENGTH_LONG).show()
            } else if (side2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Side cannot be empty", Toast.LENGTH_LONG).show()
            } else {
                val result = (side1.text.toString().toDouble()) * (side2.text.toString().toDouble())
                tv_result.text = "Area = $result"
            }
        }
    }
}
