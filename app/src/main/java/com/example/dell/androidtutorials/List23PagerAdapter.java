package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List23PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List23PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List23Tab1 list23Tab1=new List23Tab1();
                return list23Tab1;
            case 1:
                List23Tab2 list23Tab2=new List23Tab2();
                return list23Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
