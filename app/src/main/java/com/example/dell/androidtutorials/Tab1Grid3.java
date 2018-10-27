package com.example.dell.androidtutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tab1Grid3 extends AppCompatActivity {
String item[]=new String[]{"Layout Introduction","Linear Layout","Relative Layout","Frame Layout","Table Layout","Views and Viewgroup"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1_grid3);
        ListView lv=findViewById(R.id.t1g3lv);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid3List1.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid3List2.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid3List3.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid3List4.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid3List5.class));
                        break;
                    case 5:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid3List6.class));
                        break;
                }
            }
        });
    }
}
