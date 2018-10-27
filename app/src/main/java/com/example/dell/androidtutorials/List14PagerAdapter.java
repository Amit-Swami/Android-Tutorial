package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List14PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List14PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List14Tab1 list14Tab1=new List14Tab1();
                return list14Tab1;
            case 1:
                List14Tab2 list14Tab2=new List14Tab2();
                return list14Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
