package com.example.dell.androidtutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tab1Grid14 extends AppCompatActivity {
String item[]=new String[]{"XML and XML Parsing","JSON and JSON Parsing"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1_grid14);

        ListView lv=findViewById(R.id.t1g14lv);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              switch (i)
              {
                  case 0:
                      startActivity(new Intent(getApplicationContext(),Tab1Grid14List1.class));
                      break;
                  case 1:
                      startActivity(new Intent(getApplicationContext(),Tab1Grid14List2.class));
                      break;
              }
            }
        });
    }
}
