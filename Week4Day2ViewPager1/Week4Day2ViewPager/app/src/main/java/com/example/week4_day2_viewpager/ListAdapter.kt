package com.example.week4_day2_viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ListAdapter(fragment:FragmentManager):FragmentStatePagerAdapter(fragment) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        when(position){

            0-> return HomeFragment()
            1-> return ExploreFragment()
            2-> return ProfileFragment()
        }
        return HomeFragment()
    }
}