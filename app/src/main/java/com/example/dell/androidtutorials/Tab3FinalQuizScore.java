package com.example.dell.androidtutorials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Tab3FinalQuizScore extends AppCompatActivity {
 TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3_final_quiz_score);
        tv1=findViewById(R.id.tab3fqstv1);
        tv2=findViewById(R.id.tab3fqstv2);

        Bundle bundle=getIntent().getExtras();
        int score=bundle.getInt("FinalScore");

        tv2.setText("Your score " + score + " out of " + Tab3QuestionLibrary.mquestions.length);
    }
}
