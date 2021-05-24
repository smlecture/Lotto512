package com.androidapp.lotto512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConstellationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellation)

        val btnGoResultConstell = findViewById<Button>(R.id.btnGoResultConstell)
        btnGoResultConstell.setOnClickListener { // 주의: 책에서의 이름은 goResultButton
            startActivity(Intent(this, ResultActivity::class.java))
        }

    }
}