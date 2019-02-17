package com.biplab.dcl.tokidprojects.fragments.name;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.biplab.dcl.tokidprojects.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NameFragment extends Fragment {

    private CardView buttonB;
    private CardView buttonG;

    public NameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_name, container, false);

        buttonB = view.findViewById(R.id.buttonBoysN);
        buttonG = view.findViewById(R.id.buttonGirlsN);

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NameBoyFragment fragment = new NameBoyFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });

        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NameGirlsFragment fragment = new NameGirlsFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });

        return view;
    }

}
