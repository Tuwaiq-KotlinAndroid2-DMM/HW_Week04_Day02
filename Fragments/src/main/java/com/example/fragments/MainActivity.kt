package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonfragmentA = findViewById<Button>(R.id.buttonFragmentA)
        var buttonfragmentB = findViewById<Button>(R.id.buttonFragmentB)

        var afagment=AFragment()
        var bfagment=BFragment()


        buttonfragmentA.setOnClickListener {
// add data
            var bundele=Bundle()
            bundele.putString("userName","Mzon")
            afagment.arguments=bundele

//**********
            supportFragmentManager.beginTransaction()
                .replace(R.id.mFrameLayout,afagment)
                .commit()
        }

        buttonfragmentB.setOnClickListener {

            supportFragmentManager.beginTransaction()
                .replace(R.id.mFrameLayout,bfagment)
                .commit()
        }
    }
}