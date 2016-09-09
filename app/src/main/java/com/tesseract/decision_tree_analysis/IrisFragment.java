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
public class IrisFragment extends Fragment {

    public Iris iris;
    EditText pw,pl,sw,sl;

    public IrisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_iris, container, false);

        iris=new Iris();

        pw= (EditText) view.findViewById(R.id.petelwedth);
        pl= (EditText) view.findViewById(R.id.petellenth);
        sw= (EditText) view.findViewById(R.id.sepalwidth);
        sl= (EditText) view.findViewById(R.id.sepallength);

        view.findViewById(R.id.genarate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    iris.setPetallength(Double.parseDouble(pl.getText().toString()));
                    iris.setPetalwidth(Double.parseDouble(pw.getText().toString()));
                    iris.setSepallength(Double.parseDouble(sl.getText().toString()));
                    iris.setSepalwidth(Double.parseDouble(sw.getText().toString()));
                    showDailog(iris.getIrisResult(),"Iris Class");
                }
                catch (Exception e)
                {
                    showDailog("Wrong Input","Error");
                }

            }
        });

        
        



        return view;
    }

    private void showDailog(String message,String title) {
        final Dialog dialog = new Dialog(IrisFragment.this.getContext());
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
