package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List21PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List21PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List21Tab1 list21Tab1=new List21Tab1();
                return list21Tab1;
            case 1:
                List21Tab2 list21Tab2=new List21Tab2();
                return list21Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
