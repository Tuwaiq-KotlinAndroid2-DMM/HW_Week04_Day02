package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        var ButtonA= findViewById<Button>(R.id.buttonA)
        var ButtonB= findViewById<Button>(R.id.buttonb)

        var aFragment= FragmentA()
        var bFragment= FragmentB()

        ButtonA.setOnClickListener {
            var bundle= Bundle()
            bundle.putString("username","Fatima")
            aFragment.arguments=Bundle()

            supportFragmentManager.beginTransaction()
                .replace(R.id.mFrameLayout,aFragment)
                .commit()
        }

        ButtonB.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.mFrameLayout,bFragment)
                .commit()
        }

    }
}