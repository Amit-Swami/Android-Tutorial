package com.amitmps.dell.androidtutorial;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class List22PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List22PagerAdapter(FragmentManager fm, int numbertab)
    {
        super(fm);
        this.tabnumber=numbertab;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List22Tab1 list22Tab1=new List22Tab1();
                return list22Tab1;
            case 1:
                List22Tab2 list22Tab2=new List22Tab2();
                return list22Tab2;
            case 2:
                List22Tab3 list22Tab3=new List22Tab3();
                return list22Tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return tabnumber;
    }
}
