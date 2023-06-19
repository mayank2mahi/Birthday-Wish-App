package com.example1.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val createBirthdayButton = findViewById<Button>(R.id.createBirthdayButton)
        val nameInput = findViewById<EditText>(R.id.nameInput)
        createBirthdayButton.setOnClickListener{
            val data = nameInput.text.toString()
            val intent = Intent(this,BirthdayGreetingActivity::class.java)
            intent.putExtra(NAME_EXTRA,data)
            startActivity(intent)
        }
    }
}
