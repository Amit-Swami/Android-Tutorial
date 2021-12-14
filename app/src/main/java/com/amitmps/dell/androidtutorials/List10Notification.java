package com.amitmps.dell.androidtutorials;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
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
public class List10Notification extends Fragment {

    AdView mAdView;
    Button bt;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list10_notification, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView=view.findViewById(R.id.adView10);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        bt=view.findViewById(R.id.list10b1);
        bt.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                PendingIntent pi= PendingIntent.getActivity(getActivity(),0,i,0);
                Notification nt=new Notification.Builder(getActivity())
                        .setTicker("TickerTitle")
                        .setContentTitle("Notification")
                        .setContentText("Your msg is here")
                        .setSmallIcon(R.drawable.ic_android)
                        .addAction(R.drawable.ic_android,"Message",pi)
                        .setContentIntent(pi).getNotification();
                nt.flags=Notification.FLAG_AUTO_CANCEL;
                NotificationManager nm= (NotificationManager)getActivity(). getSystemService(getActivity().NOTIFICATION_SERVICE);
                nm.notify(0,nt);
            }
        });
        return view;
    }

}
