package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List10PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List10PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List10Tab1 list10Tab1=new List10Tab1();
                return list10Tab1;
            case 1:
                List10Tab2 list10Tab2=new List10Tab2();
                return list10Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
