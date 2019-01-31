package com.biplab.dcl.tokidsproject.fragments.health;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.biplab.dcl.tokidsproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HealthMainBoyFragment extends Fragment {

    private Button button;
    EditText ageM;
    TextView AgeM,WeigthM,HeigthM;
    LinearLayout layout;


    public HealthMainBoyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_health_main_boy, container, false);

        getActivity().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        ageM= view.findViewById(R.id.age);
        button= view.findViewById(R.id.chek);
        AgeM = view.findViewById(R.id.Age2);
        WeigthM = view.findViewById(R.id.weigth);
        HeigthM = view.findViewById(R.id.height);
        layout = view.findViewById(R.id.layout);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age=ageM.getText().toString();
                if(!TextUtils.isEmpty(age))
                {
                    checkHealth(age);
                }
                else
                    {

                        Toast.makeText(getContext(), "Enter Child Age First", Toast.LENGTH_SHORT).show();
                    }
            }
        });



        return view;
    }

    private void checkHealth(String age) {
        layout.setVisibility(View.VISIBLE);
        double age_m= Double.parseDouble(age);

        if(age_m == .6){
            AgeM.setText("6 Months");
            WeigthM.setText("6.7 Kg");
            HeigthM.setText("64.7 cm");

        }
        else if(age_m == 1){

            AgeM.setText(" 1 Year");
            WeigthM.setText("8.4 kg");
            HeigthM.setText("73.9 cm");
        }
        else if(age_m == 2){

            AgeM.setText(" 2 Years");
            WeigthM.setText("10.1 kg");
            HeigthM.setText("81.6 cm");
        }
        else if(age_m == 3){

            AgeM.setText(" 3 Years");
            WeigthM.setText("11.8 kg");
            HeigthM.setText("88.9 cm");
        }
        else if(age_m == 4){

            AgeM.setText(" 4 Years");
            WeigthM.setText("13.5 kg");
            HeigthM.setText("96 cm");
        }
        else if(age_m == 5){

            AgeM.setText(" 5 Years");
            WeigthM.setText("14.8 kg");
            HeigthM.setText("102.1 cm");
        }

        else {
            AgeM.setText("New Born Baby Boy");
            WeigthM.setText("2.6 Kg");
            HeigthM.setText("47.1 cm");
        }
    }

}
