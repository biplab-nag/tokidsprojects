package com.biplab.finalversion.tokidprojects.fragments.event;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.biplab.finalversion.tokidprojects.R;
import com.biplab.finalversion.tokidprojects.fragments.database.DatabaseSource;
import com.biplab.finalversion.tokidprojects.fragments.database.Event;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventTodayFragment extends Fragment {

    ArrayList<Event> events = new ArrayList<>();
    ListView listView;
    private static EventAdapter adapter;
    DatabaseSource source;
    ArrayList<Event> eventsToday = new ArrayList<>();

    public EventTodayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_event_today, container, false);

        listView=view.findViewById(R.id.list);

        source = new DatabaseSource(getContext());
        events = source.getAllEvents();

        Calendar newCalendar = Calendar.getInstance();
        int year = newCalendar.get(Calendar.YEAR);
        int month = newCalendar.get(Calendar.MONTH)+1;
        int day = newCalendar.get(Calendar.DAY_OF_MONTH);

        for (int i=0; i<events.size() ; i++){
            if (events.get(i).getDay() == day && events.get(i).getMonth() == month && events.get(i).getYear() == year ){
                eventsToday.add(events.get(i));
            }
        }

        adapter= new EventAdapter(getContext(),eventsToday,this);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return  view;
    }

    public void deleteEvent( ) {

        EventTodayFragment fragment = new EventTodayFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
        fragmentTransaction.commit();
    }

}
