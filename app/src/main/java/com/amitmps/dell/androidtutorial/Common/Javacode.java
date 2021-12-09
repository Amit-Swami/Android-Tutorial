package com.amitmps.dell.androidtutorial.Common;

public class Javacode {
    public static final String HLO_WORLD = "package com.example.atversion2;\n" +
            "\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "   TextView tv;\n" +
            "\n" +
            "   @Override\n" +
            "   protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        tv=findViewById(R.id.tv);\n" +
            "        tv.setOnClickListener(new View.OnClickListener() {\n" +
            "           @Override\n" +
            "           public void onClick(View view) {\n" +
            "               Toast.makeText(MainActivity.this, \"clicked\", Toast.LENGTH_SHORT).show();\n" +
            "           }\n" +
            "        });\n" +
            "      }\n" +
            "   }\n" +
            "}";

    public static final String EXPLICIT1 ="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.content.Intent;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"import android.widget.TextView;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   Button bt;\n"+
"   TextView tv;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       tv=findViewById(R.id.explicittextView);\n"+
"       bt=findViewById(R.id.explixitb1);\n"+
"       bt.setOnClickListener(new View.OnClickListener() {\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               Intent intent=new Intent(MainActivity.this,Explicit.class);\n"+
"               startActivity(intent);\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"}";

    public static final String EXPLICIT2="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import android.content.Context;\n"+
"import androidx.fragment.app.FragmentTransaction;\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"import android.widget.TextView;\n"+
"\n"+
"public class Explicit extends AppCompatActivity {\n"+
"   Button bt;\n"+
"   TextView tv;\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_explicit);\n"+
"       bt=findViewById(R.id.explicitb2);\n"+
"       tv=findViewById(R.id.explicittextView2);\n"+
"       bt.setOnClickListener(new View.OnClickListener() {\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               Intent i = new Intent(Explicit.this,MainActivity.class);\n"+
"               startActivity(i);\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"}";

    public static final String IMPLICIT =
    "package com.example.atversion2;\n"+
"\n"+
    "import androidx.appcompat.app.AppCompatActivity;\n"+
    "import android.content.Intent;\n"+
    "import android.net.Uri;\n"+
    "import android.os.Bundle;\n"+
    "import android.provider.MediaStore;\n"+
    "import android.provider.Settings;\n"+
    "import android.view.View;\n"+
    "import android.widget.Button;\n"+
"\n"+
    "public class MainActivity extends AppCompatActivity implements View.OnClickListener {\n"+
"\n"+
        "Button b1, b2, b3, b4, b5, b6, b7;\n"+
"\n"+
        "@Override\n"+
        "protected void onCreate(Bundle savedInstanceState) {\n"+
        "  super.onCreate(savedInstanceState);\n"+
        "  setContentView(R.layout.activity_main);\n"+
        "    b1 = findViewById(R.id.camera);\n"+
        "    b2 = findViewById(R.id.wifi);\n"+
        "    b3 = findViewById(R.id.dialer);\n"+
        "    b4 = findViewById(R.id.bluetooth);\n"+
        "    b5 = findViewById(R.id.display);\n"+
        "    b6 = findViewById(R.id.date);\n"+
        "    b7 = findViewById(R.id.gmail);\n"+
"\n"+
        "    b1.setOnClickListener(this);\n"+
        "    b2.setOnClickListener(this);\n"+
        "    b3.setOnClickListener(this);\n"+
        "    b4.setOnClickListener(this);\n"+
        "    b5.setOnClickListener(this);\n"+
        "    b6.setOnClickListener(this);\n"+
        "    b7.setOnClickListener(this);\n"+
        "}\n"+
"\n"+
        "@Override\n"+
        "public void onClick(View view) {\n"+
        "   switch (view.getId()) {\n"+
        "       case R.id.camera:\n"+
        "           Intent i1 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);\n"+
        "           startActivity(i1);\n"+
        "           break;\n"+
        "       case R.id.wifi:\n"+
        "           Intent i2 = new Intent(Settings.ACTION_WIFI_SETTINGS);\n"+
        "           startActivity(i2);\n"+
        "           break;\n"+
        "       case R.id.dialer:\n"+
        "           Intent i3 = new Intent(Intent.ACTION_DIAL);\n"+
        "           i3.setData(Uri.parse(\"tel:1234567890\"));\n"+
        "           startActivity(i3);\n"+
        "           break;\n"+
        "       case R.id.bluetooth:\n"+
        "           Intent i4 = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);\n"+
        "           startActivity(i4);\n"+
        "           break;\n"+
        "       case R.id.display:\n"+
        "           Intent i5 = new Intent(Settings.ACTION_DISPLAY_SETTINGS);\n"+
        "           startActivity(i5);\n"+
        "           break;\n"+
        "           case R.id.date:\n"+
        "           Intent i6 = new Intent(Settings.ACTION_DATE_SETTINGS);\n"+
        "           startActivity(i6);\n"+
        "           break;\n"+
        "       case R.id.gmail:\n"+
        "           Intent i7 = new Intent(Intent.ACTION_VIEW);\n"+
        "           i7.setData(Uri.parse(\"http://www.gmail.com\"));\n"+
        "           startActivity(i7);\n"+
        "           break;\n"+
"\n"+
        "       }\n"+
        "   }\n"+
        "}";

    public static final String FRAGMENT="package com.example.atversion2;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import androidx.fragment.app.FragmentTransaction;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"\n"+
    "public class MainActivity extends AppCompatActivity implements View.OnClickListener {\n"+
"\n"+
        "   Button bt1,bt2,bt3;\n"+
        "   Fragment1 f1=new Fragment1();\n"+
        "   Fragment2 f2=new Fragment2();\n"+
        "   Fragment3 f3=new Fragment3();\n"+
"\n"+
        "   @Override\n"+
        "   protected void onCreate(Bundle savedInstanceState) {\n"+
            "       super.onCreate(savedInstanceState);\n"+
            "       setContentView(R.layout.activity_main);\n"+
            "       bt1=findViewById(R.id.btn1);\n"+
            "       bt2=findViewById(R.id.btn2);\n"+
            "       bt3=findViewById(R.id.btn3);\n"+
            "       bt1.setOnClickListener(this);\n"+
            "       bt2.setOnClickListener(this);\n"+
            "       bt3.setOnClickListener(this);\n"+
        "   }\n"+
"\n"+
        "   @Override\n"+
        "   public void onClick(View view) {\n"+
            "       switch (view.getId())\n"+
            "       {\n"+
                "           case R.id.btn1:\n"+
                    "               FragmentTransaction fm1=getFragmentManager().beginTransaction();\n"+
                    "               fm1.replace(R.id.framelayout,f1);\n"+
                    "               fm1.commit();\n"+
                    "               break;\n"+
                "           case R.id.btn2:\n"+
                    "               FragmentTransaction fm2=getFragmentManager().beginTransaction();\n"+
                    "               fm2.replace(R.id.framelayout,f2);\n"+
                    "               fm2.commit();\n"+
                    "               break;\n"+
                "           case R.id.btn3:\n"+
                    "               FragmentTransaction fm3=getFragmentManager().beginTransaction();\n"+
                    "               fm3.replace(R.id.framelayout,f3);\n"+
                    "               fm3.commit();\n"+
                    "               break;\n"+
            "       }\n"+
        "     }\n"+
    "}";

    public static final String SPINNER="package com.example.atversion2;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.AdapterView;\n"+
