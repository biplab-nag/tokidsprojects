package com.apps.finalversion.tokidprojects.fragments.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.finalversion.tokidprojects.R;
import com.apps.finalversion.tokidprojects.fragments.event.EventFragment;
import com.apps.finalversion.tokidprojects.fragments.graph.GraphFragment;
import com.apps.finalversion.tokidprojects.fragments.health.HealthFragment;
import com.apps.finalversion.tokidprojects.fragments.name.NameFragment;


public class HomeFragment extends Fragment {

    private CardView buttonN;
    private CardView buttonH;
    private CardView buttonG;
    private CardView buttonE;

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
        buttonE = view.findViewById(R.id.buttonE);

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
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventFragment fragment = new EventFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });

        return  view;
    }



}
