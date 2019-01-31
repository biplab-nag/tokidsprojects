package com.biplab.dcl.tokidsproject.fragments.event;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.biplab.dcl.tokidsproject.R;
import com.biplab.dcl.tokidsproject.fragments.database.DatabaseSource;
import com.biplab.dcl.tokidsproject.fragments.database.Event;
import com.biplab.dcl.tokidsproject.fragments.database.Profile;
import com.biplab.dcl.tokidsproject.fragments.profile.ProfileAdapter;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventAllFragment extends Fragment {

    ArrayList<Event> events = new ArrayList<>();

    ListView listView;
    private static EventAdapter adapter;
    DatabaseSource source;


    public EventAllFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_event_all, container, false);

        listView=view.findViewById(R.id.list);

        source = new DatabaseSource(getContext());
        events = source.getAllEvents();



        adapter= new EventAdapter(getContext(),events,this);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return  view;
    }
    public void deleteEvent( ) {

        EventAllFragment fragment = new EventAllFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
        fragmentTransaction.commit();
    }


}
