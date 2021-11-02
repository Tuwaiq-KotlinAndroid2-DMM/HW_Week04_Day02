package com.example.myapplicationviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class inatAdapter (fragment:FragmentManager):FragmentStatePagerAdapter(fragment){
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){

            0 ->return homeFragment()
            1 -> return xplawor()
            2 ->return profile()
        }
        return homeFragment()
    }


}