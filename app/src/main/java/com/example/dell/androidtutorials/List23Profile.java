package com.example.dell.androidtutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class List23Profile extends AppCompatActivity implements View.OnClickListener {
    private FirebaseAuth firebaseAuth;
    private TextView tvP;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list23_profile);
        firebaseAuth=FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser()==null){
            finish();
            startActivity(new Intent(this,List23Login.class));
        }
        FirebaseUser user=firebaseAuth.getCurrentUser();

        tvP=findViewById(R.id.tv_profile);
        btnLogout=findViewById(R.id.btn_logout);

        tvP.setText("Welcome"+user.getEmail());
        btnLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==btnLogout){
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(getApplicationContext(),List23Login.class));
        }

    }
}
