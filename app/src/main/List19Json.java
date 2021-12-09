package com.amitmps.dell.androidtutorial;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * A simple {@link Fragment} subclass.
 */
public class List19Json extends Fragment {
    AdView mAdView;

    String str="{\"Employee\" :" + "[" + "{"
            + "\"name\":\"Abc\"," + "\"id\":\"001\","
            + "\"salary\":\"60000\"" + "},"
            + "{" + "\"name\":\"Xyz\","
            + "\"id\":\"002\","
            + "\"salary\":\"70000\"" + "},"
            + "{" + "\"name\":\"Lmn\"," + "\"id\":\"003\","
            + "\"salary\":\"100000\"" + "}"+ "]"
            + "}";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_list19_json, container, false);
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView=view.findViewById(R.id.adView19);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        Button bt=view.findViewById(R.id.list19b1);
        final TextView output=view.findViewById(R.id.list19t1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = "";
                try {
                    JSONObject jsonObject = new JSONObject(str);
                    JSONArray jsonArray = jsonObject.optJSONArray("Employee");

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject childObject = jsonArray.getJSONObject(i);

                        int id = childObject.optInt("id");
                        String name = childObject.optString("name").toString();
                        String salary = childObject.optString("salary").toString();
                        data += "Node: \n\n  " + id + " | " + name + " | " + salary + "\n\n";


                    }
                    output.setText(data);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        return view;
    }

}
