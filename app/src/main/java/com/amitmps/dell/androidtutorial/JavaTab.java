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

import com.amitmps.dell.androidtutorial.Common.Javacode;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class JavaTab extends Fragment implements CodeView.OnHighlightListener {
  //  private float mScale = 1f;
    //private ScaleGestureDetector mScaleDetectore;
    //GestureDetector gestureDetector;

    AdView mAdView;
    CodeView codeView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_java_tab, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView = view.findViewById(R.id.adView25);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        // gestureDetector = new GestureDetector(getContext(), new GestureListener());
        // train classifier on app start

        codeView = view.findViewById(R.id.code_view);

        loadJavaPrograms();


        return view;
    }

    private void loadJavaPrograms() {
        String code = null;
        switch (getActivity().getIntent().getStringExtra("Position")){
            case "Hello World":
                code=Javacode.HLO_WORLD;
                break;
            case "Explicit Intent":
                startActivity(new Intent(getContext(),List2.class));
                break;
            case "Implicit Intent":
                code=Javacode.IMPLICIT;
                break;
            case "Fragments":
                startActivity(new Intent(getContext(),List4.class));
                break;
            case "Spinner":
                startActivity(new Intent(getContext(),List5.class));
                break;
            case "Multiple Choice":
                code=Javacode.MULTIPLECHOICE;
                break;
            case "Splash Screen":
                startActivity(new Intent(getContext(),List7.class));
                break;
            case "Async Task":
                startActivity(new Intent(getContext(),List8.class));
                break;
            case "Date&Time Picker":
                code=Javacode.DATETIME;
                break;
            case "Notification":
                code=Javacode.NOTIFICATION;
                break;
            case "Alarm":
                startActivity(new Intent(getContext(),List11.class));
                break;
            case "Vibration":
                startActivity(new Intent(getContext(),List12.class));
                break;
            case "ListView":
                code=Javacode.LISTVIEW;
                break;
            case "GridView":
                code=Javacode.GRIDVIEW;
                break;
            case "RecyclerView":
                startActivity(new Intent(getContext(),List15.class));
                break;
            case "Text To Speech":
                code=Javacode.TEXTTOSPEECH;
                break;
            case "Speech To Text":
                code=Javacode.SPEECHTOTEXT;
                break;
            case "Sensor":
                code=Javacode.SENSOR;
                break;
            case "Json":
                code=Javacode.JSONPARSE;
                break;
            case "Alert Dialogbox":
                code=Javacode.ALERTDIALOGBOX;
                break;
            case "Navigation Drawer":
                startActivity(new Intent(getContext(),List21.class));
                break;
            case "Database":
                startActivity(new Intent(getContext(),List22.class));
                break;
            case "Firebase":
                startActivity(new Intent(getContext(),List23.class));
                break;

        }
        if (code == null) {
            getActivity().finish();
        }
        else
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

  /*  public class ZoomScroll extends ScrollView {
        public ZoomScroll(Context context) {
            super(context);
        }

        public ZoomScroll(Context context, AttributeSet attrs) {
            super(context, attrs);
            mScaleDetectore = new ScaleGestureDetector(getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener() {
                @Override
                public boolean onScale(ScaleGestureDetector detector) {
                    float scale = 1 - detector.getScaleFactor();

                    float prevScale = mScale;
                    mScale += scale;


                    if (mScale < 0.1f)
                        mScale = 0.1f;

                    if (mScale > 10f)
                        mScale = 10f;

                    ScaleAnimation scaleAnimation = new ScaleAnimation(1f / prevScale, 1f / mScale, 1f / prevScale, 1f / mScale, detector.getFocusX(), detector.getFocusY());
                    scaleAnimation.setDuration(0);
                    scaleAnimation.setFillAfter(true);
                    getRootView().findViewById(R.id.sv1).startAnimation(scaleAnimation);
                    return true;
                }
            });
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent ev) {
            super.dispatchTouchEvent(ev);
            mScaleDetectore.onTouchEvent(ev);
            gestureDetector.onTouchEvent(ev);
            return gestureDetector.onTouchEvent(ev);
        }

    }


    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            return true;
        }
    }
}*/
