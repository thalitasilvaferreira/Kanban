package com.amandathalita.kanban2.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.util.ArrayList

class ViewPagerAdapter (fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

        private val fragmentList: MutableList<Fragment> = ArrayList()
        private val tittleList: MutableList<Int> = ArrayList()

        fun getTitle(position: Int): Int{
            return tittleList[position]
        }

        fun addFragment(fragment: Fragment, title: Int){
            fragmentList.add(fragment)
            tittleList.add(title)
        }

        override fun createFragment(position: Int): Fragment {
            return fragmentList[position]
        }

        override fun getItemCount(): Int {
            return fragmentList.size
    }
}