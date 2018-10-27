package com.example.dell.androidtutorials;


import android.content.Intent;
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
public class List2Tab2 extends Fragment {
Button bt;
TextView tv;

    public List2Tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list2_tab2, container, false);
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
