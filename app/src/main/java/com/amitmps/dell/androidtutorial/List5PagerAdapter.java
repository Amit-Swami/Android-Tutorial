package com.amitmps.dell.androidtutorial;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

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
            case 2:
                List5Tab3 list5Tab3=new List5Tab3();
                return list5Tab3;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
