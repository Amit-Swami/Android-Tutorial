package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List4PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;

    public List4PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List4Tab1 list4Tab1=new List4Tab1();
                return list4Tab1;
            case 1:
                List4Tab2 list4Tab2=new List4Tab2();
                return list4Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
