package com.example.viwepager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class InstaAdapter(fragment: FragmentManager):FragmentStatePagerAdapter(fragment){


    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int):Fragment {
         when (position) {
            0 -> return HomeFragment()
            2 -> return SearchFragment()
            1 -> return ProfileFragment()

        }
        return HomeFragment()
    }}