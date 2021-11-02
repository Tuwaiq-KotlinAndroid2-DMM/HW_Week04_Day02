package com.example.hw_week4_day2_solution_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mButtonA= findViewById<Button>(R.id.buttonA)
        var mButtonB= findViewById<Button>(R.id.buttonB)

        var afragment= AFragment()
        var bfragment= BFragment()



        mButtonA.setOnClickListener {
            var bundle=Bundle()
            bundle.putString("username","khaled")
            afragment.arguments= bundle

            supportFragmentManager.beginTransaction()
                .replace(R.id.mFrameLayout,afragment)
                .commit()

        }

        mButtonB.setOnClickListener {

            supportFragmentManager.beginTransaction()
                .replace(R.id.mFrameLayout,bfragment)
                .commit()

        }
    }
}