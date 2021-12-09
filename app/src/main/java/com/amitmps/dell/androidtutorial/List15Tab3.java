package com.amitmps.dell.androidtutorial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.List;

public class List15Tab3 extends Fragment {

    AdView mAdView;
    private LinearLayoutManager linearLayoutManager;
    private List<List15DataClass> itemlist;
    private List15DataAdapter list15DataAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list15_tab3, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView=view.findViewById(R.id.adView15);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        RecyclerView recyclerView=view.findViewById(R.id.list15recyclerview);
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
        return view;
    }
}