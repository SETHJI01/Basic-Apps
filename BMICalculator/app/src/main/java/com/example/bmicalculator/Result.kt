package com.example.bmicalculator

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    companion object{
        const val WEIGHT_EXTRA="weight_extra"
        const val height_EXTRA="height_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val w=intent.getIntExtra(WEIGHT_EXTRA,85)
        val h=intent.getIntExtra(height_EXTRA,177)
        var hm=h.toBigDecimal().divide(100.toBigDecimal())
        hm=hm*hm
        val bmi=String.format("%.1f",w.toDouble()/hm.toDouble()).toDouble()
        BMIresult.text="Your BMI is \n$bmi"
        if(bmi<18.5){
            remarkText.text="You are Underweight"
            remarkText.setTextColor(Color.parseColor("#ff5050"))
        }
        else if(bmi>25 && bmi<30){
            remarkText.text="You are Overweight"
            remarkText.setTextColor(Color.parseColor("#ff5050"))
        }
        else if(bmi>=30){
            remarkText.text="You are Obese"
            remarkText.setTextColor(Color.parseColor("#ff0000"))
        }
        else{
            remarkText.text="You are Healthy"
            remarkText.setTextColor(Color.parseColor("#00ff00"))
        }
    }
}


