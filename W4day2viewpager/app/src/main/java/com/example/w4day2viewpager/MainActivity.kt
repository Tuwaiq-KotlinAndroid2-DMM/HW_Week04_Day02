package com.example.viewpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.w4day2viewpager.R
import com.example.w4day2viewpager.ui.main.instagram

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager = findViewById<ViewPager>(R.id.mViewPager)
        viewPager.adapter = instagram(supportFragmentManager)
    }
}