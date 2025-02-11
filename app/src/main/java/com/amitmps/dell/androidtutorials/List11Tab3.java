package com.amitmps.dell.androidtutorials;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class List11Tab3 extends Fragment {

    AdView mAdView;
    Button bt;
    EditText et;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list11_tab3, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView=view.findViewById(R.id.adView11);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        bt=view.findViewById(R.id.list11b1);
        et=view.findViewById(R.id.list11et);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t = Integer.parseInt(et.getText().toString());

                Intent i = new Intent(getActivity(), List11Alarm.class);

                PendingIntent pi = PendingIntent.getBroadcast(getContext(), 0, i, 0);

                AlarmManager man = (AlarmManager) getActivity().getSystemService(getActivity().ALARM_SERVICE);

                man.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (t * 1000), pi);

                Toast.makeText(getActivity(), "Alarm call after " + t + "seconds", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}