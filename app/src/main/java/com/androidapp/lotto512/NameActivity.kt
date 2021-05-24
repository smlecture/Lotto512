package com.androidapp.lotto512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val btnGoResultName = findViewById<Button>(R.id.btnGoResultName)
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnGoResultName.setOnClickListener { // 주의: 책에서의 이름은 goResultButton
            startActivity(Intent(this, ResultActivity::class.java))
        }
        btnBack.setOnClickListener { // 주의: 책에서의 이름은 goResultButton
            // activity 종료
            finish()
        }

    }
}