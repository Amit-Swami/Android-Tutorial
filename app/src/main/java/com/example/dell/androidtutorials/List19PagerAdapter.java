package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List19PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List19PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                List19Tab1 list19Tab1 = new List19Tab1();
                return list19Tab1;
            case 1:
                List19Tab2 list19Tab2 = new List19Tab2();
                return list19Tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
