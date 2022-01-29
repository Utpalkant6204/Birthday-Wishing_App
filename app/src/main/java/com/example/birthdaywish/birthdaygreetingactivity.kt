package com.example.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class birthdaygreetingactivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreetingactivity)

        val name = intent.getStringExtra(NAME_EXTRA)
        val emoji = getString(R.string.smiley_text) //get from string
        val emoji1 = getString(R.string.smiley_text1)   //get from string
        val final = "$name!!\n$emoji$emoji$emoji1$emoji1"
        val editText = findViewById<TextView>(R.id.birthday_greeting)
        editText.text="Happy Birthday\n$final"
    }
}