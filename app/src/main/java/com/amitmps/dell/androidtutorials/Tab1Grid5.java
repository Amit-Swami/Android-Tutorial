package com.amitmps.dell.androidtutorials;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tab1Grid5 extends AppCompatActivity {
String item[]=new String[]{"Activity LifeCycle","Intent and Types","Intent Resolution","Fragment","InterFragment Communication"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1_grid5);
        ListView lv=findViewById(R.id.t1g5lv);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid5List1.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid5List2.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid5List3.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid5List4.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(),Tab1Grid5List5.class));
                        break;
                }
            }
        });
    }
}
