package com.amitmps.dell.androidtutorial;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class List23Tab3 extends Fragment implements View.OnClickListener {

    AdView mAdView;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonSignUp;
    private TextView textViewSignIn;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list23_tab3, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView=view.findViewById(R.id.adView23);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        firebaseAuth = FirebaseAuth.getInstance();

        if (firebaseAuth.getCurrentUser() != null) {
            getActivity().finish();
            Intent intent = new Intent(getContext(), List23Profile.class);
            startActivity(intent);
        }
        editTextEmail = view.findViewById(R.id.editTextEmail);
        editTextPassword = view.findViewById(R.id.editTextPassword);
        textViewSignIn = view.findViewById(R.id.tv_SignIn);
        buttonSignUp = view.findViewById(R.id.bt1);

        progressDialog = new ProgressDialog(getActivity());

        buttonSignUp.setOnClickListener(this);
        textViewSignIn.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View view) {
        if (view == buttonSignUp) {
            registerUser();
        }
        if (view == textViewSignIn) {
            startActivity(new Intent(getContext(), List23Login.class));
        }

    }

    private void registerUser() {
        String Email = editTextEmail.getText().toString().trim();
        String Password = editTextPassword.getText().toString().trim();

        if (TextUtils.isEmpty(Email)) {
            Toast.makeText(getContext(), "Please Enter Email", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(Password)) {
            Toast.makeText(getContext(), "Please Enter Password", Toast.LENGTH_LONG).show();
            return;
        }
        progressDialog.setMessage("Registering Please Wait........");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(Email, Password).addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    getActivity().finish();
                    startActivity(new Intent(getContext(), List23Profile.class));
                } else {
                    Toast.makeText(getContext(),"Registeration error...."+task.getException().getMessage(), Toast.LENGTH_LONG).show();
                }
                progressDialog.dismiss();
            }
        });
    }
}