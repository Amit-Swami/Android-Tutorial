package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List18PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List18PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List18Tab1 list18Tab1=new List18Tab1();
                return list18Tab1;
            case 1:
                List18Tab2 list18Tab2=new List18Tab2();
                return list18Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
