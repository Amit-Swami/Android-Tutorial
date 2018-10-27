package com.example.dell.androidtutorials;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class List6Tab2 extends Fragment {
   Button bt;
   TextView tv;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_list6_tab2, container, false);
        bt=view.findViewById(R.id.list6b1);
        tv=view.findViewById(R.id.list6textview);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ab=new AlertDialog.Builder(getActivity());
                final String[] options=new String[]{"Nike","sparx","Gucci","puma","adidas"};
                final boolean[] checkedoptions=new boolean[]{false,false,false,false,false};
                final List<String> list= Arrays.asList(options);
                ab.setMultiChoiceItems(options, checkedoptions, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        checkedoptions[i]=b;
                    }
                });
                ab.setCancelable(false);
                ab.setTitle("select your brand");
                ab.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        tv.setText("Your Preffered Brand is.....");
                        for(int j=0;j<options.length;j++){
                            boolean checked=checkedoptions[j];
                            if (checked){
                                tv.setText(tv.getText()+", "+list.get(j)+"\n");
                            }
                        }

                    }
                });
                ab.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog a=ab.create();
                a.show();
            }
        });
        return view;
    }

}
