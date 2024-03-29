package com.amitmps.dell.androidtutorials;


import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 */
public class List16TextToSpeech extends Fragment implements View.OnClickListener {
    AdView mAdView;
    Button b1,b2;
    EditText ed;
    TextToSpeech t1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list16_texttospeech, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView=view.findViewById(R.id.adView16);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        b1=view.findViewById(R.id.list16b1);
        b2=view.findViewById(R.id.list16b2);
        ed=view.findViewById(R.id.list16ed);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        t1=new TextToSpeech(getActivity(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i==TextToSpeech.SUCCESS)
                {
                    t1.setLanguage(Locale.UK);
                }
            }
        });
        return view;
    }

    @Override
    public void onClick(View view) {
      switch (view.getId())
      {
          case R.id.list16b1:
              String toSpeak=ed.getText().toString();
              t1.speak(toSpeak,TextToSpeech.QUEUE_FLUSH,null);
              break;
          case R.id.list16b2:
              if(t1!=null)
              {
                  t1.stop();
                  break;
              }
      }
    }

    @Override
    public void onPause() {
        if(t1!=null)
        {
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }
}
