package com.amitmps.dell.androidtutorial;

import android.content.Context;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
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
            List2Tab3 list2Tab3=new List2Tab3();
            ft.replace(R.id.list2explicitfragment,list2Tab3);
            ft.addToBackStack(null);
            ft.commit();
                }
        });
    }
}
