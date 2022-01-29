package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun create_birthday_card(view: View) {
        /*
        val editText = findViewById<EditText>(R.id.nameInput)
        val name = editText.editableText.toString()
        Toast.makeText(this,"hello $name,how are you",Toast.LENGTH_LONG).show()*/

        // for taking name
        val editText = findViewById<EditText>(R.id.nameInput)
        val name = editText.editableText.toString()
        // for going one page to another
        val intent = Intent(this,birthdaygreetingactivity::class.java)
        //intent.putExtra("name",name) ---> it should me same in both pages or different ways below
        intent.putExtra(birthdaygreetingactivity.NAME_EXTRA,name)
        startActivity(intent)
    }


}