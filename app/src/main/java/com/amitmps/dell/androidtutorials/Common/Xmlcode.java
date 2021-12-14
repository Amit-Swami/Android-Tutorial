package com.amitmps.dell.androidtutorials.Common;

public class Xmlcode {

    public static final String HLO_WORLD="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +

            "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
            "   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n"+
            "   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
            "   android:layout_width=\"match_parent\"\n"+
            "   android:layout_height=\"match_parent\"\n"+
            "   tools:context=\".MainActivity\">\n"+
            "\n"+
           "        <TextView\n"+
            "           android:id=\"@+id/tv\"\n"+
            "           android:layout_width=\"wrap_content\"\n"+
            "           android:layout_height=\"wrap_content\"\n"+
            "           android:layout_centerInParent=\"true\"\n"+
            "           android:text=\"Hello World!\" />\n"+
            "\n"+
            "</RelativeLayout>";

    public static final String EXPLICIT1="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   android:background=\"#ff0000\">\n"+
"   tools:context=\".MainActivity\"\n"+
"\n"+
"   <TextView\n"+
"       android:id=\"@+id/explicittextView\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"54dp\"\n"+
"       android:gravity=\"center\"\n"+
"       android:text=\"Activity 1\"\n"+
"       android:textColor=\"#ffffff\"\n"+
"       android:textSize=\"30dp\" />\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/explixitb1\"\n"+
"       android:layout_width=\"204dp\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"116dp\"\n"+
"       android:text=\"Go to Activity 2\" />\n"+
"\n"+
"</RelativeLayout>";

    public static final String EXPLICIT2="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".Explicit\"\n"+
"   android:background=\"#a4c\">\n"+
"\n"+
"   <TextView\n"+
"       android:id=\"@+id/explicittextView2\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"54dp\"\n"+
"       android:gravity=\"center\"\n"+
"       android:text=\"Activity 2\"\n"+
"       android:textColor=\"#ffffff\"\n"+
"       android:textSize=\"30dp\" />\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/explicitb2\"\n"+
"       android:layout_width=\"204dp\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"116dp\"\n"+
"       android:text=\"Go to Activity 1\" />\n"+
"\n"+
"</RelativeLayout>";

    public static final String IMPLICIT="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
    "   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n"+
    "   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
    "   android:layout_width=\"match_parent\"\n"+
    "   android:layout_height=\"match_parent\"\n"+
    "   tools:context=\".MainActivity\"\n"+
    "   android:orientation=\"vertical\">\n"+
    "\n"+
    "       <Button\n"+
        "       android:id=\"@+id/camera\"\n"+
        "       android:layout_width=\"match_parent\"\n"+
        "       android:layout_height=\"wrap_content\"\n"+
        "       android:text=\"Camera\"/>\n"+
    "\n"+
    "       <Button\n"+
        "       android:id=\"@+id/wifi\"\n"+
        "       android:layout_width=\"match_parent\"\n"+
        "       android:layout_height=\"wrap_content\"\n"+
        "       android:layout_marginTop=\"30dp\"\n"+
        "       android:text=\"WiFi\" />\n"+
    "\n"+
    "       <Button\n"+
        "       android:id=\"@+id/dialer\"\n"+
        "       android:layout_width=\"match_parent\"\n"+
        "       android:layout_height=\"wrap_content\"\n"+
        "       android:layout_marginTop=\"30dp\"\n"+
        "       android:text=\"Dialer\"/>\n"+
    "\n"+
    "       <Button\n"+
        "       android:id=\"@+id/bluetooth\"\n"+
        "       android:layout_width=\"match_parent\"\n"+
        "       android:layout_height=\"wrap_content\"\n"+
        "       android:layout_marginTop=\"30dp\"\n"+
        "       android:text=\"Bluetooth\"/>\n"+
    "\n"+
    "       <Button\n"+
        "       android:id=\"@+id/display\"\n"+
        "       android:layout_width=\"match_parent\"\n"+
        "       android:layout_height=\"wrap_content\"\n"+
        "       android:layout_marginTop=\"30dp\"\n"+
        "       android:text=\"Display\"/>\n"+
    "\n"+
    "       <Button\n"+
        "       android:id=\"@+id/date\"\n"+
        "       android:layout_width=\"match_parent\"\n"+
        "       android:layout_height=\"wrap_content\"\n"+
        "       android:layout_marginTop=\"30dp\"\n"+
        "       android:text=\"Date\"/>\n"+
    "\n"+

