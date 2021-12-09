package com.amitmps.dell.androidtutorial;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
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
public class List3Implicit extends Fragment implements View.OnClickListener {
   AdView mAdView;
   Button b1, b2, b3, b4, b5, b6, b7;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list3_implicit, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView=view.findViewById(R.id.adView3);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        b1 = view.findViewById(R.id.camera);
        b2 = view.findViewById(R.id.wifi);
        b3 = view.findViewById(R.id.dialer);
        b4 = view.findViewById(R.id.bluetooth);
        b5 = view.findViewById(R.id.display);
        b6 = view.findViewById(R.id.date);
        b7 = view.findViewById(R.id.gmail);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.camera:
                Intent i1 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(i1);
                break;
            case R.id.wifi:
                Intent i2 = new Intent(Settings.ACTION_WIFI_SETTINGS);
                startActivity(i2);
                break;
            case R.id.dialer:
                Intent i3 = new Intent(Intent.ACTION_DIAL);
                i3.setData(Uri.parse("tel:1234567890"));
                startActivity(i3);
                break;
            case R.id.bluetooth:
                Intent i4 = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
                startActivity(i4);
                break;
            case R.id.display:
                Intent i5 = new Intent(Settings.ACTION_DISPLAY_SETTINGS);
                startActivity(i5);
                break;
            case R.id.date:
                Intent i6 = new Intent(Settings.ACTION_DATE_SETTINGS);
                startActivity(i6);
                break;
            case R.id.gmail:
                Intent i7 = new Intent(Intent.ACTION_VIEW);
                i7.setData(Uri.parse("http://www.gmail.com"));
                startActivity(i7);
                break;
        }
    }
}