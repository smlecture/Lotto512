package com.androidapp.lotto512

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ConstellationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellation)
        Toast.makeText(this@ConstellationActivity, "Constellation Activity", Toast.LENGTH_LONG).show()
    }
}