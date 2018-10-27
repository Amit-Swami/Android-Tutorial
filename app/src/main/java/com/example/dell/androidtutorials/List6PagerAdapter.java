package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List6PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List6PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List6Tab1 list6Tab1=new List6Tab1();
                return list6Tab1;
            case 1:
                List6Tab2 list6Tab2=new List6Tab2();
                return list6Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
