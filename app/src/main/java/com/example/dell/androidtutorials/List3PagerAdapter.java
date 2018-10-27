package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List3PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List3PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                List3Tab1 list3Tab1 = new List3Tab1();
                return list3Tab1;
            case 1:
                List3Tab2 list3Tab2 = new List3Tab2();
                return list3Tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
