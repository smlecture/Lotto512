package com.androidapp.lotto512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import java.util.*

fun getRandomLottoNumber (): Int{
    return Random().nextInt(45)+1
}
fun getRandomLottoNumbers(): MutableList<Int>{
    val lottoNumbers = mutableListOf<Int>()

    (1..6).forEach {
    //for(i in 1..6){
        var number = 0
        do{
            number = getRandomLottoNumber()
        }while(lottoNumbers.contains(number))
        lottoNumbers.add(number)
    }
    return lottoNumbers
}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardRandom = findViewById<CardView>(R.id.cardRandom)
        cardRandom.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            startActivity(intent)
        }
        val cardConstell = findViewById<CardView>(R.id.cardConstell)
        cardConstell.setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }
        val cardName = findViewById<CardView>(R.id.cardName)
        cardName.setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }
/*        val numbers = listOf(1, 2, 3, 4)
//        println(numbers)
//        numbers.forEach { numbers -> println(numbers) }
          numbers.forEach { number -> println(number) }
//        numbers.forEach { println(it) }
        val mutableNumbers = mutableListOf<Int>(5, 6, 7, 8)
        mutableNumbers.add(9)
        mutableNumbers.forEach { mutableNumber -> println(mutableNumber) }*/

/*        val b = 10
        b.plus(1)
        println(b)
        println(b.plus(1))*/
    }
}