package com.biplab.dcl.tokidsproject.fragments.graph;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.biplab.dcl.tokidsproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GraphMainWeightFragment extends Fragment {


    private Button buttonB;
    private Button buttonG;

    public GraphMainWeightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_graph_main_weight, container, false);

        buttonB = view.findViewById(R.id.buttonBoy);
        buttonG= view.findViewById(R.id.buttonGirl);

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GraphBoyWeightFragment fragment = new GraphBoyWeightFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });

        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GraphGirlsWeightFragment fragment = new GraphGirlsWeightFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });


        return view;
    }

}
