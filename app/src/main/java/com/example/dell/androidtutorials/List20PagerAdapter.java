package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List20PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List20PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List20Tab1 list20Tab1=new List20Tab1();
                return list20Tab1;
            case 1:
                List20Tab2 list20Tab2=new List20Tab2();
                return list20Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
