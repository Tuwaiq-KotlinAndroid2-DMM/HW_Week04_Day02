package com.example.viwepager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var viwePager=findViewById<ViewPager>(R.id.mViewPager)

        viwePager.adapter = InstaAdapter(supportFragmentManager)
    }
}