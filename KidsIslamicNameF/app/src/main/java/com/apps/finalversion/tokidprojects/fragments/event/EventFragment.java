package com.apps.finalversion.tokidprojects.fragments.event;


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
public class EventFragment extends Fragment {

    private CardView buttonNew;
    private CardView buttonAll;
    private CardView buttonToday;


    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_event, container, false);

        buttonNew = view.findViewById(R.id.buttonNew);
        buttonToday = view.findViewById(R.id.buttonToday);
        buttonAll = view.findViewById(R.id.buttonAll);

        buttonNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventNewFragment fragment = new EventNewFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });
        buttonToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventTodayFragment fragment = new EventTodayFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });
        buttonAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventAllFragment fragment = new EventAllFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                fragmentTransaction.commit();
            }
        });

        return  view;
    }

}
