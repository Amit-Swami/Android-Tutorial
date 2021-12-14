package com.amitmps.dell.androidtutorials;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tab1Grid1 extends AppCompatActivity {
String item[]=new String[]{"Android Introduction","Android Histroy and Versions","Android Versions Symbols","Why Android?","Android Software Stack","ART vs Dalvik","Android Application Component","Android Environment Setup","Activate Developer Option","Building Your First App"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1_grid1);
        ListView lv=findViewById(R.id.t1g1lv);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid1List1.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid1List2.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid1List3.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid1List4.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid1List5.class));
                        break;
                    case 5:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid1List6.class));
                        break;
                    case 6:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid1List7.class));
                        break;
                    case 7:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid1List8.class));
                        break;
                    case 8:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid1List9.class));
                        break;
                    case 9:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid1List10.class));
                        break;


                }
            }
        });
    }
}
