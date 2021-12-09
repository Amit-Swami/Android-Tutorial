package com.amitmps.dell.androidtutorial;

import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class List22LogedData extends AppCompatActivity {
    TextView lusername,lpassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list22_loged_data);
        lusername=findViewById(R.id.list22ld_username);
        lpassword=findViewById(R.id.list22ld_password);

        Intent i=getIntent();
        lusername.setText(i.getStringExtra("name"));
        lpassword.setText(i.getStringExtra("password"));
    }
}
