package com.amitmps.dell.androidtutorials;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Button;
import android.widget.TextView;

public class List8AsyncTask extends AsyncTask<Void ,Integer ,String> {
    Context context;
    TextView tv;
    Button bt;
    ProgressDialog pd;

    public List8AsyncTask(Context context, TextView tv, Button bt) {
        this.context = context;
        this.tv = tv;
        this.bt = bt;

    }

    @Override
    protected String doInBackground(Void... voids) {
        int i = 0;
        synchronized (this) {
            while (i < 10) {
                try {
                    wait(1500);
                    i++;
                    publishProgress(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return "submitted";
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(context);
        pd.setTitle("submitting......");
        pd.setMax(10);
        pd.setProgress(0);
        pd.setProgressStyle(pd.STYLE_HORIZONTAL);
        pd.show();

    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        tv.setText(result);
        bt.setEnabled(true);
        pd.hide();
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        int pro = values[0];
        pd.setProgress(pro);
        tv.setText("submitting.....");
    }
}

