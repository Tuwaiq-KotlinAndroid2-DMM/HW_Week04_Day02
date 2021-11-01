package com.example.week4day2viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class ListAdapter(fragment: FragmentManager):FragmentStatePagerAdapter(fragment) {


    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){

            0-> return HomeFragment()
            1-> return ExploreFragment()
            2-> return profileFragment()

        }

        return HomeFragment()
    }
}