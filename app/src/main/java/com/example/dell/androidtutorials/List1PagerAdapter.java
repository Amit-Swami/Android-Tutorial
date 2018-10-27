package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List1PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List1PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                List1Tab1 list1Tab1 = new List1Tab1();
                return list1Tab1;
            case 1:
                List1Tab2 list1Tab2 = new List1Tab2();
                return list1Tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
