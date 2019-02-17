package com.biplab.finalversion.tokidprojects.fragments.profile;


import android.annotation.SuppressLint;
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
import com.biplab.finalversion.tokidprojects.fragments.database.Update;

import java.util.Calendar;

import static android.content.Context.INPUT_METHOD_SERVICE;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileEditFragment extends Fragment {


    private  int id;

    private EditText nameET;
    private EditText ageET;
    private EditText heightET;
    private EditText weightET;
    private Button buttonUpdate;
    String gender;
    private Spinner genderSP;
    private Profile profile;
    private DatabaseSource source;


    public ProfileEditFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public ProfileEditFragment(int id) {
        this.id = id;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_edit, container, false);

        getActivity().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        buttonUpdate = view.findViewById(R.id.save);
        nameET = view.findViewById(R.id.name);
        ageET = view.findViewById(R.id.age);
        heightET = view.findViewById(R.id.height);
        weightET = view.findViewById(R.id.weigth);
        genderSP = view.findViewById(R.id.gender);

        source = new DatabaseSource(getContext());
        profile = source.getChildbyID(id);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSP.setAdapter(adapter);

        if (profile.getGender().equals("Boy")){
            genderSP.setSelection(0);
        }
        else {
            genderSP.setSelection(1);
        }

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
                gender = profile.getGender();
            }
        });

        nameET.setText(String.valueOf(profile.getName()));
        ageET.setText(String.valueOf(profile.getAge()));
        heightET.setText(String.valueOf(profile.getHeight()));
        weightET.setText(String.valueOf(profile.getWeight()));


        buttonUpdate.setOnClickListener(new View.OnClickListener() {
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

                updateProfile(name,age,gender,height,weight);
              //  updateDB(id,name,age,gender,height,weight);

            }
        });

        return  view;
    }

    private void updateProfile( String name, Double age,String gender, Double height, Double weight) {

        Calendar newCalendar = Calendar.getInstance();
        int year = newCalendar.get(Calendar.YEAR);
        int month = newCalendar.get(Calendar.MONTH)+1;
        int day = newCalendar.get(Calendar.DAY_OF_MONTH);
        int hour = newCalendar.get(Calendar.HOUR);
        int min = newCalendar.get(Calendar.MINUTE);
        String date = day+"/"+month+"/"+year;
        String time = hour+":"+min;


        Update update = new Update(id,name,age,gender,height,weight,date,time);

        boolean check = source.updateChildInfo(update,profile);
        if (check){
            ProfileDetailsFragment fragment = new ProfileDetailsFragment(id);
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
