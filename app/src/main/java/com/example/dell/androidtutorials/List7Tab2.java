package com.example.dell.androidtutorials;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class List7Tab2 extends Fragment {


    public List7Tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        new Thread(){
            public void run(){
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent=new Intent(getContext(),List7Splash.class);
                startActivity(intent);
            }
        }.start();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list7_tab2, container, false);
    }

}
