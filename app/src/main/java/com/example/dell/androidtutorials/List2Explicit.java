package com.example.dell.androidtutorials;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class List2Explicit extends AppCompatActivity {
    Context context;
Button bt;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2_explicit);
        bt=findViewById(R.id.explicitb2);
        tv=findViewById(R.id.explicittextView2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            List2Tab2 list2Tab2=new List2Tab2();
            ft.replace(R.id.list2explicitfragment,list2Tab2);
            ft.addToBackStack(null);
            ft.commit();
                }
        });
    }
}
