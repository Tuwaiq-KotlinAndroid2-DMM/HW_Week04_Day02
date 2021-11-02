package com.example.hw_week4_day2_solution_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager= findViewById<ViewPager>(R.id.mViewPager)

        viewPager.adapter= InstaAdapter(supportFragmentManager)
    }
}