package com.amitmps.dell.androidtutorial;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class List21Tab3 extends Fragment implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private Toolbar mtoolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list21_tab3, container, false);
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