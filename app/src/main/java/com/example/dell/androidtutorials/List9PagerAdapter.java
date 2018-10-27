package com.example.dell.androidtutorials;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class List9PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List9PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List9Tab1 list9Tab1=new List9Tab1();
                return list9Tab1;
            case 1:
                List9Tab2 list9Tab2=new List9Tab2();
                return list9Tab2;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