    "       <Button\n"+
        "       android:id=\"@+id/gmail\"\n"+
        "       android:layout_width=\"match_parent\"\n"+
        "       android:layout_height=\"wrap_content\"\n"+
        "       android:layout_marginTop=\"30dp\"\n"+
        "       android:text=\"Gmail\"/>\n"+
     "\n"+

"</LinearLayout>";

    public static final String FRAGMENT1="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
    "   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
    "   android:layout_width=\"match_parent\"\n"+
    "   android:layout_height=\"match_parent\"\n"+
    "   tools:context=\".MainActivity\"\n"+
    "   android:orientation=\"vertical\">\n"+
            "\n"+
    "       <Button\n"+
    "           android:id=\"@+id/btn1\"\n"+
    "           android:layout_width=\"wrap_content\"\n"+
    "           android:layout_height=\"wrap_content\"\n"+
    "           android:text=\"B1\"\n"+
    "           tools:layout_editor_absoluteX=\"16dp\"\n"+
    "           tools:layout_editor_absoluteY=\"16dp\" />\n"+
"\n"+
    "       <Button\n"+
    "           android:id=\"@+id/btn2\"\n"+
    "           android:layout_width=\"wrap_content\"\n"+
    "           android:layout_height=\"wrap_content\"\n"+
    "           android:text=\"B2\"\n"+
    "           tools:layout_editor_absoluteX=\"142dp\"\n"+
    "           tools:layout_editor_absoluteY=\"16dp\" />\n"+
"\n"+
    "       <Button\n"+
    "           android:id=\"@+id/btn3\"\n"+
    "           android:layout_width=\"wrap_content\"\n"+
    "           android:layout_height=\"wrap_content\"\n"+
    "           android:text=\"B3\"\n"+
    "           tools:layout_editor_absoluteX=\"270dp\"\n"+
    "           tools:layout_editor_absoluteY=\"16dp\" />\n"+
            "\n"+
    "       <FrameLayout\n"+
    "           android:layout_width=\"wrap_content\"\n"+
    "           android:layout_height=\"wrap_content\"\n"+
    "           android:id=\"@+id/framelayout\">\n"+
    "       </FrameLayout>\n"+
    "\n"+
"</LinearLayout>";

    public static final String FRAGMENT2="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
    "       xmlns:tools=\"http://schemas.android.com/tools\"\n"+
    "       android:layout_width=\"match_parent\"\n"+
    "       android:layout_height=\"match_parent\"\n"+
    "       tools:context=\".first\">\n"+
"\n"+
    "       <ImageView\n"+
    "            android:layout_width=\"wrap_content\"\n"+
    "            android:layout_height=\"wrap_content\"\n"+
    "            android:layout_alignParentStart=\"true\"\n"+
    "            android:layout_alignParentTop=\"true\"\n"+
    "            android:layout_gravity=\"center\"\n"+
    "            android:background=\"@drawable/rock\"\n"+
    "            android:layout_alignParentLeft=\"true\" />\n"+
"\n"+
"</RelativeLayout>";

    public static final String SPINNER1="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
    "   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
    "   android:layout_width=\"match_parent\"\n"+
    "   android:layout_height=\"match_parent\"\n"+
    "   tools:context=\".MainActivity\">\n"+
"\n"+
    "   <TextView\n"+
    "       android:id=\"@+id/textView\"\n"+
    "       android:layout_width=\"129dp\"\n"+
    "       android:layout_height=\"36dp\"\n"+
    "       android:layout_alignParentLeft=\"true\"\n"+
    "       android:layout_alignParentStart=\"true\"\n"+
    "       android:layout_alignParentTop=\"true\"\n"+
    "       android:layout_marginTop=\"0dp\"\n"+
    "       android:text=\"Select Planet\"\n"+
    "       android:textSize=\"20dp\" />\n"+
"\n"+
    "   <Spinner\n"+
    "       android:id=\"@+id/spinner\"\n"+
    "       android:layout_width=\"255dp\"\n"+
    "       android:layout_height=\"36dp\"\n"+
    "       android:layout_alignParentEnd=\"true\"\n"+
    "       android:layout_alignParentRight=\"true\">\n"+
    "   </Spinner>\n"+
"\n"+
"</RelativeLayout>";

