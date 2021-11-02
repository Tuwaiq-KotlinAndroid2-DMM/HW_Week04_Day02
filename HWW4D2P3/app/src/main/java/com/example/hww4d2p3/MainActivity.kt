package com.example.hww4d2p3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

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