"import android.widget.ArrayAdapter;\n"+
"import android.widget.Spinner;\n"+
"import android.widget.Toast;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   Spinner spinner;\n"+
"   ArrayAdapter<CharSequence> ad;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       spinner=findViewById(R.id.spinner);\n"+
"       ad=ArrayAdapter.createFromResource(this,R.array.planet_name,android.R.layout.simple_spinner_item);\n"+
"       ad.setDropDownViewResource(android.R.layout.simple_spinner_item);\n"+
"       spinner.setAdapter(ad);\n"+
"       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {\n"+
"             @Override\n"+
"             public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {\n"+
"                   Toast.makeText(MainActivity.this,adapterView.getItemAtPosition(i)+\"selected\",Toast.LENGTH_SHORT).show();\n"+
"             }\n"+
"\n"+
"             @Override\n"+
"             public void onNothingSelected(AdapterView<?> adapterView) {\n"+
"\n"+
"             }\n"+
"       });\n"+
"   }\n"+
"}";

    public static final String MULTIPLECHOICE ="package com.example.atversion2;\n"+

"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.app.AlertDialog;\n"+
"import android.content.DialogInterface;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"import android.widget.TextView;\n"+
"import java.util.Arrays;\n"+
"import java.util.List;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   Button bt;\n"+
"   TextView tv;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       bt=findViewById(R.id.btn);\n"+
"       tv=findViewById(R.id.tv);\n"+
"       bt.setOnClickListener(new View.OnClickListener() {\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               AlertDialog.Builder ab=new AlertDialog.Builder(MainActivity.this);\n"+
"               final String[] options=new String[]{\"Nike\",\"sparx\",\"Gucci\",\"puma\",\"adidas\"};\n"+
"               final boolean[] checkedoptions=new boolean[]{false,false,false,false,false};\n"+
"               final List<String> list= Arrays.asList(options);\n"+
"               ab.setMultiChoiceItems(options, checkedoptions, new DialogInterface.OnMultiChoiceClickListener() {\n"+
"                   @Override\n"+
"                   public void onClick(DialogInterface dialogInterface, int i, boolean b) {\n"+
"                       checkedoptions[i]=b;\n"+
"                   }\n"+
"               });\n"+
"               ab.setCancelable(false);\n"+
"               ab.setTitle(\"select your brand\");\n"+
"               ab.setPositiveButton(\"Done\", new DialogInterface.OnClickListener() {\n"+
"                   @Override\n"+
"                   public void onClick(DialogInterface dialogInterface, int i) {\n"+
"                       tv.setText(\"Your Preffered Brand is.....\");\n"+
"                       for(int j=0;j<options.length;j++){\n"+
"                           boolean checked=checkedoptions[j];\n"+
"                           if (checked){\n"+
"                               tv.setText(tv.getText()+\", \"+list.get(j)+\"\n\");\n"+
"                           }\n"+
"                       }\n"+
"\n"+
"                   }\n"+
"               });\n"+
"               ab.setNeutralButton(\"cancel\", new DialogInterface.OnClickListener() {\n"+
"                   @Override\n"+
"                   public void onClick(DialogInterface dialogInterface, int i) {\n"+
"                       dialogInterface.cancel();\n"+
"                   }\n"+
"               });\n"+
"               AlertDialog a=ab.create();\n"+
"               a.show();\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"}";

    public static final String SPLASH="package com.example.atversion2;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.content.Intent;\n"+
"import android.os.Bundle;\n"+
"\n"+
"public class Splash extends AppCompatActivity {\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       new Thread(){\n"+
"           public void run(){\n"+
"               try {\n"+
"                   sleep(4000);\n"+
"               } catch (InterruptedException e) {\n"+
"                   e.printStackTrace();\n"+
"               }\n"+
"               Intent intent=new Intent(Splash.this,MainActivity.class);\n"+
"               startActivity(intent);\n"+
"           }\n"+
"       }.start();\n"+
"   }\n"+
"}";

    public static final String ASYNCTASK1 ="package com.amitmps.dell.androidtutorial;\n"+

"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"import android.widget.TextView;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   Button bt;\n"+
"   TextView tv;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       bt=findViewById(R.id.btn);\n"+
"       tv=findViewById(R.id.textView);\n"+
"       bt.setOnClickListener(new View.OnClickListener() {\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               AsyncTaskActivity asyncTask=new AsyncTaskAcivity(MainActivity.this,tv,bt);\n"+
"               asyncTask.execute();\n"+
"               bt.setEnabled(false);\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"}";

        public static final String ASYNCTASK2 ="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import android.app.ProgressDialog;\n"+
"import android.content.Context;\n"+
"import android.os.AsyncTask;\n"+
"import android.widget.Button;\n"+
"import android.widget.TextView;\n"+
"\n"+
"public class AsyncTaskActivity extends AsyncTask<Void ,Integer ,String> {\n"+
"   Context context;\n"+
"   TextView tv;\n"+
"   Button bt;\n"+
"   ProgressDialog pd;\n"+
"\n"+
"       public AsyncTaskActivity(Context context, TextView tv, Button bt) {\n"+
"           this.context = context;\n"+
"           this.tv = tv;\n"+
"           this.bt = bt;\n"+
"\n"+
"       }\n"+
"\n"+
"       @Override\n"+
"       protected String doInBackground(Void... voids) {\n"+
"           int i = 0;\n"+
"           synchronized (this) {\n"+
"               while (i < 10) {\n"+
"                   try {\n"+
"                       wait(1500);\n"+
"                       i++;\n"+
"                       publishProgress(i);\n"+
"               } catch (InterruptedException e) {\n"+
"                   e.printStackTrace();\n"+
"               }\n"+
"           }\n"+
"       }\n"+
"       return \"submitted\";\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   protected void onPreExecute() {\n"+
"       super.onPreExecute();\n"+
"       pd = new ProgressDialog(context);\n"+
"       pd.setTitle(\"submitting......\");\n"+
"       pd.setMax(10);\n"+
"       pd.setProgress(0);\n"+
"       pd.setProgressStyle(pd.STYLE_HORIZONTAL);\n"+
"       pd.show();\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   protected void onPostExecute(String result) {\n"+
"       super.onPostExecute(result);\n"+
"       tv.setText(result);\n"+
"       bt.setEnabled(true);\n"+
"       pd.hide();\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   protected void onProgressUpdate(Integer... values) {\n"+
"       int pro = values[0];\n"+
"       pd.setProgress(pro);\n"+
"       tv.setText(\"submitting.....\");\n"+
"   }\n"+
"}";


        public static final String DATETIME = "package com.example.atversion2;\n"+
