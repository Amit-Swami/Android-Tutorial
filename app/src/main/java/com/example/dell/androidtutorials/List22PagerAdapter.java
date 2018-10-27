package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List22PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List22PagerAdapter(FragmentManager fm, int numbertab)
    {
        super(fm);
        this.tabnumber=numbertab;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List22Tab1 list22Tab1=new List22Tab1();
                return list22Tab1;
            case 1:
                List22Tab2 list22Tab2=new List22Tab2();
                return list22Tab2;
                default:
                    return  null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
