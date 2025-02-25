package com.iscirving.hellokotlinworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Presenter Layer
        var result = intent.extras?.getString("result").orEmpty()

        var tvResult = findViewById<TextView>(R.id.tvResult)
        tvResult.text = result
    }
}