    public static final String SPINNER2="<resources>\n"+
"\n"+
"   <string-array name=\"planet_name\">\n"+
"       <item>Mercury</item>\n"+
"       <item>Venus</item>\n"+
"       <item>Earth</item>\n"+
"       <item>Mars</item>\n"+
"       <item>Jupiter</item>\n"+
"       <item>Saturn</item>\n"+
"       <item>Neptune</item>\n"+
"   </string-array>\n"+
"\n"+
"</resources>";

    public static final String MULTIPLECHOICE = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/btn\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"130dp\"\n"+
"       android:text=\"Click to Select\"\n"+
"       />\n"+
"\n"+
"   <TextView\n"+
"       android:id=\"@+id/tv\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       />\n"+
"\n"+
"</RelativeLayout>";


    public static final String SPLASH1 ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".Splash\"\n"+
"   android:orientation=\"vertical\">\n"+
"\n"+
"   <ImageView\n"+
"       android:layout_width=\"70dp\"\n"+
"       android:layout_height=\"70dp\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"44dp\"\n"+
"       android:background=\"@drawable/ic_android\"/>\n"+
"\n"+
"   <ProgressBar\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"134dp\" />\n"+
"\n"+
"</RelativeLayout>";


    public static final String SPLASH2 ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <TextView\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"154dp\"\n"+
"       android:text=\"Welcome to Main Screen\"\n"+
"       android:textColor=\"@color/colorAccent\"\n"+
"       android:textSize=\"30dp\" />\n"+
"\n"+
"</RelativeLayout>";

    public static final String ASYNCTASK = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/btn\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentStart=\"true\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_marginStart=\"137dp\"\n"+
"       android:layout_marginTop=\"114dp\"\n"+
"       android:text=\"Button\"\n"+
"       android:layout_alignParentLeft=\"true\"\n"+
"       android:layout_marginLeft=\"137dp\" />\n"+
"\n"+
"   <TextView\n"+
"       android:id=\"@+id/textView\"\n"+
"       android:layout_width=\"98dp\"\n"+
"       android:layout_height=\"43dp\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_alignStart=\"@+id/btn\"\n"+
"       android:layout_marginTop=\"66dp\"\n"+
"       android:text=\"Click here\"\n"+
"       android:textSize=\"20dp\"\n"+
"       android:layout_alignLeft=\"@+id/btn\" />\n"+
"\n"+
"</RelativeLayout>";

    public static final String DATETIME = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <TextView\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"168dp\"\n"+
"       android:text=\"Click Below\"\n"+
"       android:textColor=\"#000000\"\n"+
"       android:textSize=\"20dp\" />\n"+
"\n"+
"   <TextView\n"+
"       android:id=\"@+id/textView\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"235dp\"\n"+
"       app:layout_constraintBottom_toBottomOf=\"parent\"\n"+
"       app:layout_constraintLeft_toLeftOf=\"parent\"\n"+
"       app:layout_constraintRight_toRightOf=\"parent\"\n"+
"       app:layout_constraintTop_toTopOf=\"parent\" />\n"+
"\n"+
"</RelativeLayout>";

    public static final String NOTIFICATION ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/btn\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:text=\"Get Notification\"\n"+
"       android:textSize=\"20sp\"\n"+
"       android:gravity=\"center\"/>\n"+
"\n"+
"</LinearLayout>";

    public static final String ALARM1 ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <EditText\n"+
"       android:id=\"@+id/edtText\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"85dp\"\n"+
"       android:hint=\"Number of seconds\" />\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/btn\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"156dp\"\n"+
"       android:text=\"Set Alarm\"\n"+
"       tools:layout_editor_absoluteX=\"137dp\"\n"+
"       tools:layout_editor_absoluteY=\"142dp\" />\n"+
"\n"+
"</RelativeLayout>";

    public static final String ALARM2 ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   package com.amitmps.dell.androidtutorial>\n"+
"\n"+
"   <application\n"+
"       android:allowBackup=\"true\"\n"+
"       android:icon=\"@mipmap/ic_launcher\"\n"+
"       android:label=\"Alarm\"\n"+
"       android:roundIcon=\"@mipmap/ic_launcher_round\"\n"+
"       android:supportsRtl=\"true\"\n"+
"       android:theme=\"@style/Theme.AtVersion2\">\n"+
"       <activity android:name=\".Example\"></activity>\n"+
"       <activity android:name=\".MainActivity\">\n"+
"           <intent-filter>\n"+
"               <action android:name=\"android.intent.action.MAIN\" />\n"+
"\n"+
"               <category android:name=\"android.intent.category.LAUNCHER\" />\n"+
"           </intent-filter>\n"+
"       </activity>\n"+
"       <receiver android:name=\".Receiver\"></receiver>\n"+
"   </application>\n"+
"\n"+
"</manifest>";

