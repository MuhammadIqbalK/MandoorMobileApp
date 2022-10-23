package com.example.mandoor

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class pageAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return 4;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return gtstartFragment1()
            }
            1 -> {
                return gtstartFragment2()
            }
            2 -> {
                return gtstartFragment3()
            }

            else -> {
                return gtstartFragment1()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Tab 1"
            }
            1 -> {
                return "Tab 2"
            }
        }
        return super.getPageTitle(position)
    }
}