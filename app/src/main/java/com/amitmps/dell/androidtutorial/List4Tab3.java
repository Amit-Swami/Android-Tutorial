package com.amitmps.dell.androidtutorial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class List4Tab3 extends Fragment implements View.OnClickListener {
    AdView mAdView;

    Button bt1,bt2,bt3;
    List4Fragment1 f1=new List4Fragment1();
    List4Fragment2 f2=new List4Fragment2();
    List4Fragment3 f3=new List4Fragment3();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list4_tab3, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView =view.findViewById(R.id.adView4);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        bt1=view.findViewById(R.id.List4b1);
        bt2=view.findViewById(R.id.List4b2);
        bt3=view.findViewById(R.id.List4b3);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.List4b1:
                FragmentTransaction fm1=getFragmentManager().beginTransaction();
                fm1.replace(R.id.List4frm,f1);
                fm1.commit();
                break;
            case R.id.List4b2:
                FragmentTransaction fm2=getFragmentManager().beginTransaction();
                fm2.replace(R.id.List4frm,f2);
                fm2.commit();
                break;
            case R.id.List4b3:
                FragmentTransaction fm3=getFragmentManager().beginTransaction();
                fm3.replace(R.id.List4frm,f3);
                fm3.commit();
                break;
        }
    }
}