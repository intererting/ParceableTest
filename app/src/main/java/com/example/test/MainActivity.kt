package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start.setOnClickListener {
            val son = Son(12)
            son.name = "于黎阳"
            startActivity(Intent(this@MainActivity, SecondActivity::class.java).apply {
                putExtra("data", son)
            })
        }
    }
}
