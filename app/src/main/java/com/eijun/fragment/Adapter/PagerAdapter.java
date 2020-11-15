package com.eijun.fragment.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.eijun.fragment.Fragment.FragmentKontak;
import com.eijun.fragment.Fragment.FragmentPesan;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int number_tabs ;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm);
        this.number_tabs=behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0 :
               return  new FragmentKontak();

           case 1:
               return new FragmentPesan();
           default:
               return  null ;
       }

    }

    @Override
    public int getCount() {
        return number_tabs;
    }
}
