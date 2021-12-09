package com.amitmps.dell.androidtutorial;


import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.amitmps.dell.androidtutorial.Common.Javacode;
import com.amitmps.dell.androidtutorial.Common.Xmlcode;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class List12Tab2 extends Fragment implements CodeView.OnHighlightListener{

    AdView mAdView;
    CodeView codeViewxml,codeViewmanif;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_list12_tab2, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView = view.findViewById(R.id.adView40);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        codeViewxml=view.findViewById(R.id.code_view_xml);
        codeViewmanif=view.findViewById(R.id.code_view_manifest);

        codeViewxml.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DEFAULT)
                .setCode(Xmlcode.VIBRATION1)
                .setLanguage(Language.JAVA)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(true)
                .setShowLineNumber(true)
                .setStartLineNumber(1)
                .apply();

        codeViewmanif.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DEFAULT)
                .setCode(Xmlcode.VIBRATION2)
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
