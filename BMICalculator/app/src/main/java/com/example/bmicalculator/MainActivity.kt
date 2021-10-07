package com.example.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateBMI(view: android.view.View) {
        val weight=weightInput.editableText.toString().toInt()
        val height=heightInput.editableText.toString().toInt()
        val intent=Intent(this,Result::class.java)
        intent.putExtra(Result.WEIGHT_EXTRA, weight)
        intent.putExtra(Result.height_EXTRA,height)
        startActivity(intent)
    }
}