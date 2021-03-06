package com.androidapp.lotto512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConstellationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellation)

//        val btnGoResult = findViewById<Button>(R.id.btnGoResult)
        val btnGoResult = findViewById<Button>(R.id.btnGo)
        btnGoResult.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
        }
    }
}