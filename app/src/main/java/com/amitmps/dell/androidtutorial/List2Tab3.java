package com.amitmps.dell.androidtutorial;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class List2Tab3 extends Fragment {

    Button bt;
    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_list2_tab3, container, false);
        tv=view.findViewById(R.id.explicittextView);
        bt=view.findViewById(R.id.explixitb1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),List2Explicit.class);
                startActivity(intent);
            }
        });
        return view;
    }
}