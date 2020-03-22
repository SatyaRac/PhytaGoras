package com.example.phytagoras

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_ractangle.setOnClickListener {
            intent = Intent(this, RactangleActivity::class.java)
            startActivity(intent)
        }
//        btn_circle.setOnClickListener(){
//            intent = Intent(this, CirleActivity::class.java)
//            startActivity(intent)
//        }

    }
}
