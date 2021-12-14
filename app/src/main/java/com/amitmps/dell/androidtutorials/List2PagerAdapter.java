package com.amitmps.dell.androidtutorials;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class List2PagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public List2PagerAdapter(FragmentManager fm,int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                List2Tab1 list2Tab1 = new List2Tab1();
                return list2Tab1;
            case 1:
                List2Tab2 list2Tab2 = new List2Tab2();
                return list2Tab2;
            case 2:
                List2Tab3 list2Tab3 = new List2Tab3();
                return list2Tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
