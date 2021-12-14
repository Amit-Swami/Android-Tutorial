package com.amitmps.dell.androidtutorials;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amitmps.dell.androidtutorials.Common.Xmlcode;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

public class XmlTab extends Fragment implements CodeView.OnHighlightListener {

    AdView mAdView;
    CodeView codeView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_xml_tab, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView = view.findViewById(R.id.adView26);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        // gestureDetector = new GestureDetector(getContext(), new GestureListener());

        codeView = view.findViewById(R.id.code_view_xml);

        /*codeView.setOptions(Options.Default.get(getContext())
                .withLanguage("java")
                .withCode(Xmlcode.HLO_WORLD)
                .withTheme(ColorTheme.DEFAULT));*/
        loadXmlPrograms();
        return view;
    }

    private void loadXmlPrograms() {
        String code = null;
        switch (getActivity().getIntent().getStringExtra("Position"))
        {
            case "Hello World":
                code= Xmlcode.HLO_WORLD;
                break;
            case "Implicit Intent":
                code=Xmlcode.IMPLICIT;
                break;
            case "Multiple Choice":
                code=Xmlcode.MULTIPLECHOICE;
                break;
            case "Date&Time Picker":
                code=Xmlcode.DATETIME;
                break;
            case "Notification":
                code=Xmlcode.NOTIFICATION;
                break;
            case "ListView":
                code=Xmlcode.LISTVIEW;
                break;
            case "GridView":
                code=Xmlcode.GRIDVIEW;
                break;
            case "Text To Speech":
                code=Xmlcode.TEXTTOSPEECH;
                break;
            case "Speech To Text":
                code=Xmlcode.SPEECHTOTEXT;
                break;
            case "Sensor":
                code=Xmlcode.SENSOR;
                break;
            case "Json":
                code=Xmlcode.JSONPARSE;
                break;
            case "Alert Dialogbox":
                code=Xmlcode.ALERTDIALOGBOX;
                break;
        }
        if (code==null){
            getActivity().finish();
        }
        else {
            codeView.setOnHighlightListener(this)
                    .setOnHighlightListener(this)
                    .setTheme(Theme.DEFAULT)
                    .setCode(code)
                    .setLanguage(Language.JAVA)
                    .setWrapLine(true)
                    .setFontSize(12)
                    .setZoomEnabled(true)
                    .setShowLineNumber(true)
                    .setStartLineNumber(1)
                    .apply();
            }
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