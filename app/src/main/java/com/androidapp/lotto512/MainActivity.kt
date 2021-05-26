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

    while(true){
        val number = getRandomLottoNumber()
        var flag_exist = 0

        if(lottoNumbers.size < 1){
            lottoNumbers.add(number)
            continue
        }
        else {
            for (j in 0 until lottoNumbers.size) {
                if (number == lottoNumbers[j]) {
                    flag_exist = 1
                    break
                }
            }
            if (flag_exist == 0)
                lottoNumbers.add(number)
            if (lottoNumbers.size >= 6)
                break
        }
    }
    return lottoNumbers
}
fun getShuffledLottoNumbers () : MutableList<Int>{
    val list = mutableListOf<Int>()

    for(number in 1..45){
        list.add(number)
    }
    list.shuffle()

    return list.subList(0, 6)
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardRandom = findViewById<CardView>(R.id.cardRandom)
        cardRandom.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
//            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            intent.putIntegerArrayListExtra("result", ArrayList(getShuffledLottoNumbers()))
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