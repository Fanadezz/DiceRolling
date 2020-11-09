package com.androidshowtime.dicerolling

import android.graphics.drawable.Drawable
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
random = Random(0)


        roll_button.text = "Let's Roll"
        roll_button.setOnClickListener {

           rollDice()
        }
    }

    private fun rollDice() {

       val randomInt = random.nextInt(1,7)

        val diceDrawable = when(randomInt){



            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5




            else ->R.drawable.dice_6
        }

        dice_imageView.setImageResource(diceDrawable)
    }


}