    public static final String VIBRATION1 ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/btn\"\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentStart=\"true\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_marginTop=\"52dp\"\n"+
"       android:text=\"Vibrate\"\n"+
"       android:layout_alignParentLeft=\"true\" />\n"+
"\n"+
"</RelativeLayout>";

    public static final String VIBRATION2 ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   package=\"com.example.atversion2\">\n"+
"\n"+
"   <application\n"+
"       android:allowBackup=\"true\"\n"+
"       android:icon=\"@mipmap/ic_launcher\"\n"+
"       android:label=\"Vibration\"\n"+
"       android:roundIcon=\"@mipmap/ic_launcher_round\"\n"+
"       android:supportsRtl=\"true\"\n"+
"       android:theme=\"@style/Theme.AtVersion2\">\n"+
"       <activity android:name=\".Example\"></activity>\n"+
"       <activity android:name=\".MainActivity\">\n"+
"           <intent-filter>\n"+
"               <action android:name=\"android.intent.action.MAIN\" />\n"+
"\n"+
"               <category android:name=\"android.intent.category.LAUNCHER\" />\n"+
"           </intent-filter>\n"+
"       </activity>\n"+
"       <service android:name=\".Vibrate\"></service>\n"+
"   </application>\n"+
"\n"+
"</manifest>";

    public static final String LISTVIEW ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <ListView\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"match_parent\"\n"+
"       android:id=\"@+id/list13lv\"\n"+
"       android:padding=\"10dp\">\n"+
"   </ListView>\n"+
"\n"+
"</LinearLayout>";

    public static final String GRIDVIEW ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <GridView\n"+
"       android:id=\"@+id/gridView\"\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"match_parent\"\n"+
"       android:numColumns=\"2\"\n"+
"       android:stretchMode=\"columnWidth\"\n"+
"       android:columnWidth=\"100dp\"\n"+
"       android:padding=\"10dp\">\n"+
"   </GridView>\n"+
"\n"+
"</LinearLayout>";

    public static final String RECYCLER1 ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".List15Tab2\">\n"+
"\n"+
"   <androidx.recyclerview.widget.RecyclerView\n"+
"       android:id=\"@+id/recyclerView\"\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"match_parent\">\n"+
"   </androidx.recyclerview.widget.RecyclerView>\n"+
"\n"+
"</RelativeLayout>";

    public static final String RECYCLER2 ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout\n"+
"xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"wrap_content\">\n"+
"\n"+
"   <androidx.cardview.widget.CardView\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\">\n"+
"\n"+
"       <RelativeLayout\n"+
"           android:layout_width=\"match_parent\"\n"+
"           android:layout_height=\"wrap_content\">\n"+
"\n"+
"           <TextView\n"+
"               android:id=\"@+id/title\"\n"+
"               android:layout_width=\"match_parent\"\n"+
"               android:layout_height=\"wrap_content\"\n"+
"               android:text=\"Title\"\n"+
"               android:textAppearance=\"@style/Base.TextAppearance.AppCompat.Large\"/>\n"+
"\n"+
"           <TextView\n"+
"               android:id=\"@+id/descript\"\n"+
"               android:layout_width=\"match_parent\"\n"+
"               android:layout_height=\"wrap_content\"\n"+
"               android:text=\"Description\"\n"+
"               android:textAppearance=\"@style/Base.TextAppearance.AppCompat.Small\"\n"+
"               android:layout_below=\"@+id/list15t1\"/>\n"+
"\n"+
"       </RelativeLayout>\n"+
"\n"+
"   </androidx.cardview.widget.CardView>\n"+
"\n"+
"</RelativeLayout>";

    public static final String TEXTTOSPEECH ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".List16Tab2\">\n"+
"\n"+
"   <EditText\n"+
"       android:id=\"@+id/edt\"\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentStart=\"true\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_marginTop=\"75dp\"\n"+
"       android:hint=\"Enter Your Text\"\n"+
"       android:layout_alignParentLeft=\"true\"/>\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/btn1\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"154dp\"\n"+
"       android:text=\"SPEAK\" />\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/btn2\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"211dp\"\n"+
"       android:text=\"STOP\" />\n"+
"\n"+
"</RelativeLayout>";