"\n"+
"import androidx.annotation.NonNull;\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import androidx.fragment.app.DialogFragment;\n"+
"import android.app.DatePickerDialog;\n"+
"import android.app.Dialog;\n"+
"import android.app.TimePickerDialog;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.DatePicker;\n"+
"import android.widget.TextView;\n"+
"import android.widget.TimePicker;\n"+
"import java.text.SimpleDateFormat;\n"+
"import java.util.Calendar;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   public static TextView tv;\n"+
"   public static Calendar currentdate=Calendar.getInstance();\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       tv=findViewById(R.id.textView);\n"+
"       SimpleDateFormat sdf = new SimpleDateFormat(\"dd-MMM-yyyy HH:mm\");\n"+
"       tv.setText(sdf.format(currentdate.getTime()));\n"+
"       tv.setOnClickListener(new View.OnClickListener() {\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               DialogFragment newFragment = new DatePickerFragment();\n"+
"               newFragment.show(getSupportFragmentManager(), \"datePicker\");\n"+
"               DialogFragment newFragment1 = new TimePickerFragment();\n"+
"               newFragment1.show(getSupportFragmentManager(), \"timePicker\");\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"\n"+
"   public static class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{\n"+
"       public Dialog onCreateDialog(Bundle savedInstanceState){\n"+
"           final Calendar c=Calendar.getInstance();\n"+
"           int year =c.get(Calendar.YEAR);\n"+
"           int month=c.get(Calendar.MONTH);\n"+
"           int day=c.get(Calendar.DAY_OF_MONTH);\n"+
"           DatePickerDialog dpd=new DatePickerDialog(getActivity(),this,year,month,day);\n"+
"           return  dpd;\n"+
"\n"+
"       }\n"+
"       public void onDateSet(DatePicker view, int year, int month, int day) {\n"+
"           currentdate.set(Calendar.YEAR,year);\n"+
"           currentdate.set(Calendar.MONTH,month);\n"+
"           currentdate.set(Calendar.DAY_OF_MONTH,day);\n"+
"           SimpleDateFormat sdf1=new SimpleDateFormat(\"dd-MMM-yyyy HH:MM\");\n"+
"           tv.setText(sdf1.format(currentdate.getTime()));\n"+
"       }\n"+
"   }\n"+
"\n"+
"   public static class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{\n"+
"       @NonNull\n"+
"       @Override\n"+
"       public Dialog onCreateDialog(Bundle savedInstanceState) {\n"+
"           final Calendar c=Calendar.getInstance();\n"+
"           int hour=c.get(Calendar.HOUR_OF_DAY);\n"+
"           int minute=c.get(Calendar.MINUTE);\n"+
"           TimePickerDialog tpd=new TimePickerDialog(getActivity(),this,hour,minute,true);\n"+
"           return tpd;\n"+
"       }\n"+
"\n"+
"       @Override\n"+
"       public void onTimeSet(TimePicker view, int hourofday, int minute) {\n"+
"           currentdate.set(Calendar.HOUR_OF_DAY,hourofday);\n"+
"           currentdate.set(Calendar.MINUTE,minute);\n"+
"           SimpleDateFormat sdf1=new SimpleDateFormat(\"dd=MMM-yyyy HH:MM\");\n"+
"           tv.setText(sdf1.format(currentdate.getTime()));\n"+
"       }\n"+
"   }\n"+
"}";

        public static final String NOTIFICATION ="package com.example.atversion2;\n"+
"\n"+
"import androidx.annotation.RequiresApi;\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.app.Notification;\n"+
"import android.app.NotificationManager;\n"+
"import android.app.PendingIntent;\n"+
"import android.content.Intent;\n"+
"import android.os.Build;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   Button bt;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       bt=findViewById(R.id.btn);\n"+
"       bt.setOnClickListener(new View.OnClickListener() {\n"+
"           @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               Intent i=new Intent();\n"+
"               PendingIntent pi= PendingIntent.getActivity(MainActivity.this,0,i,0);\n"+
"               Notification nt=new Notification.Builder(MainActivity.this)\n"+
"                       .setTicker(\"TickerTitle\")\n"+
"                       .setContentTitle(\"Notification\")\n"+
"                       .setContentText(\"Your msg is here\")\n"+
"                       .setSmallIcon(R.drawable.ic_launcher_background)\n"+
"                       .addAction(R.drawable.ic_launcher_background,\"Message\",pi)\n"+
"                       .setContentIntent(pi).getNotification();\n"+
"               nt.flags=Notification.FLAG_AUTO_CANCEL;\n"+
"               NotificationManager nm= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);\n"+
"               nm.notify(0,nt);\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"}";

        public static final String ALARM1 ="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.app.AlarmManager;\n"+
"import android.app.PendingIntent;\n"+
"import android.content.Intent;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"import android.widget.EditText;\n"+
"import android.widget.Toast;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   Button bt;\n"+
"   EditText et;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       bt=findViewById(R.id.btn);\n"+
"       et=findViewById(R.id.edtText);\n"+
"       bt.setOnClickListener(new View.OnClickListener() {\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               int t = Integer.parseInt(et.getText().toString());\n"+
"               Intent i = new Intent(MainActivity.this, Receiver.class);\n"+
"               PendingIntent pi = PendingIntent.getBroadcast(MainActivity.this, 0, i, 0);\n"+
"               AlarmManager man = (AlarmManager) getSystemService(ALARM_SERVICE);\n"+
"               man.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (t * 1000), pi);\n"+
"               Toast.makeText(MainActivity.this, \"Alarm call after \" + t + \"seconds\", Toast.LENGTH_SHORT).show();\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"}";

    public static final String ALARM2 ="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import android.annotation.SuppressLint;\n"+
"import android.content.BroadcastReceiver;\n"+
"import android.content.Context;\n"+
"import android.content.Intent;\n"+
"import android.os.Vibrator;\n"+
"import android.widget.Toast;\n"+
"\n"+
"public class Receiver extends BroadcastReceiver {\n"+
"   @SuppressLint(\"MissingPermission\")\n"+
"   @Override\n"+
"   public void onReceive(Context context, Intent intent) {\n"+
"       Toast.makeText(context,\"Alarm Time\",Toast.LENGTH_SHORT).show();\n"+
"       Vibrator vibrator= (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);\n"+
"       vibrator.vibrate(4000);\n"+
"   }\n"+
"}";

    public static final String VIBRATION1="package com.example.atversion2;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.content.Intent;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   Button bt;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       bt=findViewById(R.id.btn);\n"+
"       bt.setOnClickListener(new View.OnClickListener() {\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               Intent intent=new Intent(MainActivity.this,Vibrate.class);\n"+
"               startService(intent);\n"+
"\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"}";

    public static final String VIBRATION2 ="package com.example.atversion2;\n"+
