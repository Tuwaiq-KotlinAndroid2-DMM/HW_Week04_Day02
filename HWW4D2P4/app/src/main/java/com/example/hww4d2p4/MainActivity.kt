package com.example.hww4d2p4

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