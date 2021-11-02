package com.example.week4day2hw

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class FragmentAdapter(fragment: FragmentManager) : FragmentStatePagerAdapter(fragment) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
       0-> return Home_Fragment()
        1-> return Explore_Fragment()
        2-> return Profile_Fragment ()

        }
        return Home_Fragment()
    }
}