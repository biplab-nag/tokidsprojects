package com.biplab.dcl.tokidprojects.fragments.event;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.biplab.dcl.tokidprojects.R;
import com.biplab.dcl.tokidprojects.fragments.database.DatabaseSource;
import com.biplab.dcl.tokidprojects.fragments.database.Event;

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<Event> {

    Context context;
    EventAllFragment fragment;
    EventTodayFragment todayFragment;

    public EventAdapter(Context context, ArrayList<Event> events , EventTodayFragment fragment) {
        super(context, 0, events);
        this.context = context;
        this.todayFragment = fragment;

    }


    public EventAdapter(Context context, ArrayList<Event> events , EventAllFragment fragment) {
        super(context, 0, events);
        this.context = context;
        this.fragment = fragment;

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        final Event event = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rows_event_item, parent, false);
        }


        if (fragment==null){
            TextView tvName = (TextView) convertView.findViewById(R.id.name);
            TextView tvDate = (TextView) convertView.findViewById(R.id.date);
            // Populate the data into the template view using the data object
            tvName.setText("Event Date : "+event.getTitle());
            tvDate.setText("Event Name : "+event.getDay()+"/"+event.getMonth()+"/"+event.getYear());
            // Return the completed view to render on screen
            ImageButton button = convertView.findViewById(R.id.delete);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DatabaseSource source = new DatabaseSource(getContext());

                    boolean delete = source.deleteEvent(event.getId());
                    if (delete){
                        Toast.makeText(getContext(), "Successfully deleted", Toast.LENGTH_SHORT).show();
                        todayFragment.deleteEvent();
                    }
                    else {
                        Toast.makeText(getContext(), "Cant delete this time", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }
        else {
            TextView tvName = (TextView) convertView.findViewById(R.id.name);
            TextView tvDate = (TextView) convertView.findViewById(R.id.date);
            // Populate the data into the template view using the data object
            tvName.setText("Event Date : "+event.getTitle());
            tvDate.setText("Event Name : "+event.getDay()+"/"+event.getMonth()+"/"+event.getYear());
            // Return the completed view to render on screen
            ImageButton button = convertView.findViewById(R.id.delete);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DatabaseSource source = new DatabaseSource(getContext());

                    boolean delete = source.deleteEvent(event.getId());
                    if (delete){
                        fragment.deleteEvent();
                    }
                    else {
                        Toast.makeText(getContext(), "Cant delete this time", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }


        // Lookup view for data population

        return convertView;
    }
}
