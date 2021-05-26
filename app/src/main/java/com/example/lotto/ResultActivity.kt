package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // 1) get result
        val result = intent.getIntegerArrayListExtra("result") ?: return

        // 2) sort the array
//        result.sort()
//        val result_sorted = result?.sortedBy { it }
//        val result_sorted = result?.let { result.sortedBy { it } }
        result?.let {
            updateLottoBallImages(result.sortedBy { it })
        }

        // 3) set images
//        val lottoBallImageStartId = R.drawable.ball_01 // 146
//        val lottoBallImageId2 = R.drawable.ball_02 // 150
//        val lottoBallImageId3 = R.drawable.ball_03 // 148

//        val imageView1 = findViewById<ImageView>(R.id.imageView3)
//        val imageView2 = findViewById<ImageView>(R.id.imageView4)
//        val imageView3 = findViewById<ImageView>(R.id.imageView5)
//        val imageView4 = findViewById<ImageView>(R.id.imageView6)
//        val imageView5 = findViewById<ImageView>(R.id.imageView7)
//        val imageView6 = findViewById<ImageView>(R.id.imageView8)
//
//        imageView1.setImageResource(lottoBallImageStartId + result_sorted[0] - 1)
//        imageView2.setImageResource(lottoBallImageStartId + result_sorted[1] - 1)
//        imageView3.setImageResource(lottoBallImageStartId + result_sorted[2] - 1)
//        imageView4.setImageResource(lottoBallImageStartId + result_sorted[3] - 1)
//        imageView5.setImageResource(lottoBallImageStartId + result_sorted[4] - 1)
//        imageView6.setImageResource(lottoBallImageStartId + result_sorted[5] - 1)
    }

    private fun updateLottoBallImages(result_sorted : List<Int>) {
        if (result_sorted.size < 6) return
        val lottoBallImageStartId = R.drawable.ball_01

        val imageView1 = findViewById<ImageView>(R.id.imageView3)
        val imageView2 = findViewById<ImageView>(R.id.imageView4)
        val imageView3 = findViewById<ImageView>(R.id.imageView5)
        val imageView4 = findViewById<ImageView>(R.id.imageView6)
        val imageView5 = findViewById<ImageView>(R.id.imageView7)
        val imageView6 = findViewById<ImageView>(R.id.imageView8)

        imageView1.setImageResource(lottoBallImageStartId + result_sorted!![0] - 1)
        imageView2.setImageResource(lottoBallImageStartId + result_sorted[1] - 1)
        imageView3.setImageResource(lottoBallImageStartId + result_sorted[2] - 1)
        imageView4.setImageResource(lottoBallImageStartId + result_sorted[3] - 1)
        imageView5.setImageResource(lottoBallImageStartId + result_sorted[4] - 1)
        imageView6.setImageResource(lottoBallImageStartId + result_sorted[5] - 1)
    }
}