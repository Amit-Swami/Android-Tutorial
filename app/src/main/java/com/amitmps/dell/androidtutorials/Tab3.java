package com.amitmps.dell.androidtutorials;


import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab3 extends Fragment {
    private Tab3QuestionLibrary tab3QuestionLibrary=new Tab3QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonchoice1,mButtonchoice2,mButtonchoice3,mButtonchoice4,mButtonchoice5;

    private String mAnswers;
    private int mscore=0;
    private int mquestionnumber=0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tab3, container, false);
        mScoreView=view.findViewById(R.id.score);
        mQuestionView=view.findViewById(R.id.question);
        mButtonchoice1=view.findViewById(R.id.choice1);
        mButtonchoice2=view.findViewById(R.id.choice2);
        mButtonchoice3=view.findViewById(R.id.choice3);
        mButtonchoice4=view.findViewById(R.id.choice4);
        mButtonchoice5=view.findViewById(R.id.quit);

        updateQuestions();

        mButtonchoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mButtonchoice1.getText()==mAnswers) {
                    Toast.makeText(getActivity(), "correct!", Toast.LENGTH_SHORT).show();
                    mscore = mscore + 1;
                    updateScore(mscore);
                    if (mquestionnumber == Tab3QuestionLibrary.mquestions.length) {
                        Intent intent = new Intent(getContext(), Tab3FinalQuizScore.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("FinalScore", mscore);
                        intent.putExtras(bundle);
                        getActivity().finish();
                        startActivity(intent);
                    } else {
                        updateQuestions();
                    }
                }
                else{
                    Toast.makeText(getActivity(),"Wrong! Correct answer is "+mAnswers,Toast.LENGTH_LONG).show();
                    if (mquestionnumber == Tab3QuestionLibrary.mquestions.length) {
                        Intent intent = new Intent(getContext(), Tab3FinalQuizScore.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("FinalScore", mscore);
                        intent.putExtras(bundle);
                        getActivity().finish();
                        startActivity(intent);
                    } else {
                        updateQuestions();
                    }

                }
            }
        });
        mButtonchoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mButtonchoice2.getText()==mAnswers){
                    Toast.makeText(getActivity(), "correct!", Toast.LENGTH_SHORT).show();
                    mscore=mscore+1;
                    updateScore(mscore);
                    if (mquestionnumber == Tab3QuestionLibrary.mquestions.length) {
                        Intent intent = new Intent(getContext(), Tab3FinalQuizScore.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("FinalScore", mscore);
                        intent.putExtras(bundle);
                        getActivity().finish();
                        startActivity(intent);
                    } else {
                        updateQuestions();
                    }
                }
                else{
                    Toast.makeText(getActivity(),"Wrong! Correct answer is "+mAnswers,Toast.LENGTH_LONG).show();
                    if (mquestionnumber == Tab3QuestionLibrary.mquestions.length) {
                        Intent intent = new Intent(getContext(), Tab3FinalQuizScore.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("FinalScore", mscore);
                        intent.putExtras(bundle);
                        getActivity().finish();
                        startActivity(intent);
                    } else {
                        updateQuestions();
                    }

                }
            }

        });
        mButtonchoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mButtonchoice3.getText()==mAnswers){
                    Toast.makeText(getActivity(), "correct!", Toast.LENGTH_SHORT).show();
                    mscore=mscore+1;
                    updateScore(mscore);
                    if (mquestionnumber == Tab3QuestionLibrary.mquestions.length) {
                        Intent intent = new Intent(getContext(), Tab3FinalQuizScore.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("FinalScore", mscore);
                        intent.putExtras(bundle);
                        getActivity().finish();
                        startActivity(intent);
                    } else {
                        updateQuestions();
                    }
                }
                else{
                    Toast.makeText(getActivity(),"Wrong! Correct answer is "+mAnswers,Toast.LENGTH_LONG).show();
                    if (mquestionnumber == Tab3QuestionLibrary.mquestions.length) {
                        Intent intent = new Intent(getContext(), Tab3FinalQuizScore.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("FinalScore", mscore);
                        intent.putExtras(bundle);
                        getActivity().finish();
                        startActivity(intent);
                    } else {
                        updateQuestions();
                    }

                }
            }
        });
        mButtonchoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mButtonchoice4.getText()==mAnswers){
                    Toast.makeText(getActivity(), "correct!", Toast.LENGTH_SHORT).show();
                    mscore=mscore+1;
                    updateScore(mscore);
                    if (mquestionnumber == Tab3QuestionLibrary.mquestions.length) {
                        Intent intent = new Intent(getContext(), Tab3FinalQuizScore.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("FinalScore", mscore);
                        intent.putExtras(bundle);
                        getActivity().finish();
                        startActivity(intent);
                    } else {
                        updateQuestions();
                    }
                }
                else{
                    Toast.makeText(getActivity(),"Wrong! Correct answer is "+mAnswers,Toast.LENGTH_LONG).show();
                    if (mquestionnumber == Tab3QuestionLibrary.mquestions.length) {
                        Intent intent = new Intent(getContext(), Tab3FinalQuizScore.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("FinalScore", mscore);
                        intent.putExtras(bundle);
                        getActivity().finish();
                        startActivity(intent);
                    } else {
                        updateQuestions();
                    }

                }
            }
        });
        mButtonchoice5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    mQuestionView.setText(tab3QuestionLibrary.getQuestions(mquestionnumber));
                    mQuestionView.setText(tab3QuestionLibrary.getQuestions(mquestionnumber));
                    mButtonchoice1.setText(tab3QuestionLibrary.getChoice1(mquestionnumber));
                    mButtonchoice2.setText(tab3QuestionLibrary.getChoice2(mquestionnumber));
                    mButtonchoice3.setText(tab3QuestionLibrary.getChoice3(mquestionnumber));
                    mButtonchoice4.setText(tab3QuestionLibrary.getChoice4(mquestionnumber));

                    mAnswers = tab3QuestionLibrary.getCorrectAnswer(mquestionnumber);
                    mquestionnumber++;
                if (mquestionnumber == Tab3QuestionLibrary.mquestions.length) {
                    Intent intent = new Intent(getContext(), Tab3FinalQuizScore.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore", mscore);
                    intent.putExtras(bundle);
                    getActivity().finish();
                    startActivity(intent);
                } else {
                    updateQuestions();
                }

                }
        });
        return view;
    }

    private void updateQuestions() {
        mQuestionView.setText(tab3QuestionLibrary.getQuestions(mquestionnumber));
        mButtonchoice1.setText(tab3QuestionLibrary.getChoice1(mquestionnumber));
        mButtonchoice2.setText(tab3QuestionLibrary.getChoice2(mquestionnumber));
        mButtonchoice3.setText(tab3QuestionLibrary.getChoice3(mquestionnumber));
        mButtonchoice4.setText(tab3QuestionLibrary.getChoice4(mquestionnumber));

        mAnswers = tab3QuestionLibrary.getCorrectAnswer(mquestionnumber);
        mquestionnumber++;

    }

    private void updateScore(int point){
        mScoreView.setText(""+mscore);
    }

}
