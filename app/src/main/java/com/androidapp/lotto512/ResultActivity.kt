package com.androidapp.lotto512

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResultActivity : AppCompatActivity() {

//    val imageView1id = R.id.imageView1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // 1) get result
        val result = intent.getIntegerArrayListExtra("result") // ?: return

        // 2) sort the array
/*        result?.let {
            updateLottoBallImages(result.sortedBy { it })
        }*/

        println("result is $result")

/*        result.sort()
        println("result_sorted is $result")*/

//        val result_sorted = result.sorted()
//        val result_sorted = result.sortedBy{it}
//        val result_sorted = result?.let { result.sortedBy{it} }
        val result_sorted = result?.sortedBy{it}
        println("result_sorted is $result_sorted")

        // 3) set images
        val lottoImageStartId = R.drawable.ball_01

       /* val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)

        imageView1.setImageResource(lottoImageStartId + result[0] - 1)
        imageView2.setImageResource(lottoImageStartId + result[1] - 1)
        imageView3.setImageResource(lottoImageStartId + result[2] - 1)
        imageView4.setImageResource(lottoImageStartId + result[3] - 1)
        imageView5.setImageResource(lottoImageStartId + result[4] - 1)
        imageView6.setImageResource(lottoImageStartId + result[5] - 1)*/

    }

 /*   private fun updateLottoBallImages(result : List<Int>) {
        imageView1.setImageResource(lottoImageStartId + (result[0] - 1))
        imageView2.setImageResource(lottoImageStartId + (result[1] - 1))
        imageView3.setImageResource(lottoImageStartId + (result[2] - 1))
        imageView4.setImageResource(lottoImageStartId + (result[3] - 1))
        imageView5.setImageResource(lottoImageStartId + (result[4] - 1))
        imageView6.setImageResource(lottoImageStartId + (result[5] - 1))

    }*/
}