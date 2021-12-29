package com.example.hungryfishgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import android.widget.Toast

private var tvBubble : TextView? = null
var tvFish : TextView? = null

private var fishNumber = 0

val mainHandler = Handler(Looper.getMainLooper())

//String[] numberArray


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvBubble = findViewById(R.id.tvBubble)



        fun numGenerator() {
            var randomNum = (0..10 + 1).random().toString()
            tvBubble!!.text = randomNum

            randomNum = (0..10 + 1).random().toString()
            //tvFish!!.text = randomNum
        }

//        fun changeFishNumber() {
//            var randomNum = (0..15 + 1).random().toString()
//            tvFish?.text = randomNum
//        }

        tvBubble?.setOnClickListener{
            numGenerator()
        }

        tvFish?.setOnClickListener{
            numGenerator()
        }


//        for (i in 1..10) {
//            changeFishNumber()
//            if (tvFish.text == )
//            Toast.makeText(this, "It worked. $i", Toast.LENGTH_LONG).show()
//        }


        mainHandler.post(object : Runnable {
            override fun run() {
                numGenerator()
                mainHandler.postDelayed(this, 5000)
            }
        })



    }
}