    public static final String SPEECHTOTEXT ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <TextView\n"+
"       android:id=\"@+id/tv\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:textSize=\"15dp\"/>\n"+
"\n"+
"   <ImageButton\n"+
"       android:id=\"@+id/imgBtn\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"81dp\"\n"+
"       android:src=\"@drawable/mic\" />\n"+
"\n"+
"</RelativeLayout>";

    public static final String SENSOR ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <TextView\n"+
"       android:id=\"@+id/textView\"\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"match_parent\"\n"+
"       android:textSize=\"250dp\"\n"+
"       android:text=\"\"\n"+
"       android:gravity=\"center\"/>\n"+
"\n"+
"</LinearLayout>";

    public static final String JSONPARSE ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   android:orientation=\"vertical\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/btn\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:text=\"Parse Json Sring\"/>\n"+
"\n"+
"   <TextView\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:id=\"@+id/tv\"\n"+
"       android:text=\"\"/>\n"+
"\n"+
"</LinearLayout>";

    public static final String ALERTDIALOGBOX ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout android:layout_height=\"match_parent\"\n"+
"   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   android:layout_width=\"match_parent\">\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/btn\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentTop=\"true\"\n"+
"       android:layout_centerHorizontal=\"true\"\n"+
"       android:layout_marginTop=\"34dp\"\n"+
"       android:text=\"Click\" />\n"+
"\n"+
"</RelativeLayout>";

    public static final String NAVIGATION1="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<androidx.drawerlayout.widget.DrawerLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:id=\"@+id/drawerlayout\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n"+
"   tools:context=\".MainActivity\">\n"+
            "\n"+
"   <RelativeLayout\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\">\n"+
"       <include layout=\"@layout/navigation_action\"\n"+
"           android:layout_width=\"match_parent\"\n"+
"           android:layout_height=\"wrap_content\"/>\n"+
"       <TextView\n"+
"           android:layout_width=\"wrap_content\"\n"+
"           android:layout_height=\"wrap_content\"\n"+
"           android:layout_alignParentTop=\"true\"\n"+
"           android:layout_centerHorizontal=\"true\"\n"+
"           android:layout_marginTop=\"100dp\"\n"+
"           android:text=\"This is Navigation Drawer\"\n"+
"           android:textStyle=\"italic\"\n"+
"           android:textColor=\"#000000\"\n"+
"           android:textSize=\"30dp\"/>\n"+
"   </RelativeLayout>\n"+
            "\n"+
"   <com.google.android.material.navigation.NavigationView\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"match_parent\"\n"+
"       android:id=\"@+id/navView\"\n"+
"       app:headerLayout=\"@layout/navigation_header\"\n"+
"       app:menu=\"@menu/navigation_menu\"\n"+
"       android:layout_gravity=\"start\">\n"+
"   </com.google.android.material.navigation.NavigationView>\n"+
"\n"+
"</androidx.drawerlayout.widget.DrawerLayout>";

    public static final String NAVIGATION2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n"+
"   <group android:checkableBehavior=\"single\">\n"+
"       <item\n"+
"           android:title=\"Item 1\"\n"+
"           android:id=\"@+id/item1\"\n"+
"           android:icon=\"@drawable/ic_android_black_24dp\"/>\n"+
"       <item\n"+
"           android:title=\"Item 2\"\n"+
"           android:id=\"@+id/item2\"\n"+
"           android:icon=\"@drawable/ic_announcement_black_24dp\"/>\n"+
"       <item\n"+
"           android:title=\"Item 3\"\n"+
"           android:id=\"@+id/item3\"\n"+
"           android:icon=\"@drawable/ic_mode_edit_black_24dp\"/>\n"+
"   </group>\n"+
"   <item android:title=\"section 2\">\n"+
"       <menu>\n"+
"           <item android:title=\"Item 4\"\n"+
"               android:id=\"@+id/item4\"\n"+
"               android:icon=\"@drawable/ic_screen_share_black_24dp\"/>\n"+
"       </menu>\n"+
"   </item>\n"+
"   <item android:title=\"section 3\">\n"+
"       <menu>\n"+
"           <item\n"+
"               android:title=\"Item 5\"\n"+
"               android:id=\"@+id/item5\"\n"+
"               android:icon=\"@drawable/ic_error_outline_black_24dp\"/>\n"+
"       </menu>\n"+
"   </item>\n"+
"\n"+
"</menu>";

public static final String NAVIGATION3 ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<menu xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:app=\"http://schemas.android.com/apk/res-auto\">\n"+
"   <item\n"+
"       android:id=\"@+id/item6\"\n"+
"       android:title=\"Item 6\"\n"+
"       android:orderInCategory=\"100\"\n"+
"       app:showAsAction=\"never\">\n"+
"\n"+
"   </item>\n"+
"</menu>";

