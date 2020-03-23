package com.example.phytagoras

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_triangle.*

class TriangleActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)

        val base = base as EditText
        val height = height as EditText

        calculate.setOnClickListener {
            if (base.text.isEmpty()) {
                Toast.makeText(applicationContext, "Base cannot be empty", Toast.LENGTH_LONG).show()
            } else if (height.text.isEmpty()) {
                Toast.makeText(applicationContext, "Height cannot be empty", Toast.LENGTH_LONG)
                    .show()
            } else {
                val result =
                    0.5 * (base.text.toString().toDouble()) * (height.text.toString().toDouble())
                tv_result.text = "Area = $result"
            }
        }
        clear.setOnClickListener {
            base.text.clear()
            height.text.clear()
        }
    }
}
