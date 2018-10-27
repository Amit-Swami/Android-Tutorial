package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List12PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List12PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                List12Tab1 list12Tab1 = new List12Tab1();
                return list12Tab1;
            case 1:
                List12Tab2 list12Tab2 = new List12Tab2();
                return list12Tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
