package com.androidapp.lotto512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardRandom = findViewById<CardView>(R.id.cardRandom)
        val cardConstellation = findViewById<CardView>(R.id.cardConstellation)
        val cardName = findViewById<CardView>(R.id.cardName)
        cardRandom.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
        }
        cardConstellation.setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }
        cardName.setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }
        cardName.setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }
    }
}