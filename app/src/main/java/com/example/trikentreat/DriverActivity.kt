package com.example.trikentreat

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DriverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver)

        val etDriverName = findViewById<EditText>(R.id.etDriverName)
        val etBodyNumber = findViewById<EditText>(R.id.etBodyNumber)
        val btnAssignDriver = findViewById<Button>(R.id.btnAssignDriver)

        btnAssignDriver.setOnClickListener {
            val name = etDriverName.text.toString().trim()
            val bodyNum = etBodyNumber.text.toString().trim()

            if (name.isNotEmpty() && bodyNum.isNotEmpty()) {
                Toast.makeText(this, "Assigned: Driver $name (#$bodyNum)", Toast.LENGTH_SHORT).show()
                finish() // Closes screen and goes back to dashboard
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}