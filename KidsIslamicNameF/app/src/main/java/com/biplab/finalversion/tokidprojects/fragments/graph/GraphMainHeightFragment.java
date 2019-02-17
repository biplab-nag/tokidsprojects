package com.biplab.finalversion.tokidprojects.fragments.graph;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.biplab.finalversion.tokidprojects.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GraphMainHeightFragment extends Fragment {


    private CardView buttonB;
    private CardView buttonG;


    public GraphMainHeightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_graph_main_height, container, false);

        buttonB = view.findViewById(R.id.buttonBoy);
        buttonG= view.findViewById(R.id.buttonGirl);

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GraphBoyHeightFragment fragment = new GraphBoyHeightFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });

        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GraphGirlsHeightFragment fragment = new GraphGirlsHeightFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });
        return view;
    }

}
