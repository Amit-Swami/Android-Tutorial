package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List17PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List17PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List17Tab1 list17Tab1=new List17Tab1();
                return list17Tab1;
            case 1:
                List17Tab2 list17Tab2=new List17Tab2();
                return list17Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
