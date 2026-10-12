package com.example.trikentreat

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ServiceZonesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_zones)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Closes this screen and goes back to dashboard
        }
    }
}