package com.amitmps.dell.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Tab3FinalQuizScore extends AppCompatActivity {
    AdView mAdView;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3_final_quiz_score);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
                    @Override
                    public void onInitializationComplete(InitializationStatus initializationStatus) {

                    }
                });
                mAdView = findViewById(R.id.adView24);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        tv1=findViewById(R.id.tab3fqstv1);
        tv2=findViewById(R.id.tab3fqstv2);

        Bundle bundle=getIntent().getExtras();
        int score=bundle.getInt("FinalScore");

        tv2.setText("Your score " + score + " out of " + Tab3QuestionLibrary.mquestions.length);
    }
}