package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        cardButton.setOnClickListener{
//
//        }

    }

    fun createBirthdayCard(view: android.view.View) {
        val name= nameInput.editableText.toString()
//        Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()
        val intent =Intent(this,birthdayGreetingActivity::class.java)
        intent.putExtra(birthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}