package com.example.dell.androidtutorials;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class List15Tab2 extends Fragment {
private LinearLayoutManager linearLayoutManager;
private List<List15DataClass> itemlist;
private List15DataAdapter list15DataAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_list15_tab2, container, false);
        RecyclerView recyclerView=v.findViewById(R.id.list15recyclerview);
        itemlist=new ArrayList<>();
        list15DataAdapter=new List15DataAdapter(getActivity(),itemlist);

        linearLayoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setAdapter(list15DataAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

        itemlist.add(new List15DataClass("Title 1","Description 1"));
        itemlist.add(new List15DataClass("Title 2","Description 2"));
        itemlist.add(new List15DataClass("Title 3","Description 3"));
        itemlist.add(new List15DataClass("Title 4","Description 4"));
        itemlist.add(new List15DataClass("Title 5","Description 5"));
        itemlist.add(new List15DataClass("Title 6","Description 6"));
        itemlist.add(new List15DataClass("Title 7","Description 7"));
        itemlist.add(new List15DataClass("Title 8","Description 8"));

        return v;
    }

}
