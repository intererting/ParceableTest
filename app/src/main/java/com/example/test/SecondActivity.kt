package com.example.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val son = intent.getParcelableExtra<Son>("data")
        println(son)
        val fatherSon = intent.getParcelableExtra<Father>("data")
        println(fatherSon)
        //不能强转
//        val sonFather = intent.getParcelableExtra<Son>("father")
//        println(sonFather)
    }
}