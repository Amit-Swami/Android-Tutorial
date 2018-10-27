package com.example.dell.androidtutorials;


import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 */
public class List16Tab2 extends Fragment implements View.OnClickListener {
    Button b1,b2;
    EditText ed;
    TextToSpeech t1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list16_tab2, container, false);
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
