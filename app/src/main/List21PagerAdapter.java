package com.amitmps.dell.androidtutorial;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

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
            case 2:
                List21Tab3 list21Tab3=new List21Tab3();
                return list21Tab3;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
