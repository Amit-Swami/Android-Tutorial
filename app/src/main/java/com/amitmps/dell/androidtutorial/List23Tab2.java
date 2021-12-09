package com.amitmps.dell.androidtutorial;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.amitmps.dell.androidtutorial.Common.Javacode;
import com.amitmps.dell.androidtutorial.Common.Xmlcode;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class List23Tab2 extends Fragment implements CodeView.OnHighlightListener  {

    AdView mAdView;
    CodeView codeViewxmlfire,codeViewloginxmlfire,codeViewprofilexmlfire;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list23_tab2, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView = view.findViewById(R.id.adView48);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        codeViewxmlfire=view.findViewById(R.id.code_view_xmlfire);
        codeViewxmlfire.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DEFAULT)
                .setCode(Xmlcode.FIREBASE1)
                .setLanguage(Language.JAVA)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(true)
                .setShowLineNumber(true)
                .setStartLineNumber(1)
                .apply();
        codeViewloginxmlfire=view.findViewById(R.id.code_view_loginxmlfire);
        codeViewloginxmlfire.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DEFAULT)
                .setCode(Xmlcode.FIREBASE2)
                .setLanguage(Language.JAVA)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(true)
                .setShowLineNumber(true)
                .setStartLineNumber(1)
                .apply();
        codeViewprofilexmlfire=view.findViewById(R.id.code_view_profilexmlfire);
        codeViewprofilexmlfire.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DEFAULT)
                .setCode(Xmlcode.FIREBASE3)
                .setLanguage(Language.JAVA)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(true)
                .setShowLineNumber(true)
                .setStartLineNumber(1)
                .apply();
        return view;
    }

    @Override
    public void onStartCodeHighlight() {

    }

    @Override
    public void onFinishCodeHighlight() {

    }

    @Override
    public void onLanguageDetected(Language language, int relevance) {

    }

    @Override
    public void onFontSizeChanged(int sizeInPx) {

    }

    @Override
    public void onLineClicked(int lineNumber, String content) {

    }
}