"\n"+
"import android.app.Service;\n"+
"import android.content.Context;\n"+
"import android.content.Intent;\n"+
"import android.os.IBinder;\n"+
"import android.os.Vibrator;\n"+
"import androidx.annotation.Nullable;\n"+
"\n"+
"public class Vibrate extends Service {\n"+
"   @Override\n"+
"   public void onStart(Intent intent, int startId) {\n"+
"       super.onStart(intent, startId);\n"+
"       Vibrator vibrator= (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);\n"+
"       vibrator.vibrate(3000);\n"+
"   }\n"+
"\n"+
"   @Nullable\n"+
"   @Override\n"+
"   public IBinder onBind(Intent intent) {\n"+
"       return null;\n"+
"   }\n"+
"}";

    public static final String LISTVIEW ="package com.example.atversion2;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.AdapterView;\n"+
"import android.widget.ArrayAdapter;\n"+
"import android.widget.ListView;\n"+
"import android.widget.Toast;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   ListView lv;\n"+
"   String[] items=new String[]{\"Apple\",\"Mango\",\"Grapes\",\"Banana\",\"Guava\"};\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       lv=findViewById(R.id.listView);\n"+
"       ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,items);\n"+
"       lv.setAdapter(adapter);\n"+
"       lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n"+
"           @Override\n"+
"           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {\n"+
"               Toast.makeText(MainActivity.this,items[i]+\" selected\",Toast.LENGTH_SHORT).show();\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"}";

    public static final String GRIDVIEW ="package com.example.atversion2;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.AdapterView;\n"+
"import android.widget.ArrayAdapter;\n"+
"import android.widget.GridView;\n"+
"import android.widget.Toast;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   String[] items=new String[]{\"Data 1\",\"Data 2\",\"Data 3\",\"Data 4\",\"Data 5\",\"Data 6\",\"Data 7\",\"Data 8\"};\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       GridView gv=findViewById(R.id.gridView);\n"+
"       ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,items);\n"+
"       gv.setAdapter(adapter);\n"+
"       gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n"+
"           @Override\n"+
"           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {\n"+
"               Toast.makeText(MainActivity.this, items[i]+\" selected\", Toast.LENGTH_SHORT).show();\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"}";

    public static final String RECYCLER1 ="package com.example.atversion2;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import androidx.recyclerview.widget.LinearLayoutManager;\n"+
