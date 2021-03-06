package com.apps.finalversion.tokidprojects.fragments.graph;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.finalversion.tokidprojects.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GraphFragment extends Fragment {

    private CardView buttonH;
    private CardView buttonW;

    public GraphFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_graph, container, false);

        buttonH = view.findViewById(R.id.buttonHeight);
        buttonW = view.findViewById(R.id.buttonWeight);

        buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GraphMainHeightFragment fragment = new GraphMainHeightFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment).addToBackStack("my_fargment");
                fragmentTransaction.commit();
            }
        });

        buttonW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GraphMainWeightFragment fragment = new GraphMainWeightFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment).addToBackStack("my_fargment");
                fragmentTransaction.commit();
            }
        });

        return view;
    }



}
