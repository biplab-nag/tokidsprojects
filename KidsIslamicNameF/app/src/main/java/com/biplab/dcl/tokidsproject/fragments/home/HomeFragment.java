package com.biplab.dcl.tokidsproject.fragments.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.biplab.dcl.tokidsproject.R;
import com.biplab.dcl.tokidsproject.fragments.graph.GraphFragment;
import com.biplab.dcl.tokidsproject.fragments.health.HealthFragment;
import com.biplab.dcl.tokidsproject.fragments.name.NameFragment;


public class HomeFragment extends Fragment {

    private Button buttonN;
    private Button buttonH;
    private Button buttonG;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        buttonN = view.findViewById(R.id.buttonN);
        buttonH = view.findViewById(R.id.buttonH);
        buttonG = view.findViewById(R.id.buttonG);

        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NameFragment fragment = new NameFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });
        buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HealthFragment fragment = new HealthFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });
        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GraphFragment fragment = new GraphFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });


        return  view;
    }



}
