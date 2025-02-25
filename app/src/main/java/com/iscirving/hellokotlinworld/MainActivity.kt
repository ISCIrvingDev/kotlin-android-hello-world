package com.iscirving.hellokotlinworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Presenter Layer
        var btnSend = findViewById<AppCompatButton>(R.id.btnSend)
        var etName = findViewById<AppCompatEditText>(R.id.etName)

        btnSend.setOnClickListener {
            var etResult = etName.text.toString()

            if (etResult.isNotEmpty()) {
                var intentResultActivity = Intent(this, ResultActivity::class.java)
                intentResultActivity.putExtra("result", etResult)

                startActivity(intentResultActivity)
            }
        }
    }
}