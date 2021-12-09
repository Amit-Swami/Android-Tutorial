package com.amitmps.dell.androidtutorial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class List8Tab3 extends Fragment {

    AdView mAdView;
    Button bt;
    TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list8_tab3, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView=view.findViewById(R.id.adView8);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        bt=view.findViewById(R.id.list8b1);
        tv=view.findViewById(R.id.list8tv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List8AsyncTask list8AsyncTask=new List8AsyncTask(getContext(),tv,bt);
                list8AsyncTask.execute();
                bt.setEnabled(false);
            }
        });
        return view;
    }
}