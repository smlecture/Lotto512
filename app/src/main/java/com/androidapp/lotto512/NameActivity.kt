package com.androidapp.lotto512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

fun getShuffledLottoNumbersFromHash(str: String): MutableList<Int>{
    // 정수 list 생성
    val list = mutableListOf<Int>()
    // list에 정수 저장
    for (number in 1..45){
        list.add(number)
    }
    // list 섞기. SEED 값으로 이름의 hash 코드 사용
    list.shuffle(Random(str.hashCode().toLong())) // → 사람마다 다른 번호 추천
    // 앞에서부터 6개 반환
    return list.subList(0, 6)
}

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val btnGo = findViewById<Button>(R.id.btnGoResultName)
        btnGo.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
        }
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}