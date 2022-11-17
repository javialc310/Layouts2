package com.example.task07_layouts2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var botnTable : Button
private lateinit var botnLinear : Button
private lateinit var botnRelative : Button
private lateinit var btnGrid : Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botnLinear = findViewById(R.id.btn1)
        botnTable = findViewById(R.id.btn2)
        btnGrid= findViewById(R.id.btn3)
        botnRelative = findViewById(R.id.btn4)

        botnTable.setOnClickListener {
            val intent = android.content.Intent(this, TableLay::class.java)
            startActivity(intent)
        }

        botnLinear.setOnClickListener {
            val intent = android.content.Intent(this, LinearLayout::class.java)
            startActivity(intent)
        }

        botnRelative.setOnClickListener {
            val intent = android.content.Intent(this, Relative::class.java)
            startActivity(intent)
        }

        btnGrid.setOnClickListener {
            val intent = android.content.Intent(this, Grid::class.java)
            startActivity(intent)
        }





    }


}