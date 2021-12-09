package com.amitmps.dell.androidtutorial;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DemoTab extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_demo_tab, container, false);
        loadDemo();

        return view;
    }

    private void loadDemo() {
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        switch (getActivity().getIntent().getStringExtra("Position"))
        {
            case "Hello World":
                List1HelloWorld list1HelloWorld = new List1HelloWorld();
                fragmentTransaction.replace(R.id.list1tab3id,list1HelloWorld);
                fragmentTransaction.commit();
                break;
            case "Implicit Intent":
                List3Implicit list3Implicit = new List3Implicit();
                fragmentTransaction.replace(R.id.list1tab3id,list3Implicit);
                fragmentTransaction.commit();
                break;
            case "Multiple Choice":
                List6MultipleChoice list6MultipleChoice = new List6MultipleChoice();
                fragmentTransaction.replace(R.id.list1tab3id,list6MultipleChoice);
                fragmentTransaction.commit();
                break;
            case "Date&Time Picker":
                List9DateTime list9DateTime = new List9DateTime();
                fragmentTransaction.replace(R.id.list1tab3id,list9DateTime);
                fragmentTransaction.commit();
                break;
            case "Notification":
                List10Notification list10Notification = new List10Notification();
                fragmentTransaction.replace(R.id.list1tab3id,list10Notification);
                fragmentTransaction.commit();
                break;
            case "ListView":
                List13ListView list13ListView = new List13ListView();
                fragmentTransaction.replace(R.id.list1tab3id,list13ListView);
                fragmentTransaction.commit();
                break;
            case "GridView":
                List14GridView list14GridView = new List14GridView();
                fragmentTransaction.replace(R.id.list1tab3id,list14GridView);
                fragmentTransaction.commit();
                break;
            case "Text To Speech":
                List16TextToSpeech list16TextToSpeech = new List16TextToSpeech();
                fragmentTransaction.replace(R.id.list1tab3id,list16TextToSpeech);
                fragmentTransaction.commit();
                break;
            case "Speech To Text":
                List17SpeechToText list17SpeechToText = new List17SpeechToText();
                fragmentTransaction.replace(R.id.list1tab3id,list17SpeechToText);
                fragmentTransaction.commit();
                break;
            case "Sensor":
                List18Sensor list18Sensor = new List18Sensor();
                fragmentTransaction.replace(R.id.list1tab3id,list18Sensor);
                fragmentTransaction.commit();
                break;
            case "Json":
                List19Json list19Json = new List19Json();
                fragmentTransaction.replace(R.id.list1tab3id,list19Json);
                fragmentTransaction.commit();
                break;
            case "Alert Dialogbox":
                List20AlertDB list20AlertDB = new List20AlertDB();
                fragmentTransaction.replace(R.id.list1tab3id,list20AlertDB);
                fragmentTransaction.commit();
                break;
            default:
                break;
        }
    }
}