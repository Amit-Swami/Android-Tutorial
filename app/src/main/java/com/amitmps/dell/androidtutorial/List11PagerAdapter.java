package com.amitmps.dell.androidtutorial;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class List11PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List11PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List11Tab1 list11Tab1=new List11Tab1();
                return list11Tab1;
            case 1:
                List11Tab2 list11Tab2=new List11Tab2();
                return list11Tab2;
            case 2:
                List11Tab3 list11Tab3=new List11Tab3();
                return list11Tab3;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
