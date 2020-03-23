package com.example.phytagoras

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phytagoras.*

class PhytagorasActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phytagoras)

        val a = a as EditText
        val c = c as EditText

        calculate.setOnClickListener {
            if (a.text.isEmpty()) {
                Toast.makeText(applicationContext, "a cannot be empty", Toast.LENGTH_LONG).show()
            } else if (c.text.isEmpty()) {
                Toast.makeText(applicationContext, "c cannot be empty", Toast.LENGTH_LONG).show()
            } else {
                val result = (a.text.toString().toDouble()) * (a.text.toString()
                    .toDouble()) + (c.text.toString().toDouble()) * (c.text.toString().toDouble())
                val res = (result * result)
                tv_result.text = "Result = $res"
            }
        }
        clear.setOnClickListener {
            a.text.clear()
            c.text.clear()
        }
    }
}
