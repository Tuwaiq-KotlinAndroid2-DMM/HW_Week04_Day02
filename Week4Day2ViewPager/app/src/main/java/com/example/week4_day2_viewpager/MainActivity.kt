package com.example.week4_day2_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ViewPager = findViewById<ViewPager>(R.id.ViewPager)

        ViewPager.adapter = ListAdapter(supportFragmentManager)



    }
}