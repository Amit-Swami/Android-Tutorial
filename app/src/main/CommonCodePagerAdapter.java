package com.amitmps.dell.androidtutorial;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class CommonCodePagerAdapter extends FragmentStatePagerAdapter {
    int tabnumber;
    public CommonCodePagerAdapter(FragmentManager fm, int numbertab) {
        super(fm);
        this.tabnumber=numbertab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                JavaTab javaTab = new JavaTab();
                return javaTab;
            case 1:
                XmlTab xmlTab = new XmlTab();
                return xmlTab;
            case 2:
                DemoTab demoTab = new DemoTab();
                return demoTab;
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