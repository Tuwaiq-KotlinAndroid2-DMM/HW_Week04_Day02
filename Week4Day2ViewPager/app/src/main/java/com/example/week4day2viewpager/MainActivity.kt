package com.example.week4day2viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager=findViewById<ViewPager>(R.id.ViewPager)

        viewPager.adapter=ListAdapter(supportFragmentManager)
    }
}