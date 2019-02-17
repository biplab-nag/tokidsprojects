package com.apps.finalversion.tokidprojects.fragments.event;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.apps.finalversion.tokidprojects.R;
import com.apps.finalversion.tokidprojects.fragments.database.DatabaseSource;
import com.apps.finalversion.tokidprojects.fragments.database.Event;
import com.apps.finalversion.tokidprojects.fragments.notification.NotificationService;

import java.util.Calendar;

import static android.content.Context.INPUT_METHOD_SERVICE;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventNewFragment extends Fragment {

    private EditText titleET;
    private Button btn_date;
    private Button btn_save;

    private int day=0;
    private int month=0;
    private int year=0;

    private DatabaseSource source;
    DatePickerDialog  dialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_event_new, container, false);

        getActivity().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        titleET = view.findViewById(R.id.title);
        btn_date = view.findViewById(R.id.date);
        btn_save = view.findViewById(R.id.save);


        source = new DatabaseSource(getContext());



        btn_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    InputMethodManager imm = (InputMethodManager)getContext().getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }

                Calendar newCalendar = Calendar.getInstance();
                dialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {

                    public void onDateSet(DatePicker view, int y, int monthOfYear, int dayOfMonth) {
                        Calendar newDate = Calendar.getInstance();
                        newDate.set(y, monthOfYear, dayOfMonth);
                        day = dayOfMonth;
                        month = monthOfYear+1;
                        year = y;
                        btn_date.setText(day+"/"+month+"/"+year);
                    }

                }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
                dialog.show();
            }


        });

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    InputMethodManager imm = (InputMethodManager)getContext().getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }

                if (day != 0 && month !=0 && year !=0){
                    Event event = new Event(titleET.getText().toString(),day,month,year);
                    boolean complete = source.insertEvent(event);
                    if (complete){
                        getActivity().startService(new Intent(getActivity(),NotificationService.class));

                        EventAllFragment fragment = new EventAllFragment();
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.mainFragmentContainer,fragment);
                        fragmentTransaction.commit();
                    }
                    else {
                        Toast.makeText(getContext(), "Something Wrong, try again", Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(getContext(), "Something Wrong, try again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return  view;
    }


}