"import androidx.recyclerview.widget.RecyclerView;\n"+
"import android.os.Bundle;\n"+
"import java.util.ArrayList;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   private LinearLayoutManager linearLayoutManager;\n"+
"   private List<ModelClass> itemlist;\n"+
"   private DataAdapter dataAdapter;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       RecyclerView recyclerView=findViewById(R.id.recyclerView);\n"+
"       itemlist=new ArrayList<>();\n"+
"       dataAdapter=new DataAdapter(MainActivity.this,itemlist);\n"+
"\n"+
"       linearLayoutManager=new LinearLayoutManager(MainActivity.this);\n"+
"       recyclerView.setAdapter(dataAdapter);\n"+
"       recyclerView.setLayoutManager(linearLayoutManager);\n"+
"\n"+
"       itemlist.add(new ModelClass(\"Title 1\",\"Description 1\"));\n"+
"       itemlist.add(new ModelClass(\"Title 2\",\"Description 2\"));\n"+
"       itemlist.add(new ModelClass(\"Title 3\",\"Description 3\"));\n"+
"       itemlist.add(new ModelClass(\"Title 4\",\"Description 4\"));\n"+
"       itemlist.add(new ModelClass(\"Title 5\",\"Description 5\"));\n"+
"       itemlist.add(new ModelClass(\"Title 6\",\"Description 6\"));\n"+
"       itemlist.add(new ModelClass(\"Title 7\",\"Description 7\"));\n"+
"       itemlist.add(new ModelClass(\"Title 8\",\"Description 8\"));\n"+
"   }\n"+
"}";

    public static final String RECYCLER2 ="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"public class ModelClass {\n"+
"   String Title,Description;\n"+
"\n"+
"   public ModelClass(String title, String description) {\n"+
"       Title = title;\n"+
"       Description = description;\n"+
"   }\n"+
"\n"+
"   public String getTitle() {\n"+
"       return Title;\n"+
"   }\n"+
"\n"+
"   public String getDescription() {\n"+
"       return Description;\n"+
"   }\n"+
"\n"+
"   public void setTitle(String title) {\n"+
"       Title = title;\n"+
"   }\n"+
"\n"+
"   public void setDescription(String description) {\n"+
"       Description = description;\n"+
"   }\n"+
"}";

    public static final String RECYCLER3 ="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import android.content.Context;\n"+
"import androidx.recyclerview.widget.RecyclerView;\n"+
"import android.view.LayoutInflater;\n"+
"import android.view.View;\n"+
"import android.view.ViewGroup;\n"+
"import android.widget.TextView;\n"+
"import java.util.List;\n"+
"\n"+
"public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {\n"+
"   Context context;\n"+
"   List<ModelClass> itemlist;\n"+
"\n"+
"   public DataAdapter(Context context, List<ModelClass> itemlist) {\n"+
"       this.context = context;\n"+
"       this.itemlist = itemlist;\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   public com.amitmps.dell.androidtutorial.DataAdapter.DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {\n"+
"       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false);\n"+
"       return new com.amitmps.dell.androidtutorial.DataAdapter.DataViewHolder(view);\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   public void onBindViewHolder(com.amitmps.dell.androidtutorial.DataAdapter.DataViewHolder holder, int position) {\n"+
"       holder.Title.setText(itemlist.get(position).getTitle());\n"+
"       holder.Description.setText(itemlist.get(position).getDescription());\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   public int getItemCount() {\n"+
"       return itemlist.size();\n"+
"   }\n"+
"\n"+
"   public class DataViewHolder extends RecyclerView.ViewHolder{\n"+
"       TextView Title,Description;\n"+
"       public DataViewHolder(View itemView) {\n"+
"           super(itemView);\n"+
"           Title=itemView.findViewById(R.id.title);\n"+
"           Description=itemView.findViewById(R.id.descript);\n"+
"       }\n"+
"   }\n"+
"}";

    public static final String TEXTTOSPEECH ="package com.example.atversion2;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.os.Bundle;\n"+
"import android.speech.tts.TextToSpeech;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"import android.widget.EditText;\n"+
"import java.util.Locale;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity implements View.OnClickListener {\n"+
"\n"+
"   Button b1,b2;\n"+
"   EditText ed;\n"+
"   TextToSpeech t1;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       b1=findViewById(R.id.btn1);\n"+
"       b2=findViewById(R.id.btn2);\n"+
"       ed=findViewById(R.id.edt);\n"+
            "\n"+
"       b1.setOnClickListener(this);\n"+
"       b2.setOnClickListener(this);\n"+
"       t1=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {\n"+
"           @Override\n"+
"           public void onInit(int i) {\n"+
"               if(i==TextToSpeech.SUCCESS)\n"+
"               {\n"+
"                   t1.setLanguage(Locale.UK);\n"+
"               }\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   public void onClick(View view) {\n"+
"       switch (view.getId())\n"+
"       {\n"+
"           case R.id.btn1:\n"+
"               String toSpeak=ed.getText().toString();\n"+
"               t1.speak(toSpeak,TextToSpeech.QUEUE_FLUSH,null);\n"+
"               break;\n"+
"           case R.id.btn2:\n"+
"               if(t1!=null)\n"+
"               {\n"+
"                   t1.stop();\n"+
"                   break;\n"+
"               }\n"+
"           }\n"+
"       }\n"+
"\n"+
"   @Override\n"+
"   public void onPause() {\n"+
"       if(t1!=null)\n"+
"       {\n"+
"           t1.stop();\n"+
"           t1.shutdown();\n"+
"       }\n"+
"       super.onPause();\n"+
"   }\n"+
"}";

    public static final String SPEECHTOTEXT ="package com.example.atversion2;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.content.ActivityNotFoundException;\n"+
"import android.content.Intent;\n"+
"import android.os.Bundle;\n"+
"import android.speech.RecognizerIntent;\n"+
"import android.view.View;\n"+
"import android.widget.ImageView;\n"+
"import android.widget.TextView;\n"+
"import java.util.ArrayList;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   int voice_input = 1;\n"+
"   TextView tv;\n"+
"   ImageView iv;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       tv =findViewById(R.id.tv);\n"+
"       iv =findViewById(R.id.imgBtn);\n"+
"       iv.setOnClickListener(new View.OnClickListener() {\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               startVoiceInput();\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"\n"+
"       void startVoiceInput() {\n"+
"           Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);\n"+
"           i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);\n"+
"           i.putExtra(RecognizerIntent.EXTRA_PROMPT, \"Hello,convert your voice into text\");\n"+
"           try {\n"+
"               startActivityForResult(i, voice_input);\n"+
"           } catch (ActivityNotFoundException a) {\n"+
"           }\n"+
"       }\n"+
"\n"+
"       @Override\n"+
"       public void onActivityResult(int requestCode, int resultCode, Intent data) {\n"+
"           super.onActivityResult(requestCode, resultCode, data);\n"+
"           if(resultCode==RESULT_OK && null!=data){\n"+
"               ArrayList<String> text=data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);\n"+
"               tv.setText(text.get(0));\n"+
"        }\n"+
"    }\n"+
"}";

    public static final String SENSOR ="package com.example.atversion2;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.content.Context;\n"+
"import android.hardware.Sensor;\n"+
"import android.hardware.SensorEvent;\n"+
"import android.hardware.SensorManager;\n"+
"import android.os.Bundle;\n"+
"import android.widget.TextView;\n"+
"import java.util.Random;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   SensorManager sm;\n"+
"   TextView tv;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       tv = findViewById(R.id.textView);\n"+
"       sm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);\n"+
"       sm.registerListener(this, sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   public void onSensorChanged(SensorEvent sensorEvent) {\n"+
"       if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {\n"+
"           float values[] = sensorEvent.values;\n"+
"           float x = values[0];\n"+
"           float y = values[1];\n"+
"           float z = values[2];\n"+
"           float asr = (x * x + y * y + z * z) / (SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);\n"+
"           if (asr >= 2) {\n"+
"               Random r = new Random();\n"+
"               int i = r.nextInt(1000);\n"+
"               tv.setText(\"\" + i);\n"+
"           }\n"+
"       }\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   public void onAccuracyChanged(Sensor sensor, int i) {\n"+
"\n"+
"   }\n"+
"}";

    public static final String JSONPARSE="package com.example.atversion2;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"import android.widget.TextView;\n"+
"import org.json.JSONArray;\n"+
"import org.json.JSONException;\n"+
"import org.json.JSONObject;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
    "String str=\"{\"Employee\" :" + "[" + "{"
            + "\"name\":\"Abc\"," + "\"id\":\"001\","
            + "\"salary\":\"60000\"" + "},"
            + "{" + "\"name\":\"Xyz\","
            + "\"id\":\"002\","
            + "\"salary\":\"70000\"" + "},"
            + "{" + "\"name\":\"Lmn\"," + "\"id\":\"003\","
            + "\"salary\":\"100000\"" + "}"+ "]"
            + "}\";\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       Button bt=findViewById(R.id.btn);\n"+
"       final TextView output=findViewById(R.id.tv);\n"+
"       bt.setOnClickListener(new View.OnClickListener() {\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               String data = \"\";\n"+
"               try {\n"+
"                   JSONObject jsonObject = new JSONObject(str);\n"+
"                   JSONArray jsonArray = jsonObject.optJSONArray(\"Employee\");\n"+
"\n"+
"                   for (int i = 0; i < jsonArray.length(); i++) {\n"+
"                       JSONObject childObject = jsonArray.getJSONObject(i);\n"+
"                       int id = childObject.optInt(\"id\");\n"+
"                       String name = childObject.optString(\"name\").toString();\n"+
"                       String salary = childObject.optString(\"salary\").toString();\n"+
"                       data += \"Node: \n\n  \" + id + \" | \" + name + \" | \" + salary + \"\n\n\";\n"+
"                   }\n"+
"                   output.setText(data);\n"+
"                   } catch (JSONException e) {\n"+
"                       e.printStackTrace();\n"+
"                   }\n"+
"               }\n"+
"           });\n"+
"      }\n"+
"}";

    public static final String ALERTDIALOGBOX ="package com.example.atversion2;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.app.AlertDialog;\n"+
"import android.content.DialogInterface;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity {\n"+
"\n"+
"   Button bt;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       bt=findViewById(R.id.btn);\n"+
"       bt.setOnClickListener(new View.OnClickListener() {\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               AlertDialog.Builder ab=new AlertDialog.Builder(MainActivity.this);\n"+
"               ab.setTitle(\"Do you want to exit\");\n"+
"               ab.setPositiveButton(\"Yes\",new DialogInterface.OnClickListener() {\n"+
"                   @Override\n"+
"                   public void onClick(DialogInterface dialogInterface, int i) {\n"+
"                       finish();\n"+
"                   }\n"+
"               });\n"+
"               ab.setNegativeButton(\"No\", new DialogInterface.OnClickListener() {\n"+
"                   @Override\n"+
"                   public void onClick(DialogInterface dialogInterface, int i) {\n"+
"                       dialogInterface.cancel();\n"+
"                   }\n"+
"               });\n"+
"               AlertDialog a=ab.create();\n"+
"               a.show();\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"}";
    public static final String NAVIGATION ="package com.example.atversion2;\n"+
