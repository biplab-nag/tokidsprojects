package com.biplab.finalversion.tokidprojects.fragments.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.biplab.finalversion.tokidprojects.R;
import com.biplab.finalversion.tokidprojects.fragments.database.Profile;

import java.util.ArrayList;


public class ProfileAdapter extends ArrayAdapter<Profile> {

    public ProfileAdapter(Context context, ArrayList<Profile> profiles) {
        super(context, 0, profiles);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Profile profile = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rows_profile_item, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.name);
        // Populate the data into the template view using the data object
        tvName.setText(profile.getName());
        // Return the completed view to render on screen
        return convertView;
    }

}
