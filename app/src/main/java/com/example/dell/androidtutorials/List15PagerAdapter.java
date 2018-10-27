package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List15PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List15PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List15Tab1 list15Tab1=new List15Tab1();
                return list15Tab1;
            case 1:
                List15Tab2 list15Tab2=new List15Tab2();
                return list15Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
