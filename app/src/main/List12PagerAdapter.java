package com.amitmps.dell.androidtutorial;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

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
            case 2:
                List12Tab3 list12Tab3 = new List12Tab3();
                return list12Tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
