package com.example.hwviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import java.text.FieldPosition

class InstaAdapter (fragment: FragmentManager):(fragment){
    override fun getCount():Int{
        return 3

        override fun getItem(position:Int):Fragment{
           when(position) {
               0->return HomeFragment()
               1->return ExploreFragment()
               2->return ProfileFragment()
               return HomeFragment()
           }

    }
