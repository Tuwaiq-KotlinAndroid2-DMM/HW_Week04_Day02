package com.example.w4day2viewpager.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.w4day2viewpager.profileFragmen

class instagram (fragment: FragmentManager): FragmentStatePagerAdapter(fragment) {


    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        when(position){
            0 -> return HomeFragmentFragment()
            1 -> return  profileFragmen()
            2 -> return  searchFragmwnt()
        }

        return HomeFragmentFragment()
    }
}
