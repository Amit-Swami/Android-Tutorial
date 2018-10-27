package com.example.dell.androidtutorials;


import android.content.Context;
import android.opengl.Matrix;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.ZoomControls;


/**
 * A simple {@link Fragment} subclass.
 */
public class List1Tab1 extends Fragment {
  //  private float mScale = 1f;
    //private ScaleGestureDetector mScaleDetectore;
    //GestureDetector gestureDetector;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list1_tab1, container, false);
       // gestureDetector = new GestureDetector(getContext(), new GestureListener());
        return view;
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
