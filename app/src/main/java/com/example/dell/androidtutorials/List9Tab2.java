package com.example.dell.androidtutorials;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class List9Tab2 extends Fragment {

   public static TextView tv;
    public static Calendar currentdate=Calendar.getInstance();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_list9_tab2, container, false);
        tv=view.findViewById(R.id.list9textview);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm");
        tv.setText(sdf.format(currentdate.getTime()));
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment newFragment = new DatePickerFragment();
                newFragment.show(getFragmentManager(), "datePicker");
                DialogFragment newFragment1 = new TimePickerFragment();
                newFragment1.show(getFragmentManager(), "timePicker");
            }
        });
        return view;
    }
    public static class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{
        public Dialog onCreateDialog(Bundle savedInstanceState){
            final Calendar c=Calendar.getInstance();
            int year =c.get(Calendar.YEAR);
            int month=c.get(Calendar.MONTH);
            int day=c.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog dpd=new DatePickerDialog(getActivity(),this,year,month,day);
            return  dpd;

       }
        public void onDateSet(DatePicker view, int year, int month, int day) {
            currentdate.set(Calendar.YEAR,year);
            currentdate.set(Calendar.MONTH,month);
            currentdate.set(Calendar.DAY_OF_MONTH,day);
            SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMM-yyyy HH:MM");
            tv.setText(sdf1.format(currentdate.getTime()));

        }
    }
    public static class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{
        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar c=Calendar.getInstance();
            int hour=c.get(Calendar.HOUR_OF_DAY);
            int minute=c.get(Calendar.MINUTE);
            TimePickerDialog tpd=new TimePickerDialog(getActivity(),this,hour,minute,true);
            return tpd;
        }

        @Override
        public void onTimeSet(TimePicker view, int hourofday, int minute) {
            currentdate.set(Calendar.HOUR_OF_DAY,hourofday);
            currentdate.set(Calendar.MINUTE,minute);
            SimpleDateFormat sdf1=new SimpleDateFormat("dd=MMM-yyyy HH:MM");
            tv.setText(sdf1.format(currentdate.getTime()));


        }
    }

}
