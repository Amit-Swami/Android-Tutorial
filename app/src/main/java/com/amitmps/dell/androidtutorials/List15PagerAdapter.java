package com.amitmps.dell.androidtutorials;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class List15PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List15PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List15Tab1 list15Tab1=new List15Tab1();
                return list15Tab1;
            case 1:
                List15Tab2 list15Tab2=new List15Tab2();
                return list15Tab2;
            case 2:
                List15Tab3 list15Tab3=new List15Tab3();
                return list15Tab3;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
