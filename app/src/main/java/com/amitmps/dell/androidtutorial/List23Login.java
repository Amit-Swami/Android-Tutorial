package com.amitmps.dell.androidtutorial;

import android.app.ProgressDialog;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class List23Login extends AppCompatActivity implements View.OnClickListener{
    private Button btloginSignIn;
    private EditText etloginEmail;
    private EditText etloginPassword;
    private TextView tvloginSignUp;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list23_login);

        firebaseAuth = FirebaseAuth.getInstance();

        if (firebaseAuth.getCurrentUser() != null) {
            finish();
            startActivity(new Intent(getApplicationContext(), List23Profile.class));
        }
        etloginEmail = findViewById(R.id.ed_Email);
        etloginPassword = findViewById(R.id.ed_Password);
        btloginSignIn = findViewById(R.id.btnSignIn);
        tvloginSignUp = findViewById(R.id.tv_sign_up);

        progressDialog = new ProgressDialog(this);

        btloginSignIn.setOnClickListener(this);
        tvloginSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btloginSignIn) {
            userLogin();
        }
        if (view == tvloginSignUp) {
            finish();
            startActivity(new Intent(this, MainActivity.class));
        }
    }

    private void userLogin() {
        String email = etloginEmail.getText().toString().trim();
        String password = etloginPassword.getText().toString().trim();
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Please Enter Email", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_LONG).show();
            return;

        }
        progressDialog.setMessage("Signing In Please wait....");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressDialog.dismiss();
                if (task.isSuccessful()) {
                    finish();
                    startActivity(new Intent(getApplicationContext(), List23Profile.class));
                } else {
                    Toast.makeText(List23Login.this, "invalid Email and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
