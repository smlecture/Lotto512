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
        cardRandom.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
        }
        val cardConstell = findViewById<CardView>(R.id.cardConstell)
        cardConstell.setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }
        val cardName = findViewById<CardView>(R.id.cardName)
        cardName.setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }

    }
}