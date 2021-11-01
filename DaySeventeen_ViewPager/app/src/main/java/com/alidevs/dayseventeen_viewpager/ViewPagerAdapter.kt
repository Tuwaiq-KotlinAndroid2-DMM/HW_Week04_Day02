package com.alidevs.dayseventeen_viewpager

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: AppCompatActivity) :
	FragmentStateAdapter(fragmentActivity) {
	override fun getItemCount(): Int {
		return 2
	}

	override fun createFragment(position: Int): Fragment {
		return when (position) {
			0 -> FirstFragment()
			1 -> SecondFragment()
			else -> FirstFragment()
		}
	}
}