package com.example.gad2020

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PageAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    //Indicate how page will be in the view page

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            LearningLeaderFragment()
        } else {
            SkilliqLeadersFragment()
        }
    }

}