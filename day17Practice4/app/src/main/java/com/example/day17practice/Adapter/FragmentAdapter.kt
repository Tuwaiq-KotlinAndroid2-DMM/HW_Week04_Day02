package com.example.day17practice.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.day17practice.ExploreFragment
import com.example.day17practice.HomeFragment
import com.example.day17practice.ProfileFragment

class FragmentAdapter(fragment: FragmentManager): FragmentStatePagerAdapter(fragment) {
    override fun getCount() = 3

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> HomeFragment()
            1 -> ExploreFragment()
            2 -> ProfileFragment()
            else -> HomeFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position){
            0 -> "Home"
            1 -> "Explore"
            2 -> "Profile"
            else -> "Home"
        }
    }
}