package com.example.frogment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnA=findViewById<Button>(R.id.buttonA)
        var btnB=findViewById<Button>(R.id.buttonB)


        var aFragment=AFragment()
        var bFragment=BFragment()

        btnA.setOnClickListener{
          var bandel=Bandel()
            bandel.putString("Username")
           aFragment.arguments=


            supportFragmentManager.beginTransaction()
                .replace(R.id.framellayout,aFragment)
                .commit()
        }
        btnB.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.framellayout,bFragment)
                .commit()
        }

    }
}