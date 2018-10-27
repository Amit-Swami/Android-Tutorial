package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List13PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List13PagerAdapter(FragmentManager fm, int numbertab)
    {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List13Tab1 list13Tab1=new List13Tab1();
                return list13Tab1;
            case 1:
                List13Tab2 list13Tab2=new List13Tab2();
                return list13Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount()
    {
        return tabnumber;
    }
}
