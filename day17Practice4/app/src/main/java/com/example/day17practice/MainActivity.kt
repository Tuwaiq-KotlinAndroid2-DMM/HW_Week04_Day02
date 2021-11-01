package com.example.day17practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.day17practice.Adapter.FragmentAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager = findViewById<ViewPager>(R.id.viewPagerFragment)
        viewPager.adapter = FragmentAdapter(supportFragmentManager)

        var tabLayout = findViewById<TabLayout>(R.id.mainTabLayout)
        tabLayout.setupWithViewPager(viewPager)
        var homeTab = findViewById<TabLayout>(R.id.homeTabItem)
        var exploreTab = findViewById<TabLayout>(R.id.exploreTabItem)
        var profileTab = findViewById<TabLayout>(R.id.profileTabItem)

    }
}