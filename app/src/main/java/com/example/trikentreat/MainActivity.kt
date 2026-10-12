package com.example.trikentreat

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardDriverAssignment = findViewById<CardView>(R.id.cardDriverAssignment)
        val cardServiceZones = findViewById<CardView>(R.id.cardServiceZones)
        val cardDispatchLogs = findViewById<CardView>(R.id.cardDispatchLogs)

        // Open DriverActivity on click
        cardDriverAssignment.setOnClickListener {
            val intent = Intent(this, DriverActivity::class.java)
            startActivity(intent)
        }

        // Open ServiceZonesActivity on click
        cardServiceZones.setOnClickListener {
            val intent = Intent(this, ServiceZonesActivity::class.java)
            startActivity(intent)
        }

        cardDispatchLogs.setOnClickListener {
            Toast.makeText(this, "Dispatch Logs clicked", Toast.LENGTH_SHORT).show()
        }
    }
}