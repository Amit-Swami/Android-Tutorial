package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List5PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List5PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List5Tab1 list5Tab1=new List5Tab1();
                return list5Tab1;
            case 1:
                List5Tab2 list5Tab2=new List5Tab2();
                return list5Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
