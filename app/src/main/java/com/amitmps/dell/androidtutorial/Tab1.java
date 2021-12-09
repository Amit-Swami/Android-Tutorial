package com.amitmps.dell.androidtutorial;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1 extends Fragment {
    RecyclerView mrecyclerview;
    List itemlist;
    Tab1_data mdata;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tab1, container, false);
        mrecyclerview=view.findViewById(R.id.tab1rv);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getActivity(), 2);
        RecyclerView.LayoutParams params=new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT,RecyclerView.LayoutParams.WRAP_CONTENT);
        params.setMargins(0,0,0,0);
        mrecyclerview.setLayoutManager(gridLayoutManager);

        itemlist=new ArrayList<>();
        itemlist.add(new Tab1_data("Android Introduction",R.drawable.grid1));
        itemlist.add(new Tab1_data("Project Structure",R.drawable.grid2));
        itemlist.add(new Tab1_data("Android Layout",R.drawable.grid3));
        itemlist.add(new Tab1_data("Android UI widget",R.drawable.grid4));
        itemlist.add(new Tab1_data("Activities & Fragments",R.drawable.grid5));
        itemlist.add(new Tab1_data("Android Services",R.drawable.grid6));
        itemlist.add(new Tab1_data("Android Menu",R.drawable.grid7));
        itemlist.add(new Tab1_data("Android Container",R.drawable.grid8));
        itemlist.add(new Tab1_data("Android DataStorage",R.drawable.grid9));
        itemlist.add(new Tab1_data("Firebase",R.drawable.grid10));
        itemlist.add(new Tab1_data("SQLite DataBase",R.drawable.grid11));
        itemlist.add(new Tab1_data("Thread & Process",R.drawable.grid12));
        itemlist.add(new Tab1_data("Android Notification",R.drawable.grid13));
        itemlist.add(new Tab1_data("XML & Json Parsing",R.drawable.grid14));

        Tab1_adapter tab1_adapter=new Tab1_adapter(getActivity(),itemlist);
        mrecyclerview.setAdapter(tab1_adapter);

        return view;
    }
}