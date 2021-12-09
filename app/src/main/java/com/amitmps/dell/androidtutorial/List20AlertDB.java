package com.amitmps.dell.androidtutorial;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class List20AlertDB extends Fragment {
    AdView mAdView;
    Button bt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_list20_alertdb, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView=view.findViewById(R.id.adView20);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        bt=view.findViewById(R.id.list20b1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ab=new AlertDialog.Builder(getActivity());
                ab.setTitle("Do you want to exit");
                ab.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                      getActivity().finish();
                    }
                });
                ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                     dialogInterface.cancel();
                    }
                });
                AlertDialog a=ab.create();
                a.show();
            }
        });
        return view;
    }
}
