package com.example.hungryfishgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private var tvBubble : TextView? = null




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvBubble = findViewById(R.id.tvBubble)



        fun numGenerator() {
            var randomNum = (0..10).random().toString()
            tvBubble!!.setText(randomNum)
        }

        tvBubble?.setOnClickListener{
            numGenerator()
        }

    }
}