package com.apps.finalversion.tokidprojects.fragments.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.apps.finalversion.tokidprojects.R;
import com.apps.finalversion.tokidprojects.fragments.database.Update;

import java.util.ArrayList;

public class UpdateAdapter extends ArrayAdapter<Update> {

    public UpdateAdapter(Context context, ArrayList<Update> updates) {
        super(context, 0, updates);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Update update = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rows_update_item, parent, false);
        }
        // Lookup view for data population
        TextView tvDate = (TextView) convertView.findViewById(R.id.date);
        TextView tvTime = (TextView) convertView.findViewById(R.id.time);
        TextView tvHeight = (TextView) convertView.findViewById(R.id.height);
        TextView tvWeight = (TextView) convertView.findViewById(R.id.weigth);
        TextView tvAge = (TextView) convertView.findViewById(R.id.age);
        // Populate the data into the template view using the data object
        tvDate.setText("Date: "+update.getDate());
        tvTime.setText("Time: "+update.getTime());
        tvHeight.setText("Height: "+update.getHeight()+" cm");
        tvWeight.setText("Weight: "+update.getWeight()+" kg");
        tvAge.setText("Age: "+update.getAge()+" year");
        // Return the completed view to render on screen
        return convertView;
    }
}
