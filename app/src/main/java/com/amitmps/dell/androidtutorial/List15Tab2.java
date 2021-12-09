package com.amitmps.dell.androidtutorial;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amitmps.dell.androidtutorial.Common.Javacode;
import com.amitmps.dell.androidtutorial.Common.Xmlcode;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class List15Tab2 extends Fragment implements CodeView.OnHighlightListener {

    AdView mAdView;
    CodeView codeViewxml,codeViewitem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list15_tab2, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView = view.findViewById(R.id.adView42);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        codeViewxml=view.findViewById(R.id.code_view_xml);
        codeViewxml.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DEFAULT)
                .setCode(Xmlcode.RECYCLER1)
                .setLanguage(Language.JAVA)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(true)
                .setShowLineNumber(true)
                .setStartLineNumber(1)
                .apply();
        codeViewitem=view.findViewById(R.id.code_view_item);
        codeViewitem.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DEFAULT)
                .setCode(Xmlcode.RECYCLER2)
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
