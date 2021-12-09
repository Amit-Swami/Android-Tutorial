package com.amitmps.dell.androidtutorial;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class List23PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List23PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                List23Tab1 list23Tab1=new List23Tab1();
                return list23Tab1;
            case 1:
                List23Tab2 list23Tab2=new List23Tab2();
                return list23Tab2;
            case 2:
                List23Tab3 list23Tab3=new List23Tab3();
                return list23Tab3;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
