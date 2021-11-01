package com.example.week5day2hw

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class instgramadapter (fragment:FragmentManager):FragmentStatePagerAdapter(fragment){

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(p0: Int): Fragment {
        when(p0){
            0-> return HomeFragment()
            1-> return reelsFragment()
            2-> return shopFragment()

    }
        return HomeFragment()




    }
}