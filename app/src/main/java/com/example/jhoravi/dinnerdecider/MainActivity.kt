package com.example.jhoravi.dinnerdecider

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chicken", "Burger", "Pizza", "Donut")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //selectedFoodTxt.text = "Burger King"
        decideBtn.setOnClickListener {
            //println("You clicked me")
            val random = Random()
            val anyFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[anyFood]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString().trim()         // NEW
            if (newFood.isBlank()) return@setOnClickListener        // NEW

            foodList.add(newFood)
            addFoodTxt.text.clear()
            println(foodList)
        }
    }
}
