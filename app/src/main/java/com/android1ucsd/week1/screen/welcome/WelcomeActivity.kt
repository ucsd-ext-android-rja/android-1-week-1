package com.android1ucsd.week1.screen.welcome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.android1ucsd.week1.R

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        title = "Welcome"

        val button = findViewById<Button>(R.id.aw_button)
        val editText = findViewById<EditText>(R.id.aw_edit_text)

        //TODO uncomment the line below to make the test pass
//        editText.hint = "search"

        button.setOnClickListener {
            //TODO add code to pass the value of the edit text to the ListActivity through an intent
        }
    }

}