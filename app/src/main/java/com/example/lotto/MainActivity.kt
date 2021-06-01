package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

fun getRandomLottoNumber(): Int{
    return Random().nextInt(45)+1
}

fun getRandomLottoNumbers(): MutableList<Int>{
    val lottoNumbers = mutableListOf<Int>()

    while(true){
        var number: Int = getRandomLottoNumber()
        var flag_existing : Int =0

        if(lottoNumbers.contains(number))
        {
//            flag_existing = 1

            continue
        }

//        if(flag_existing.equals(1))
//            continue
//        else
        lottoNumbers.add(number)

        if(lottoNumbers.size>=6)
            break;
    }

//    for(i in 1..6){
//        lottoNumbers.add(getRandomLottoNumber())
//    }
    return lottoNumbers
}

fun getShuffledLottoNumbers() : MutableList<Int>{
    val list = mutableListOf<Int>()

    for (number in 1..45){
        list.add(number)
    }
    list.shuffle()

    return list.subList(0, 6)
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linkConstellAct = findViewById<CardView>(R.id.linkConstellAct)
        val linkNameAct = findViewById<CardView>(R.id.linkNameAct)
        val linkResultAct = findViewById<CardView>(R.id.linkResultAct)

        linkResultAct.setOnClickListener {
            startActivity(Intent(this@MainActivity, ResultActivity::class.java))
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            startActivity(intent)
        }

        linkConstellAct.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }

        linkNameAct.setOnClickListener {
            startActivity(Intent(this@MainActivity, NameActivity::class.java))
        }
    }
}