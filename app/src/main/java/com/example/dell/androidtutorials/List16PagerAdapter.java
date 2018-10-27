package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List16PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List16PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List16Tab1 list16Tab1=new List16Tab1();
                return list16Tab1;
            case 1:
                List16Tab2 list16Tab2=new List16Tab2();
                return list16Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
