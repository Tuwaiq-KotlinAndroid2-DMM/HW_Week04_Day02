package com.example.week4_day1_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mFrameLayout = findViewById<FrameLayout>(R.id.mFrameLayout)
        var buttonA = findViewById<Button>(R.id.buttonA)
        var buttonB = findViewById<Button>(R.id.buttonB)

        var afragment = FragmentA()
        var bfragment = FragmentB()

        buttonA.setOnClickListener {

            var bundle = Bundle()
            bundle.putString("username","Esra")
            afragment.arguments = bundle
            supportFragmentManager.beginTransaction().replace(R.id.mFrameLayout,afragment).commit()

        }

        buttonB.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.mFrameLayout,bfragment).commit()
        }
    }
}