    public static final String NAVIGATION4 ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<RelativeLayout\n"+
"   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"140dp\"\n"+
"   android:orientation=\"vertical\"\n"+
"   android:background=\"@drawable/atnew1\"\n"+
"   android:minHeight=\"?attr/actionBarSize\"\n"+
"   android:theme=\"@style/Base.ThemeOverlay.AppCompat.Dark\">\n"+
"\n"+
"   <TextView\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentBottom=\"true\"\n"+
"       android:layout_alignParentStart=\"true\"\n"+
"       android:layout_marginBottom=\"27dp\"\n"+
"       android:text=\"Learn &amp; Explore\"\n"+
"       android:textColor=\"#ffffff\"\n"+
"       android:textStyle=\"italic\"\n"+
"       android:layout_alignParentLeft=\"true\" />\n"+

"   <TextView\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_alignParentBottom=\"true\"\n"+
"       android:layout_alignParentStart=\"true\"\n"+
"       android:text=\"xyz@gmail.com\"\n"+
"       android:layout_alignParentLeft=\"true\" />\n"+
"\n"+
"</RelativeLayout>";

    public static final String NAVIGATION5 ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<androidx.appcompat.widget.Toolbar\n"+
"   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"wrap_content\"\n"+
"   android:id=\"@+id/toolbar\"\n"+
"   android:background=\"#ffd700\">\n"+
"\n"+
"</androidx.appcompat.widget.Toolbar>";

    public static final String NAVIGATION6 ="<resources>\n"+
"   <string name=\"app_name\">MyNavigationDrawer</string>\n"+
"   <string name=\"open\">Open</string>\n"+
"   <string name=\"close\">Close</string>\n"+
"<resources>";

    public static final String DATABASE1="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   android:orientation=\"vertical\"\n"+
"   tools:context=\".MainActivity\">\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/buttonSignIn\"\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:text=\"Sign In\"/>\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/buttonSignUp\"\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:text=\"Sign Up\" />\n"+
"\n"+
"</LinearLayout>";

    public static final String DATABASE2="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   android:orientation=\"vertical\"\n"+
"   tools:context=\"LogedData\">\n"+
"\n"+
"   <TextView\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:id=\"@+id/username\"\n"+
"       android:textColor=\"#000000\"/>\n"+
"\n"+
"   <TextView\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:id=\"@+id/password\"\n"+
"       android:textColor=\"#000000\"/>\n"+
"\n"+
"</LinearLayout>";

    public static final String DATABASE3="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   android:orientation=\"vertical\"\n"+
"   tools:context=\".SignUp\">\n"+
"\n"+
"   <EditText\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:id=\"@+id/editTextUserName\"\n"+
"       android:hint=\"USER NAME\"/>\n"+
"\n"+
"   <EditText\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:id=\"@+id/editTextPassword\"\n"+
"       android:hint=\"PASSWORD\"\n"+
"       android:inputType=\"textPassword\"/>\n"+
"\n"+
"   <EditText\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:id=\"@+id/editTextConfirmPassword\"\n"+
"       android:hint=\"CONFIRM PASSWORD\"\n"+
"       android:inputType=\"textPassword\"/>\n"+
"\n"+
"   <Button\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:text=\"CREATE ACCOUNT\"\n"+
"       android:id=\"@+id/buttonCreateAccount\"/>\n"+
"\n"+
"</LinearLayout>";

    public static final String DATABASE4="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout\n"+
"   xmlns:android=\"http://schemas.android.com/apk/res/android\" " +
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   android:orientation=\"vertical\">\n"+
"\n"+
"   <EditText\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:id=\"@+id/editTextUserNameToLogin\"\n"+
"       android:hint=\"User Name\"/>\n"+
"\n"+
"   <EditText\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:id=\"@+id/editTextPasswordToLogin\"\n"+
"       android:inputType=\"textPassword\"\n"+
"       android:hint=\"Password\"/>\n"+
"\n"+
"   <Button\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:id=\"@+id/loginbuttonSignIn\"\n"+
"       android:hint=\"SignIn\"/>\n"+
"\n"+
"</LinearLayout>";

