package com.example.dell.androidtutorials;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.security.cert.TrustAnchor;


/**
 * A simple {@link Fragment} subclass.
 */
public class List21Tab2 extends Fragment implements NavigationView.OnNavigationItemSelectedListener {
   private DrawerLayout drawerLayout;
   private ActionBarDrawerToggle actionBarDrawerToggle;
   private Toolbar mtoolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_list21_tab2, container, false);
        mtoolbar=view.findViewById(R.id.list21toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(mtoolbar);

        drawerLayout=view.findViewById(R.id.list21drawerlayout);
        actionBarDrawerToggle=new ActionBarDrawerToggle(getActivity(),drawerLayout,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        ((AppCompatActivity)getActivity()). getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) view.findViewById(R.id.list21navView);
        navigationView.setNavigationItemSelectedListener(this);

        setHasOptionsMenu(true);


        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.list21_main_menu,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.item6)
        {
            Toast.makeText(getActivity(),item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.item1)
        {
            Toast.makeText(getActivity(),item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.item2)
        {
            Toast.makeText(getActivity(),item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.item3)
        {
            Toast.makeText(getActivity(),item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.item4)
        {
            Toast.makeText(getActivity(),item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.item5)
        {
            Toast.makeText(getActivity(),item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
