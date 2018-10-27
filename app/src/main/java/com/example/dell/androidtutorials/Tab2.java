package com.example.dell.androidtutorials;


import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2 extends Fragment {
    // String[] items={"Hello world","Explicit Intent","Implicit Intent","Fragment","Spinner","Multiple Choice","Splash Screen","Aync Task","Date&Time Picker","Notification","Alarm","Vibration","Listview","Gridview","Recyclerview","Text To Speech","Speech To Text","Sensor","Json","Alert Dialogbox","Navigation Drawer","Database","Firebase"};
    String[] listnames;
    int[] listimages = {R.drawable.list1, R.drawable.list2, R.drawable.list3, R.drawable.list4, R.drawable.list5, R.drawable.list6, R.drawable.list7, R.drawable.list8, R.drawable.list9, R.drawable.list10, R.drawable.list11, R.drawable.list12, R.drawable.list13, R.drawable.list14, R.drawable.list15, R.drawable.list16, R.drawable.list17, R.drawable.list18, R.drawable.list19, R.drawable.list20, R.drawable.list21, R.drawable.list22, R.drawable.list23};
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab2, container, false);
    }

    @Override
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
                switch (i)
                {
                    case 0:
                        startActivity(new Intent(getContext(),List1.class));
                        break;
                    case 1:
                        startActivity(new Intent(getContext(),List2.class));
                        break;
                    case 2:
                        startActivity(new Intent(getContext(),List3.class));
                        break;
                    case 3:
                        startActivity(new Intent(getContext(),List4.class));
                        break;
                    case 4:
                        startActivity(new Intent(getContext(),List5.class));
                        break;
                    case 5:
                        startActivity(new Intent(getContext(),List6.class));
                        break;
                    case 6:
                        startActivity(new Intent(getContext(),List7.class));
                        break;
                    case 7:
                        startActivity(new Intent(getContext(),List8.class));
                        break;
                    case 8:
                        startActivity(new Intent(getContext(),List9.class));
                        break;
                    case 9:
                        startActivity(new Intent(getContext(),List10.class));
                        break;
                    case 10:
                        startActivity(new Intent(getContext(),List11.class));
                        break;
                    case 11:
                        startActivity(new Intent(getContext(),List12.class));
                        break;
                    case 12:
                        startActivity(new Intent(getContext(),List13.class));
                        break;
                    case 13:
                        startActivity(new Intent(getContext(),List14.class));
                        break;
                    case 14:
                        startActivity(new Intent(getContext(),List15.class));
                        break;
                    case 15:
                        startActivity(new Intent(getContext(),List16.class));
                        break;
                    case 16:
                        startActivity(new Intent(getContext(),List17.class));
                        break;
                    case 17:
                        startActivity(new Intent(getContext(),List18.class));
                        break;
                    case 18:
                        startActivity(new Intent(getContext(),List19.class));
                        break;
                    case 19:
                        startActivity(new Intent(getContext(),List20.class));
                        break;
                    case 20:
                        startActivity(new Intent(getContext(),List21.class));
                        break;
                    case 21:
                        startActivity(new Intent(getContext(),List22.class));
                        break;
                    case 22:
                        startActivity(new Intent(getContext(),List23.class));
                        break;
                }
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
    }
}

