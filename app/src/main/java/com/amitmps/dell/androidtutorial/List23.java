package com.amitmps.dell.androidtutorial;

import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class List23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list23);
        TabLayout tabLayout=findViewById(R.id.list23tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("java code"));
        tabLayout.addTab(tabLayout.newTab().setText("xml code"));
        tabLayout.addTab(tabLayout.newTab().setText("demo"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewPager=findViewById(R.id.list23viewpager);
        List23PagerAdapter list23PagerAdapter=new List23PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(list23PagerAdapter);
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
