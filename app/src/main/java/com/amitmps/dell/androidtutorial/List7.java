package com.amitmps.dell.androidtutorial;

import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class List7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list7);
        TabLayout tabLayout=findViewById(R.id.list7tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Java code"));
        tabLayout.addTab(tabLayout.newTab().setText("Xml code"));
        tabLayout.addTab(tabLayout.newTab().setText("Demo"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewPager=findViewById(R.id.list7viewpager);
        List7PagerAdapter list7PagerAdapter=new List7PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(list7PagerAdapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
