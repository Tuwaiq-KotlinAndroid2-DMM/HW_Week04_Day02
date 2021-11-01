package com.example.w4_d2_p4_viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class InstaAdapter(fragment: FragmentManager):FragmentStatePagerAdapter(fragment) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0-> HomeFragment()
            1-> ExploreFrgment()
            2-> ProfileFragment()
            else -> HomeFragment()
        }
    }
}