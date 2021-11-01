package com.example.week5day2hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var amViewPager= findViewById<ViewPager>(R.id.amViewPager)
        amViewPager.adapter=instgramadapter(supportFragmentManager)

    }
}