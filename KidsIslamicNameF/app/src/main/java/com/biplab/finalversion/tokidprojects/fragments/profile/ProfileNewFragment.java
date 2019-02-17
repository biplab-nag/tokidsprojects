package com.biplab.finalversion.tokidprojects.fragments.profile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.biplab.finalversion.tokidprojects.R;
import com.biplab.finalversion.tokidprojects.fragments.database.DatabaseSource;
import com.biplab.finalversion.tokidprojects.fragments.database.Profile;

import static android.content.Context.INPUT_METHOD_SERVICE;


public class ProfileNewFragment extends Fragment {

    private Button buttonSave;
    private EditText nameET;
    private EditText ageET;
    private EditText heightET;
    private EditText weightET;
    private DatabaseSource source;
    private Spinner genderSP;
    String gender;

    public ProfileNewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile_new, container, false);

        getActivity().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        source = new DatabaseSource(getContext());

        buttonSave = view.findViewById(R.id.save);
        nameET = view.findViewById(R.id.name);
        ageET = view.findViewById(R.id.age);
        heightET = view.findViewById(R.id.height);
        weightET = view.findViewById(R.id.weigth);
        genderSP = view.findViewById(R.id.gender);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSP.setAdapter(adapter);



        genderSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                try {
                    InputMethodManager imm = (InputMethodManager)getContext().getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }

                if (position==0){
                    gender = "Boy";
                }
                else {
                    gender = "Girl";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gender = "Boy";
            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    InputMethodManager imm = (InputMethodManager)getContext().getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                String name = nameET.getText().toString();
                Double age =  Double.valueOf(ageET.getText().toString());
                Double height =  Double.valueOf(heightET.getText().toString());
                Double weight =  Double.valueOf(weightET.getText().toString());

                saveToDB(name,age,gender,height,weight);
            }
        });


        return view;
    }

    private void saveToDB(String name, Double age, String gender, Double height, Double weight) {
        Profile profile = new Profile(name,age,gender,height,weight);
        boolean check = source.insertChild(profile);

        if (check){
            ProfileFragment fragment = new ProfileFragment();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
            fragmentTransaction.commit();
        }
        else {
            Toast.makeText(getContext(),
                    "Somthing Wrong, Please Try Again", Toast.LENGTH_SHORT).show();
        }

    }


}