"\n"+
"import androidx.annotation.NonNull;\n"+
"import androidx.appcompat.app.ActionBarDrawerToggle;\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import androidx.appcompat.widget.Toolbar;\n"+
"import androidx.core.view.GravityCompat;\n"+
"import androidx.drawerlayout.widget.DrawerLayout;\n"+
"import android.os.Bundle;\n"+
"import android.view.Menu;\n"+
"import android.view.MenuInflater;\n"+
"import android.view.MenuItem;\n"+
"import android.widget.Toast;\n"+
"import com.google.android.material.navigation.NavigationView;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {\n"+
"\n"+
"   private DrawerLayout drawerLayout;\n"+
"   private ActionBarDrawerToggle actionBarDrawerToggle;\n"+
"   private Toolbar mtoolbar;\n"+
"\n"+
"       @Override\n"+
"       protected void onCreate(Bundle savedInstanceState) {\n"+
"           super.onCreate(savedInstanceState);\n"+
"           setContentView(R.layout.activity_main);\n"+
"\n"+
"           mtoolbar=findViewById(R.id.toolbar);\n"+
"           setSupportActionBar(mtoolbar);\n"+
"\n"+
"           drawerLayout=findViewById(R.id.drawerlayout);\n"+
"           actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);\n"+
"\n"+
"           drawerLayout.addDrawerListener(actionBarDrawerToggle);\n"+
"           actionBarDrawerToggle.syncState();\n"+
"\n"+
"           getSupportActionBar().setDisplayHomeAsUpEnabled(true);\n"+
"\n"+
"           NavigationView navigationView = findViewById(R.id.navView);\n"+
"           navigationView.setNavigationItemSelectedListener(this);\n"+
"\n"+
"       }\n"+
"\n"+
"       @Override\n"+
"       public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {\n"+
"           inflater.inflate(R.menu.main,menu);\n"+
"           return true;\n"+
"       }\n"+
"\n"+
"       @Override\n"+
"       public boolean onOptionsItemSelected(MenuItem item) {\n"+
"           int id=item.getItemId();\n"+
"           if(id==R.id.item6)\n"+
"           {\n"+
"               Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();\n"+
"           }\n"+
"           if(actionBarDrawerToggle.onOptionsItemSelected(item)){\n"+
"               return true;\n"+
"           }\n"+
"           return super.onOptionsItemSelected(item);\n"+
"       }\n"+
"\n"+
"       @Override\n"+
"       public boolean onNavigationItemSelected(@NonNull MenuItem item) {\n"+
"           int id=item.getItemId();\n"+
"           if(id==R.id.item1)\n"+
"           {\n"+
"               Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();\n"+
"           }\n"+
"           else if(id==R.id.item2)\n"+
"           {\n"+
"               Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();\n"+
"           }\n"+
"           else if (id==R.id.item3)\n"+
"           {\n"+
"               Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();\n"+
"           }\n"+
"           else if(id==R.id.item4)\n"+
"           {\n"+
"               Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();\n"+
"           }\n"+
"           else if(id==R.id.item5)\n"+
"           {\n"+
"               Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();\n"+
"           }\n"+
"           drawerLayout.closeDrawer(GravityCompat.START);\n"+
"           return true;\n"+
"       }\n"+
"}\n";

    public static final String DATABASE1="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.app.Dialog;\n"+
"import android.content.Intent;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"import android.widget.EditText;\n"+
"import android.widget.Toast;\n"+
"import com.google.android.material.navigation.NavigationView;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {\n"+
"\n"+
"   Button btnSignIn,btnSignUp;\n"+
"   DataBaseAdapter dataBaseAdapter;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       dataBaseAdapter=new DataBaseAdapter(this);\n"+
"       dataBaseAdapter=dataBaseAdapter.open();\n"+
"\n"+
"       btnSignIn=findViewById(R.id.buttonSignIn);\n"+
"       btnSignUp=findViewById(R.id.buttonSignUp);\n"+
"\n"+
"       btnSignUp.setOnClickListener(new View.OnClickListener() {\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               Intent intentSignUP=new Intent(MainActivity.this,SignUp.class);\n"+
"               startActivity(intentSignUP);\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"\n"+
"   public void signIn(View V)\n"+
"   {\n"+
"       final Dialog dialog=new Dialog(this);\n"+
"       dialog.setContentView(R.layout.login);\n"+
"       dialog.setTitle(\"Login\");\n"+
"\n"+
"       final EditText editTextUserName=dialog.findViewById(R.id.editTextUserNameToLogin);\n"+
"       final EditText editTextPassword=dialog.findViewById(R.id.editTextPasswordToLogin);\n"+
"\n"+
"       Button btnSignIn=dialog.findViewById(R.id.loginbuttonSignIn);\n"+
"       btnSignIn.setOnClickListener(new View.OnClickListener() {\n"+
"           @Override\n"+
"           public void onClick(View view) {\n"+
"               String userName=editTextUserName.getText().toString();\n"+
"               String password=editTextPassword.getText().toString();\n"+
"\n"+
"               String storedPassword=dataBaseAdapter.getSingleEntry(userName);\n"+
"\n"+
"               if(password.equals(storedPassword))\n"+
"               {\n"+
"                   Intent i=new Intent(MainActivity.this,LogedData.class);\n"+
"                   i.putExtra(\"name\",userName);\n"+
"                   i.putExtra(\"password\",password);\n"+
"                   startActivity(i);\n"+
"\n"+
"                   Toast.makeText(MainActivity.this,\"Congrats:Login Successfully\",Toast.LENGTH_LONG).show();\n"+
"                   dialog.dismiss();\n"+
"               }\n"+
"               else\n"+
"               {\n"+
"                   Toast.makeText(MainActivity.this,\"User Name or Password does not match\",Toast.LENGTH_LONG).show();\n"+
"               }\n"+
"           }\n"+
"       });\n"+
"       dialog.show();\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   public void onDestroy() {\n"+
"       super.onDestroy();\n"+
"       dataBaseAdapter.close();\n"+
"   }\n"+
"}";

    public static final String DATABASE2="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import android.content.ContentValues;\n"+
