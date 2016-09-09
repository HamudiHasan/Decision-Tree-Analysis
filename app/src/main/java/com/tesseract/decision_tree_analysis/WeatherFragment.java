package com.tesseract.decision_tree_analysis;


import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import com.jaredrummler.materialspinner.MaterialSpinner;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class WeatherFragment extends Fragment {


    EditText humidity;
    MaterialSpinner outlook,windy;

    public WeatherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_weather, container, false);

        humidity =(EditText)view.findViewById(R.id.humidity);

        final ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add(AppUtil.OVERCAST);
        arrayList.add(AppUtil.RAINY);
        arrayList.add(AppUtil.SUNNY);






        outlook = (MaterialSpinner) view.findViewById(R.id.outlook);
        outlook.setItems(AppUtil.OVERCAST, AppUtil.RAINY, AppUtil.SUNNY);
        outlook.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "You Selected  " + item, Snackbar.LENGTH_LONG).show();
            }
        });
        windy = (MaterialSpinner) view.findViewById(R.id.windy);
        windy.setItems("Yes", "No");
        windy.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "You Selected  " + item, Snackbar.LENGTH_LONG).show();
            }
        });


        view.findViewById(R.id.genarate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Weather weather=new Weather();
                weather.setOutlook(arrayList.get(outlook.getSelectedIndex()));
                weather.setHumidity(Double.parseDouble(humidity.getText().toString()));
                if(windy.getSelectedIndex()==0)
                    weather.setWindy(Boolean.TRUE);
                else weather.setWindy(Boolean.FALSE);
                if(weather.getPlayStatus())
                {
                    //popup yes
                    showDialog("No Problem ! You can Play");

                }
                else
                {
                    //no popup
                    showDialog("Oh No there are some problem! Please Stay Home ");

                }
            }
        });

        return view;
    }
    void showDialog(String message)
    {
        final Dialog dialog = new Dialog(WeatherFragment.this.getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.popup);
        //dialog.setTitle(name);


        // set the custom dialog components - text, image and button
        TextView status = (TextView) dialog.findViewById(R.id.status);
        status.setText(message);

        if(dialog!=null)
            dialog.show();
        Log.e("Alart Box","Null");
    }

}
