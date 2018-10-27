package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List8PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List8PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                List8Tab1 list8Tab1=new List8Tab1();
                return list8Tab1;
            case 1:
                List8Tab2 list8Tab2=new List8Tab2();
                return list8Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
