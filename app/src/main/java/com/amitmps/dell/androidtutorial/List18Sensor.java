package com.amitmps.dell.androidtutorial;


import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class List18Sensor extends Fragment implements SensorEventListener {

    AdView mAdView;
    SensorManager sm;
    TextView tv;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list18_sensor, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView=view.findViewById(R.id.adView18);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        tv = view.findViewById(R.id.list18t1);
        sm = (SensorManager) getActivity().getSystemService(Context.SENSOR_SERVICE);
        sm.registerListener(this, sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
        return view;
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            float values[] = sensorEvent.values;
            float x = values[0];
            float y = values[1];
            float z = values[2];
            float asr = (x * x + y * y + z * z) / (SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);
            if (asr >= 2) {
                Random r = new Random();
                int i = r.nextInt(1000);
                tv.setText("" + i);

            }
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {


    }
}
