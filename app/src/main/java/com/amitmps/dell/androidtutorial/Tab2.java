package com.amitmps.dell.androidtutorial;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Tab2 extends Fragment {

    String[] listnames;
    int[] listimages = {R.drawable.list1, R.drawable.list2, R.drawable.list3, R.drawable.list4, R.drawable.list5, R.drawable.list6, R.drawable.list7, R.drawable.list8, R.drawable.list9, R.drawable.list10, R.drawable.list11, R.drawable.list12, R.drawable.list13, R.drawable.list14, R.drawable.list15, R.drawable.list16, R.drawable.list17, R.drawable.list18, R.drawable.list19, R.drawable.list20, R.drawable.list21, R.drawable.list22, R.drawable.list23};
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private List<Tab2ModelClass> itemlist;
    private Tab2Adapter tab2Adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tab2, container, false);

        itemlist=new ArrayList<>();
        itemlist.add(new Tab2ModelClass("Hello World",R.drawable.list1));
        itemlist.add(new Tab2ModelClass("Explicit Intent",R.drawable.list2));
        itemlist.add(new Tab2ModelClass("Implicit Intent",R.drawable.list3));
        itemlist.add(new Tab2ModelClass("Fragments",R.drawable.list4));
        itemlist.add(new Tab2ModelClass("Spinner",R.drawable.list5));
        itemlist.add(new Tab2ModelClass("Multiple Choice",R.drawable.list6));
        itemlist.add(new Tab2ModelClass("Splash Screen",R.drawable.list7));
        itemlist.add(new Tab2ModelClass("Async Task",R.drawable.list8));
        itemlist.add(new Tab2ModelClass("Date&Time Picker",R.drawable.list9));
        itemlist.add(new Tab2ModelClass("Notification",R.drawable.list10));
        itemlist.add(new Tab2ModelClass("Alarm",R.drawable.list11));
        itemlist.add(new Tab2ModelClass("Vibration",R.drawable.list12));
        itemlist.add(new Tab2ModelClass("ListView",R.drawable.list13));
        itemlist.add(new Tab2ModelClass("GridView",R.drawable.list14));
        itemlist.add(new Tab2ModelClass("RecyclerView",R.drawable.list15));
        itemlist.add(new Tab2ModelClass("Text To Speech",R.drawable.list16));
        itemlist.add(new Tab2ModelClass("Speech To Text",R.drawable.list17));
        itemlist.add(new Tab2ModelClass("Sensor",R.drawable.list18));
        itemlist.add(new Tab2ModelClass("Json",R.drawable.list19));
        itemlist.add(new Tab2ModelClass("Alert Dialogbox",R.drawable.list20));
        itemlist.add(new Tab2ModelClass("Navigation Drawer",R.drawable.list21));
        itemlist.add(new Tab2ModelClass("Database",R.drawable.list22));
        itemlist.add(new Tab2ModelClass("Firebase",R.drawable.list23));

        recyclerView=view.findViewById(R.id.recyclerView);
        linearLayoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        tab2Adapter=new Tab2Adapter(getActivity(),itemlist);
        recyclerView.setAdapter(tab2Adapter);
        tab2Adapter.notifyDataSetChanged();

        return view;
    }

   /* @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Resources res = getResources();
        listnames=res.getStringArray(R.array.list_names);

        final ListView listView = view.findViewById(R.id.listview1);
        final Adapter adapter=new Adapter(getActivity(),listnames,listimages);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getContext(),List1.class);
                intent.putExtra("Position",listnames[i]);
                startActivity(intent);

            }
        });
    }
}
class Adapter extends ArrayAdapter {
    Context context;
    int listimages[];
    String[] names;
    public Adapter(@NonNull Context context,String[] list_names,int imgs[]) {
        super(context,R.layout.single_list,R.id.textview1,list_names);
        this.context=context;
        this.listimages=imgs;
        this.names=list_names;
    }
    class ViewHolder
    {
        ImageView mylistimages;
        TextView mylistnames;
        ViewHolder(View view){
            mylistimages=view.findViewById(R.id.imageviewlist);
            mylistnames=view.findViewById(R.id.textview1);
        }
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row=convertView;
        ViewHolder viewHolder=null;
        if(row==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_list, parent, false);
            viewHolder=new ViewHolder(row);
            row.setTag(viewHolder);
        }
        else
        {
            viewHolder= (ViewHolder) row.getTag();
        }

        viewHolder.mylistimages.setImageResource(listimages[position]);
        viewHolder.mylistnames.setText(names[position]);

        return row;
    }*/
}