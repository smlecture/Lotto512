package com.androidapp.lotto512

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class ResultActivity : AppCompatActivity() {

//    val imageView1id = R.id.imageView1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // 1) get result
        val result = intent.getIntegerArrayListExtra("result") ?: return // ?: return
        val sConstellation = intent.getStringExtra("constellation")
        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        //        // 2) sort the array
//        result?.sort() // in-place
//        val result_sorted = result?.sortedBy{it}
        val result_sorted = result?.sorted()
//        val result_sorted = result?.let { result.sortedBy{it} }
/*        result?.let{
            updateLottoBallImages(result.sortedBy{it})
        }*/
        val resultLabel = findViewById<TextView>(R.id.resultLabel)
        sConstellation?.let {
//            val resultLabel = findViewById<TextView>(R.id.resultLabel)
/*            resultLabel.text = "${sConstellation}의 ${SimpleDateFormat("yyyy년 MM월 dd일")
                .format(Date())} 로또 번호입니다"*/
            resultLabel.text = "${sConstellation}의 ${datePicker.month}월 ${datePicker.dayOfMonth}일의 로또 번호입니다"
        }
        // 3) set images
        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)

        val lottoBallImageStartId = R.drawable.ball_01 // ...279
        val lottoBallImageId2 = R.drawable.ball_02 // 280
        val lottoBallImageId3 = R.drawable.ball_03 // 281

        imageView1.setImageResource(lottoBallImageStartId + (result_sorted[0] - 1))
        imageView2.setImageResource(lottoBallImageStartId + result_sorted[1] - 1)
        imageView3.setImageResource(lottoBallImageStartId + result_sorted[2] - 1)
        imageView4.setImageResource(lottoBallImageStartId + result_sorted[3] - 1)
        imageView5.setImageResource(lottoBallImageStartId + result_sorted[4] - 1)
        imageView6.setImageResource(lottoBallImageStartId + result_sorted[5] - 1)
    }

//    private fun updateLottoBallImages(result_sorted : ArrayList<Int>) {
/*    private fun updateLottoBallImages(result_sorted : List<Int>) {
        val lottoImageStartId = R.drawable.ball_01

        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)

        imageView1.setImageResource(lottoImageStartId + (result_sorted[0] - 1))
        imageView2.setImageResource(lottoImageStartId + result_sorted[1] - 1)
        imageView3.setImageResource(lottoImageStartId + result_sorted[2] - 1)
        imageView4.setImageResource(lottoImageStartId + result_sorted[3] - 1)
        imageView5.setImageResource(lottoImageStartId + result_sorted[4] - 1)
        imageView6.setImageResource(lottoImageStartId + result_sorted[5] - 1)
    }*/
}