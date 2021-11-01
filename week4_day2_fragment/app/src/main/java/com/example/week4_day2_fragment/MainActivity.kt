package com.example.week4_day2_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mFrameLayout=findViewById<FrameLayout>(R.id.mFramelayout)
        var button1=findViewById<Button>(R.id.buttonA)
        var button2=findViewById<Button>(R.id.buttonB)


        var AFragment=aFragment()
        var BFragment=bFragment()

        button1.setOnClickListener {

            supportFragmentManager.beginTransaction()
                .replace(R.id.mFramelayout,AFragment)
                .commit()
        }
        button2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.mFramelayout,BFragment)
                .commit()
        }
    }
}