"import android.content.Context;\n"+
"import android.database.Cursor;\n"+
"import android.database.SQLException;\n"+
"import android.database.sqlite.SQLiteDatabase;\n"+
"\n"+
"public class DataBaseAdapter {\n"+
"   static final String DATABASE_NAME =\"login.db\";\n"+
"   static final int DATABASE_VERSION=1;\n"+
"\n"+
"   static final String DataBase_Create= \"create table \"+\"LOGIN\"+ \"( \" +\"ID\"+\" integer primary key autoincrement,\"+ \"USERNAME text,\" +\"PASSWORD text); \";\n"+
"\n"+
"   public SQLiteDatabase db;\n"+
"   private final Context context;\n"+
"   private List22DBhelper dbHelper;\n"+
"   public DataBaseAdapter(Context _context)\n"+
"   {\n"+
"       context=_context;\n"+
"       dbHelper=new List22DBhelper(context,DATABASE_NAME,null,DATABASE_VERSION);\n"+
"   }\n"+
"   public com.amitmps.dell.androidtutorial.DataBaseAdapter open() throws SQLException\n"+
"   {\n"+
"       db=dbHelper.getWritableDatabase();\n"+
"       return this;\n"+
"   }\n"+
"   public void close()\n"+
"   {\n"+
"       db.close();\n"+
"   }\n"+
"   public void insertEntry(String userName,String password)\n"+
"   {\n"+
"       ContentValues newValues=new ContentValues();\n"+
"       newValues.put(\"USERNAME\",userName);\n"+
"       newValues.put(\"PASSWORD\",password);\n"+
"       db.insert(\"LOGIN\",null,newValues);\n"+
"   }\n"+
"   public String getSingleEntry(String userName)\n"+
"   {\n"+
"       Cursor cursor=\n"+
"       db.query(\"LOGIN\",null,\"USERNAME=?\",new String[]{userName},null,null,null);\n"+
"       if(cursor.getCount()<1) {\n"+
"       cursor.close();\n"+
"       return \"NOT EXIST\";\n"+
"   }\n"+
"   cursor.moveToFirst();\n"+
"   String password=cursor.getString(cursor.getColumnIndex(\"PASSWORD\"));\n"+
"   cursor.close();\n"+
"   return password;\n"+
"   }\n"+
"}";

    public static final String DATABASE3="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import android.content.Context;\n"+
"import android.database.sqlite.SQLiteDatabase;\n"+
"import android.database.sqlite.SQLiteOpenHelper;\n"+
"\n"+
"public class DBhelper extends SQLiteOpenHelper {\n"+
"\n"+
"   public DBhelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {\n"+
"       super(context, name, factory, version);\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   public void onCreate(SQLiteDatabase sqLiteDatabase) {\n"+
"       sqLiteDatabase.execSQL(DataBaseAdapter.DataBase_Create);\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {\n"+
"       sqLiteDatabase.execSQL(\"DROP TABLE IF EXISTS \" + \"TEMPLATE\");\n"+
"       onCreate(sqLiteDatabase);\n"+
"   }\n"+
"}";

    public static final String DATABASE4="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import android.content.Intent;\n"+
"import androidx.annotation.Nullable;\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.os.Bundle;\n"+
"import android.widget.TextView;\n"+
"\n"+
"public class LogedData extends AppCompatActivity {\n"+
"   TextView username,password;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(@Nullable Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.loged_data);\n"+
"       username=findViewById(R.id.username);\n"+
"       password=findViewById(R.id.password);\n"+
"\n"+
"       Intent i=getIntent();\n"+
"       username.setText(i.getStringExtra(\"name\"));\n"+
"       password.setText(i.getStringExtra(\"password\"));\n"+
"   }\n"+
"}";

    public static final String DATABASE5="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import androidx.annotation.Nullable;\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"import android.widget.EditText;\n"+
"import android.widget.Toast;\n"+
"\n"+
"public class SignUp extends AppCompatActivity {\n"+
"   EditText editTextUserName, editTextPassword, editTextConfirmPassword;\n"+
"   Button btnCreateAccount;\n"+
"   DataBaseAdapter dataBaseAdapter;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(@Nullable Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_list22_sign_up);\n"+
"\n"+
"       dataBaseAdapter = new DataBaseAdapter(this);\n"+
"       dataBaseAdapter = dataBaseAdapter.open();\n"+
"       editTextUserName = findViewById(R.id.editTextUserName);\n"+
"       editTextPassword = findViewById(R.id.editTextPassword);\n"+
"       editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);\n"+
"       btnCreateAccount = findViewById(R.id.buttonCreateAccount);\n"+
"\n"+
"       btnCreateAccount.setOnClickListener(new View.OnClickListener() {\n"+
"       @Override\n"+
"       public void onClick(View view) {\n"+
"           String userName = editTextUserName.getText().toString();\n"+
"           String password = editTextPassword.getText().toString();\n"+
"           String confirmPassword = editTextConfirmPassword.getText().toString();\n"+
"\n"+
"           if (userName.equals(\"\") || password.equals(\"\") || confirmPassword.equals(\"\")) {\n"+
"               Toast.makeText(getApplicationContext(), \"Field Vaccant\", Toast.LENGTH_LONG).show();\n"+
"               return;\n"+
"           }\n"+
"           if (!password.equals(confirmPassword)) {\n"+
"               Toast.makeText(getApplicationContext(),\"Password does not match\", Toast.LENGTH_LONG).show();\n"+
"               return;\n"+
"           } else {\n"+
"           dataBaseAdapter.insertEntry(userName, password);\n"+
"           Toast.makeText(getApplicationContext(), \"Account Successfully Created\", Toast.LENGTH_LONG).show();\n"+
"           }\n"+
"       });\n"+
"   }\n"+
    "@Override\n"+
"   protected void onDestroy() {\n"+
"       super.onDestroy();\n"+
"       dataBaseAdapter.close();\n"+
"   }\n"+
"}";

    public static final String FIREBASE1 ="package com.example.atversion2;\n"+
"\n"+
"import androidx.annotation.NonNull;\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.app.ProgressDialog;\n"+
"import android.content.Intent;\n"+
"import android.os.Bundle;\n"+
"import android.text.TextUtils;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"import android.widget.EditText;\n"+
"import android.widget.TextView;\n"+
"import android.widget.Toast;\n"+
"\n"+
"public class MainActivity extends AppCompatActivity implements View.OnClickListener {\n"+
"\n"+
"   private EditText editTextEmail;\n"+
"   private EditText editTextPassword;\n"+
"   private Button buttonSignUp;\n"+
"   private TextView textViewSignIn;\n"+
"   private ProgressDialog progressDialog;\n"+
"   private FirebaseAuth firebaseAuth;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_main);\n"+
"\n"+
"       firebaseAuth = FirebaseAuth.getInstance();\n"+
"\n"+
"       if (firebaseAuth.getCurrentUser() != null) {\n"+
"       finish();\n"+
"       Intent intent = new Intent(MainActivity.this, Profile.class);\n"+
"       startActivity(intent);\n"+
"       }\n"+
"       editTextEmail = findViewById(R.id.editTextEmail);\n"+
"       editTextPassword = findViewById(R.id.editTextPassword);\n"+
"       textViewSignIn = findViewById(R.id.tv_SignIn);\n"+
"       buttonSignUp = findViewById(R.id.bt1);\n"+
"\n"+
"       progressDialog = new ProgressDialog(this);\n"+
"\n"+
"       buttonSignUp.setOnClickListener(this);\n"+
"       textViewSignIn.setOnClickListener(this);\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   public void onClick(View view) {\n"+
"       if (view == buttonSignUp) {\n"+
"           registerUser();\n"+
"       }\n"+
"       if (view == textViewSignIn) {\n"+
"           startActivity(new Intent(MainActivity.this, Login.class));\n"+
"       }\n"+
"   }\n"+
"\n"+
"   private void registerUser() {\n"+
"       String Email = editTextEmail.getText().toString().trim();\n"+
"       String Password = editTextPassword.getText().toString().trim();\n"+
"\n"+
"       if (TextUtils.isEmpty(Email)) {\n"+
"           Toast.makeText(MainActivity.this, \"Please Enter Email\", Toast.LENGTH_LONG).show();\n"+
"           return;\n"+
"       }\n"+
"       if (TextUtils.isEmpty(Password)) {\n"+
"           Toast.makeText(MainActivity.this, \"Please Enter Password\", Toast.LENGTH_LONG).show();\n"+
"           return;\n"+
"       }\n"+
"       progressDialog.setMessage(\"Registering Please Wait........\");\n"+
"       progressDialog.show();\n"+
"\n"+
"       firebaseAuth.createUserWithEmailAndPassword(Email, Password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {\n"+
"       @Override\n"+
"       public void onComplete(@NonNull Task<AuthResult> task) {\n"+
"           if (task.isSuccessful()) {\n"+
"               finish();\n"+
"               startActivity(new Intent(MainActivity.this, Profile.class));\n"+
"           } else {\n"+
"               Toast.makeText(MainActivity.this,\"Registeration error....\"+task.getException().getMessage(), Toast.LENGTH_LONG).show();\n"+
"           }\n"+
"           progressDialog.dismiss();\n"+
"           }\n"+
"        });\n"+
"   }\n"+
"}";

    public static final String FIREBASE2="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import android.app.ProgressDialog;\n"+
