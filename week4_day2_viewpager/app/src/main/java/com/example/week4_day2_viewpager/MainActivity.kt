package com.example.week4_day2_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mViewpager=findViewById<ViewPager>(R.id.mViewpager)
            mViewpager.adapter=instaAdapter(supportFragmentManager)


    }
}