package com.example.guessnum

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private var left = 0
    private var right = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        left = intent.getStringExtra("min")?.toInt()!!
        right = intent.getStringExtra("max")?.toInt()!!
        textView = findViewById(R.id.question)

        val mid = (right + left) / 2
        textView.text = getString(R.string.question, mid)
    }

    fun onClickHigher(view: View) {
        left = (right + left) / 2

        val mid = (right + left) / 2
        textView.text = getString(R.string.question, mid)
    }

    fun onClickLower(view: View) {
        right = (right + left) / 2

        val mid = (right + left) / 2
        textView.text = getString(R.string.question, mid)
    }

    fun onClickRight(view: View) {
        textView.text = getString(R.string.guessed)
    }
}