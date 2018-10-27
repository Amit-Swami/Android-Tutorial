package com.example.dell.androidtutorials;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class List8Tab2 extends Fragment {

Button bt;
TextView tv;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list8_tab2, container, false);
        bt=view.findViewById(R.id.list8b1);
        tv=view.findViewById(R.id.list8tv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List8AsyncTask list8AsyncTask=new List8AsyncTask(getContext(),tv,bt);
                list8AsyncTask.execute();
                bt.setEnabled(false);
            }
        });
        return view;
    }

}