    public static final String FIREBASE1="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".MainActivity\"\n"+
"   android:orientation=\"vertical\">\n"+
"\n"+
"   <TextView\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_gravity=\"center_horizontal\"\n"+
"       android:layout_marginTop=\"35dp\"\n"+
"       android:text=\"User Registration\"\n"+
"       android:textStyle=\"bold\"\n"+
"       android:id=\"@+id/tv\"/>\n"+
"\n"+
"   <EditText\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:id=\"@+id/editTextEmail\"\n"+
"       android:layout_margin=\"15dp\"\n"+
"       android:hint=\"Enter Email\"\n"+
"       android:inputType=\"textPassword\"/>\n"+
"\n"+
"   <EditText\n"+
"       android:layout_width=\"match_parent\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:id=\"@+id/editTextPassword\"\n"+
"       android:layout_margin=\"15dp\"\n"+
"       android:hint=\"Enter Password\"\n"+
"       android:inputType=\"textPassword\"/>\n"+
"\n"+
"   <Button\n"+
"       android:id=\"@+id/bt1\"\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_margin=\"15dp\"\n"+
"       android:text=\"Sign Up\"\n"+
"       android:layout_gravity=\"center\"/>\n"+
"\n"+
"   <TextView\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_gravity=\"center\"\n"+
"       android:text=\"Alerady have an Account?Sign In here\"\n"+
"       android:textSize=\"15dp\"\n"+
"       android:id=\"@+id/tv_SignIn\"\n"+
"       android:textColor=\"@android:color/black\"/>\n"+
"\n"+
"</LinearLayout>";

    public static final String FIREBASE2="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".Login\"\n"+
"   android:orientation=\"vertical\">\n"+
"\n"+
"   <TextView\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_gravity=\"center_horizontal\"\n"+
"       android:textStyle=\"bold\"\n"+
"       android:textSize=\"30dp\"\n"+
"       android:text=\"User login\"\n"+
"       android:id=\"@+id/tv_userlogin\"\n"+
"       android:fontFamily=\"serif\"/>\n"+
"\n"+
"   <EditText\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:hint=\"Enter Email\"\n"+
"       android:layout_margin=\"15dp\"\n"+
"       android:id=\"@+id/ed_Email\"/>\n"+
"\n"+
"   <EditText\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:hint=\"Enter Password\"\n"+
"       android:id=\"@+id/ed_Password\"\n"+
"       android:layout_margin=\"15dp\"/>\n"+
"\n"+
"   <Button\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:text=\"Sign In\"\n"+
"       android:id=\"@+id/btnSignIn\"\n"+
"       android:layout_gravity=\"center\"/>\n"+
"\n"+
"   <TextView\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:text=\"Not have account?SignUp here\"\n"+
"       android:id=\"@+id/tv_sign_up\"\n"+
"       android:layout_gravity=\"center\"\n"+
"       android:layout_margin=\"15dp\"\n"+
"       android:textSize=\"15dp\"/>\n"+
"\n"+
"</LinearLayout>";

    public static final String FIREBASE3="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
"<LinearLayout\n"+
"   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n"+
"   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n"+
"   xmlns:tools=\"http://schemas.android.com/tools\"\n"+
"   android:layout_width=\"match_parent\"\n"+
"   android:layout_height=\"match_parent\"\n"+
"   tools:context=\".Profile\"\n"+
"   android:orientation=\"vertical\">\n"+
"\n"+
"   <TextView\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:text=\"\"\n"+
"       android:id=\"@+id/tv_profile\"\n"+
"       android:textSize=\"30dp\"\n"+
"       android:layout_gravity=\"center\"/>\n"+
"\n"+
"   <Button\n"+
"       android:layout_width=\"wrap_content\"\n"+
"       android:layout_height=\"wrap_content\"\n"+
"       android:layout_gravity=\"center\"\n"+
"       android:layout_marginTop=\"50dp\"\n"+
"       android:id=\"@+id/btn_logout\"\n"+
"       android:text=\"LogOut\"/>\n"+
"\n"+
"</LinearLayout>";
}