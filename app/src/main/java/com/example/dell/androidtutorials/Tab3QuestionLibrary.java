package com.example.dell.androidtutorials;

public class Tab3QuestionLibrary {

    public static String mquestions[]={
            "What build in DataBase is Android shipped with?",
            "What is DDMS in Android?",
            "The root element of AndroidManifest.xml file is:",
            "On which Thread Services work in Android?",
            "How to kill an Activity in Android?",
            "_______sets the gravity of the content of the View its used on.",
            "Who was not among the founders of Android?",
            "Who designed Android Logo?",
            "Which permissions are required to get a location in android? ",
            "What is the time limit of Broadcast receiver in Android?"

    };

    public static String mchoices[][]={
            {"MySql","Oracle","SQlite","Apache"},
            {"Dalvik Memory Server","Distributed Denial Memory Server","Dalvik Debug Monitor Server","Dalvik Debug Monitor Services"},
            {"Activity","Manifest","Action","Application"},
            {"Own Thread","Worker Thread","Background Thread","Main Thread"},
            {"kill()","finish()","stop()","pause()"},
            {"android:gravity","android:layout_gravity","android:weight","android:orientation"},
            {"Andy Rubin","Larry Page","Rich Miner","Nick Sears"},
            {"Andy Rubin","Larry Page","Irina Blok","Sundar Pichai"},
            {"ACCESS_FINE and ACCESS_COARSE","Internet permission","WIFI permission","GPRS permission"},
            {"15sec","5sec","1hour","10sec"}
    };

    public static String mCorrectAnswers[]={"SQlite","Dalvik Debug Monitor Server","Manifest","Main Thread","finish()","android:gravity","Larry Page","Irina Blok","ACCESS_FINE and ACCESS_COARSE","10sec"};

    public String getQuestions(int a){
        String question=mquestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0=mchoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1=mchoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2=mchoices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3=mchoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswers[a];
        return answer;
    }

}
