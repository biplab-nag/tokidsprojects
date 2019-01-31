package com.biplab.dcl.tokidsproject.fragments.profile;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.biplab.dcl.tokidsproject.R;
import com.biplab.dcl.tokidsproject.fragments.database.DatabaseSource;
import com.biplab.dcl.tokidsproject.fragments.database.Profile;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileDetailsFragment extends Fragment {

    private int id;
    private TextView nameTV;
    private TextView genderTV;
    private TextView ageTV;
    private TextView heightTV;
    private TextView weightTV;
    private DatabaseSource source;
    private Button buttonEdit;
    private Button buttonDelete;
    private TextView AgeM;
    private TextView WeigthM;
    private TextView HeigthM;


    public ProfileDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public ProfileDetailsFragment(int id) {
        this.id = id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profile_details, container, false);

        nameTV = view.findViewById(R.id.name);
        ageTV = view.findViewById(R.id.age);
        genderTV = view.findViewById(R.id.gender);
        heightTV = view.findViewById(R.id.height);
        weightTV = view.findViewById(R.id.weigth);
        buttonEdit = view.findViewById(R.id.edit);
        buttonDelete = view.findViewById(R.id.delete);

        AgeM = view.findViewById(R.id.sage);
        WeigthM = view.findViewById(R.id.sweight);
        HeigthM = view.findViewById(R.id.sheight);


        source = new DatabaseSource(getContext());


        Profile profile = source.getChildbyID(id);

        nameTV.setText(String.valueOf("Name : "+profile.getName()));
        ageTV.setText(String.valueOf("Age : "+profile.getAge() + " years"));
        genderTV.setText(String.valueOf("Gender : "+profile.getGender()  ));
        heightTV.setText(String.valueOf("Height : "+profile.getHeight()+" cm"));
        weightTV.setText(String.valueOf("Weight : "+profile.getWeight()+" kg"));

        if (profile.getGender().equals("Boy")){
            compareForBoy(profile.getAge());
        }
        else {
            compareForGirl(profile.getAge());

        }


        buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProfileEditFragment fragment = new ProfileEditFragment(id);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                source.deleteChild(id);

                ProfileFragment fragment = new ProfileFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });

        return view;
    }

    private void compareForGirl(double age_m) {

        if(age_m == .6){
            AgeM.setText("6 Months");
            WeigthM.setText("Weight "+"6.7 Kg");
            HeigthM.setText("Height "+"64.7 cm");

        }
        else if(age_m == 1){

            AgeM.setText(" 1 Year");
            WeigthM.setText("Weight "+"8.4 kg");
            HeigthM.setText("Height "+"73.9 cm");
        }
        else if(age_m == 2){

            AgeM.setText(" 2 Years");
            WeigthM.setText("Weight "+"10.1 kg");
            HeigthM.setText("Height "+"81.6 cm");
        }
        else if(age_m == 3){

            AgeM.setText(" 3 Years");
            WeigthM.setText("Weight "+"11.8 kg");
            HeigthM.setText("Height "+"88.9 cm");
        }
        else if(age_m == 4){

            AgeM.setText(" 4 Years");
            WeigthM.setText("Weight "+"13.5 kg");
            HeigthM.setText("Height "+"96 cm");
        }
        else if(age_m == 5){

            AgeM.setText(" 5 Years");
            WeigthM.setText("Weight "+"14.8 kg");
            HeigthM.setText("Height "+"102.1 cm");
        }

        else {
            AgeM.setText("New Born Baby Boy");
            WeigthM.setText("Weight "+"2.6 Kg");
            HeigthM.setText("Height "+"47.1 cm");
        }
    }

    private void compareForBoy(double age_m) {
        if(age_m == .6){
            AgeM.setText("6 Months");
            WeigthM.setText("Weight "+"6.7 Kg");
            HeigthM.setText("Height "+"64.7 cm");

        }
        else if(age_m == 1){

            AgeM.setText(" 1 Year");
            WeigthM.setText("Weight "+"8.4 kg");
            HeigthM.setText("Height "+"73.9 cm");
        }
        else if(age_m == 2){

            AgeM.setText(" 2 Years");
            WeigthM.setText("Weight "+"10.1 kg");
            HeigthM.setText("Height "+"81.6 cm");
        }
        else if(age_m == 3){

            AgeM.setText(" 3 Years");
            WeigthM.setText("Weight "+"11.8 kg");
            HeigthM.setText("Height "+"88.9 cm");
        }
        else if(age_m == 4){

            AgeM.setText(" 4 Years");
            WeigthM.setText("Weight "+"13.5 kg");
            HeigthM.setText("Height "+"96 cm");
        }
        else if(age_m == 5){

            AgeM.setText(" 5 Years");
            WeigthM.setText("Weight "+"14.8 kg");
            HeigthM.setText("Height "+"102.1 cm");
        }

        else {
            AgeM.setText("New Born Baby Boy");
            WeigthM.setText("Weight "+"2.6 Kg");
            HeigthM.setText("Height "+"47.1 cm");
        }
    }

}
