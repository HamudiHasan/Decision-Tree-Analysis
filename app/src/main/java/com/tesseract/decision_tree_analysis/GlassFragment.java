package com.tesseract.decision_tree_analysis;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GlassFragment extends Fragment {


    EditText Mg,Al,Si,K,Ca,Ba,Fe;
    public GlassFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_glass, container, false);
        Mg= (EditText) view.findViewById(R.id.mg);
        Al= (EditText) view.findViewById(R.id.al);
        Si= (EditText) view.findViewById(R.id.si);
        K= (EditText) view.findViewById(R.id.k);
        Ca= (EditText) view.findViewById(R.id.ca);
        Ba= (EditText) view.findViewById(R.id.ba);
        Fe= (EditText) view.findViewById(R.id.fe);
        view.findViewById(R.id.genarate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glass glass=new Glass();
                try{
                    glass.setMg(Double.parseDouble(Mg.getText().toString()));
                    glass.setAl(Double.parseDouble(Al.getText().toString()));
                    glass.setSi(Double.parseDouble(Si.getText().toString()));
                    glass.setK(Double.parseDouble(K.getText().toString()));
                    glass.setCa(Double.parseDouble(Ca.getText().toString()));
                    glass.setBa(Double.parseDouble(Ba.getText().toString()));
                    glass.setFe(Double.parseDouble(Fe.getText().toString()));
                    showDailog(glass.getGlassResult(),"Type of Glass");
                }
                catch (Exception ex){
                    showDailog("Please fill all info","Error");
                }

            }
        });




        return view;
    }
    private void showDailog(String message,String title) {
        final Dialog dialog = new Dialog(GlassFragment.this.getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.popup);
        //dialog.setTitle(name);


        // set the custom dialog components - text, image and button
        TextView status = (TextView) dialog.findViewById(R.id.status);
        TextView wtitle = (TextView) dialog.findViewById(R.id.title);
        status.setText(message);
        wtitle.setText(title);

        if(dialog!=null)
            dialog.show();
        Log.e("Alart Box","Null");
    }

}
