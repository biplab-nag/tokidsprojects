package com.apps.finalversion.tokidprojects.fragments.profile;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.apps.finalversion.tokidprojects.R;
import com.apps.finalversion.tokidprojects.fragments.database.DatabaseSource;
import com.apps.finalversion.tokidprojects.fragments.database.Profile;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    private Button buttonCreate;


    ArrayList<Profile> profiles = new ArrayList<>();
    ListView listView;
    private static ProfileAdapter adapter;

    DatabaseSource source;


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        buttonCreate = view.findViewById(R.id.create);
        listView=view.findViewById(R.id.list);


        source = new DatabaseSource(getContext());
        profiles = source.getAllChild();


        adapter= new ProfileAdapter(getContext(),profiles);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Profile profile= profiles.get(position);
                ProfileDetailsFragment fragment = new ProfileDetailsFragment(profile.getId());
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment).addToBackStack("my_fargment");
                fragmentTransaction.commit();


            }
        });

        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProfileNewFragment fragment = new ProfileNewFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainFragmentContainer,fragment).addToBackStack("my_fargment");
                fragmentTransaction.commit();
            }
        });


        return view;
    }

}
