package com.amitmps.dell.androidtutorial;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    String[] tabs=new String[]{"TUTORIAL","EXAMPLE","QUIZ"};
    int tabnumber=3;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                Tab1 tab1=new Tab1();
                return tab1;
            case 1:
                Tab2 tab2=new Tab2();
                return tab2;
            case 2:
                Tab3 tab3=new Tab3();
                return tab3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
