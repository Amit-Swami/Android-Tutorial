package com.amitmps.dell.androidtutorial;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class List7PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List7PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
              List7Tab1 list7Tab1=new List7Tab1();
              return list7Tab1;
            case 1:
                List7Tab2 list7Tab2=new List7Tab2();
                return list7Tab2;
            case 2:
                List7Tab3 list7Tab3=new List7Tab3();
                return list7Tab3;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
