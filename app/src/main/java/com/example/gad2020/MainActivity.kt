package com.example.gad2020

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //SETTING UP THE VIEWPAGER

        val pageAdapter = PageAdapter(this)
        viewPager.adapter = pageAdapter
        //SETTING UP TABLAYOUTMEDIATOR TO LINK UP THE TABLAYOUT WITH VIEWPAGER
        TabLayoutMediator(tab_layout, viewPager) { tabs, position ->
            if (position == 0) {
                tabs.text = "LEARNING LEADERS"
            } else {
                tabs.text = "SKILL IQ LEADERS"
            }
        }.attach()
    }

}