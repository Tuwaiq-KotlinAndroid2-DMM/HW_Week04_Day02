package com.example.week4day2hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mViewPager =findViewById<ViewPager2>(R.id.mViewPager)

        mViewPager.adapter=FragmentAdapter(supportFragmentManager)
    }
}