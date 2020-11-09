package com.androidshowtime.dicerolling

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var random: Random
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
random = Random(100)


        roll_button.text = "Let's Roll"
        roll_button.setOnClickListener {

           rollDice()
        }
    }

    private fun rollDice() {

        //textView.text = random.nextInt(1,7).toString()

    }


}