"import android.content.Intent;\n"+
"import androidx.annotation.NonNull;\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.os.Bundle;\n"+
"import android.text.TextUtils;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"import android.widget.EditText;\n"+
"import android.widget.TextView;\n"+
"import android.widget.Toast;\n"+
"import com.google.android.gms.tasks.OnCompleteListener;\n"+
"import com.google.android.gms.tasks.Task;\n"+
"import com.google.firebase.auth.AuthResult;\n"+
"import com.google.firebase.auth.FirebaseAuth;\n"+
"\n"+
"public class Login extends AppCompatActivity implements View.OnClickListener{\n"+
"   private Button btloginSignIn;\n"+
"   private EditText etloginEmail;\n"+
"   private EditText etloginPassword;\n"+
"   private TextView tvloginSignUp;\n"+
"   private FirebaseAuth firebaseAuth;\n"+
"   private ProgressDialog progressDialog;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_list23_login);\n"+
"\n"+
"       firebaseAuth = FirebaseAuth.getInstance();\n"+
"\n"+
"       if (firebaseAuth.getCurrentUser() != null) {\n"+
"           finish();\n"+
"           startActivity(new Intent(getApplicationContext(), List23Profile.class));\n"+
"       }\n"+
"       etloginEmail = findViewById(R.id.ed_Email);\n"+
"       etloginPassword = findViewById(R.id.ed_Password);\n"+
"       btloginSignIn = findViewById(R.id.btnSignIn);\n"+
"       tvloginSignUp = findViewById(R.id.tv_sign_up);\n"+
"\n"+
"       progressDialog = new ProgressDialog(this);\n"+
"\n"+
"       btloginSignIn.setOnClickListener(this);\n"+
"       tvloginSignUp.setOnClickListener(this);\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   public void onClick(View view) {\n"+
"       if (view == btloginSignIn) {\n"+
"           userLogin();\n"+
"       }\n"+
"       if (view == tvloginSignUp) {\n"+
"           finish();\n"+
"           startActivity(new Intent(this, com.amitmps.dell.androidtutorial.MainActivity.class));\n"+
"       }\n"+
"   }\n"+
"\n"+
"   private void userLogin() {\n"+
"       String email = etloginEmail.getText().toString().trim();\n"+
"       String password = etloginPassword.getText().toString().trim();\n"+
"       if (TextUtils.isEmpty(email)) {\n"+
"           Toast.makeText(this, \"Please Enter Email\", Toast.LENGTH_LONG).show();\n"+
"           return;\n"+
"       }\n"+
"       if (TextUtils.isEmpty(password)) {\n"+
"           Toast.makeText(this, \"Please Enter Password\", Toast.LENGTH_LONG).show();\n"+
"           return;\n"+
"\n"+
"       }\n"+
"       progressDialog.setMessage(\"Signing In Please wait....\");\n"+
"       progressDialog.show();\n"+
"\n"+
"       firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {\n"+
"           @Override\n"+
"           public void onComplete(@NonNull Task<AuthResult> task) {\n"+
"               progressDialog.dismiss();\n"+
"               if (task.isSuccessful()) {\n"+
"                   finish();\n"+
"                   startActivity(new Intent(getApplicationContext(), List23Profile.class));\n"+
"               } else {\n"+
"                   Toast.makeText(Login.this, \"invalid Email and Password\", Toast.LENGTH_SHORT).show();\n"+
"               }\n"+
"           }\n"+
"       });\n"+
"   }\n"+
"}";

    public static final String FIREBASE3="package com.amitmps.dell.androidtutorial;\n"+
"\n"+
"import android.content.Intent;\n"+
"import androidx.appcompat.app.AppCompatActivity;\n"+
"import android.os.Bundle;\n"+
"import android.view.View;\n"+
"import android.widget.Button;\n"+
"import android.widget.TextView;\n"+
"import com.google.firebase.auth.FirebaseAuth;\n"+
"import com.google.firebase.auth.FirebaseUser;\n"+
"\n"+
"public class Profile extends AppCompatActivity implements View.OnClickListener {\n"+
"   private FirebaseAuth firebaseAuth;\n"+
"   private TextView tvP;\n"+
"   private Button btnLogout;\n"+
"\n"+
"   @Override\n"+
"   protected void onCreate(Bundle savedInstanceState) {\n"+
"       super.onCreate(savedInstanceState);\n"+
"       setContentView(R.layout.activity_profile);\n"+
"       firebaseAuth=FirebaseAuth.getInstance();\n"+
"\n"+
"       if(firebaseAuth.getCurrentUser()==null){\n"+
"           finish();\n"+
"           startActivity(new Intent(this, Login.class));\n"+
"       }\n"+
"       FirebaseUser user=firebaseAuth.getCurrentUser();\n"+
"\n"+
"       tvP=findViewById(R.id.tv_profile);\n"+
"       btnLogout=findViewById(R.id.btn_logout);\n"+
"\n"+
"       tvP.setText(\"Welcome\"+user.getEmail());\n"+
"       btnLogout.setOnClickListener(this);\n"+
"   }\n"+
"\n"+
"   @Override\n"+
"   public void onClick(View view) {\n"+
"       if(view==btnLogout){\n"+
"           firebaseAuth.signOut();\n"+
"           finish();\n"+
"           startActivity(new Intent(Profile.this, Login.class));\n"+
"       }\n"+
"   }\n"+
"}";
}