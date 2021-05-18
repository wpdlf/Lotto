package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linkConstellAct = findViewById<CardView>(R.id.linkConstellAct)
        val linkNameAct = findViewById<CardView>(R.id.linkNameAct)

        linkConstellAct.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }

        linkNameAct.setOnClickListener {
            startActivity(Intent(this@MainActivity, NameActivity::class.java))
        }
    }
}