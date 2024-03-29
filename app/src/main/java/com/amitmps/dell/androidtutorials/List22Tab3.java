package com.amitmps.dell.androidtutorials;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class List22Tab3 extends Fragment {

    AdView mAdView;
    Button btnSignIn,btnSignUp;
    List22DataBaseAdapter list22DataBaseAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list22_tab3, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView=view.findViewById(R.id.adView22);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        list22DataBaseAdapter=new List22DataBaseAdapter(getActivity());
        list22DataBaseAdapter=list22DataBaseAdapter.open();

        btnSignIn=view.findViewById(R.id.list22buttonSignIn);
        btnSignUp=view.findViewById(R.id.list22buttonSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSignUP=new Intent(getContext(),List22SignUp.class);
                startActivity(intentSignUP);
            }
        });
        return view;
    }

    public void signIn(View V)
    {
        final Dialog dialog=new Dialog(getActivity());
        dialog.setContentView(R.layout.list22_login);
        dialog.setTitle("Login");

        final EditText editTextUserName=dialog.findViewById(R.id.list22editTextUserNameToLogin);
        final EditText editTextPassword=dialog.findViewById(R.id.list22editTextPasswordToLogin);

        Button btnSignIn=dialog.findViewById(R.id.list22loginbuttonSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName=editTextUserName.getText().toString();
                String password=editTextPassword.getText().toString();

                String storedPassword=list22DataBaseAdapter.getSingleEntry(userName);

                if(password.equals(storedPassword))
                {
                    Intent i=new Intent(getContext(),List22LogedData.class);
                    i.putExtra("name",userName);
                    i.putExtra("password",password);
                    startActivity(i);

                    Toast.makeText(getContext(),"Congrats:Login Successfully",Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                }
                else
                {
                    Toast.makeText(getContext(),"User Name or Password does not match",Toast.LENGTH_LONG).show();
                }
            }
        });
        dialog.show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        list22DataBaseAdapter.close();
    }
}