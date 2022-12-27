package com.example.guessnum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var min: EditText
    private lateinit var max: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        min = findViewById(R.id.leftEditText)
        max = findViewById(R.id.rightEditText)
    }

    fun onClickConfirm(view: View) {
        val intent = Intent(
            this,
            SecondActivity::class.java
        )
        intent.putExtra("min", min.text.toString())
        intent.putExtra("max", max.text.toString())

        startActivity(intent)
    }
}