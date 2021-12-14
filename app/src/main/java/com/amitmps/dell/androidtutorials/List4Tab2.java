    package com.amitmps.dell.androidtutorials;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.amitmps.dell.androidtutorials.Common.Xmlcode;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


    /**
 * A simple {@link Fragment} subclass.
 */
public class List4Tab2 extends Fragment implements CodeView.OnHighlightListener {

    AdView mAdView;
    CodeView codeViewfrag1,codeViewfrag2;
    TextView textViewfrag;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list4_tab2, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView = view.findViewById(R.id.adView30);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textViewfrag=view.findViewById(R.id.tvfrag);
        textViewfrag.setText("\u2022 Now create 3 blank fragment activities and put the images in the drawable folder(app > res > drawable)" +
                "which you want to display on the click of button.\n\u2022 At the end write the image view inside each 3 fragment.xml and leave the Fragment.java file as it is.");


        codeViewfrag1=view.findViewById(R.id.code_view_frag1);
        codeViewfrag2=view.findViewById(R.id.code_view_frag2);

        codeViewfrag1.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DEFAULT)
                .setCode(Xmlcode.FRAGMENT1)
                .setLanguage(Language.JAVA)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(true)
                .setShowLineNumber(true)
                .setStartLineNumber(1)
                .apply();

        codeViewfrag2.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DEFAULT)
                .setCode(Xmlcode.FRAGMENT2)
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
