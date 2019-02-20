package com.apps.finalversion.tokidprojects.fragments.health;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.apps.finalversion.tokidprojects.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

import static android.content.Context.INPUT_METHOD_SERVICE;

/**
 * A simple {@link Fragment} subclass.
 */
public class HealthMainBoyFragment extends Fragment {

    private Button button;
    EditText ageM;
    TextView AgeM,WeigthM,HeigthM;
    LinearLayout layout;


    BarChart barChartH;
    BarChart barChartW;

    public HealthMainBoyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_health_main_boy, container, false);

        getActivity().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        ageM= view.findViewById(R.id.age);
        button= view.findViewById(R.id.chek);
        AgeM = view.findViewById(R.id.Age2);
        WeigthM = view.findViewById(R.id.weigth);
        HeigthM = view.findViewById(R.id.height);
        layout = view.findViewById(R.id.layout);

        barChartH = (BarChart) view.findViewById(R.id.bargraph_boys);
        barChartW = (BarChart) view.findViewById(R.id.bargraph2_boys);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age=ageM.getText().toString();
                if(!TextUtils.isEmpty(age))
                {
                    try {
                        InputMethodManager imm = (InputMethodManager)getContext().getSystemService(INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }

                    showHeightChart(age);
                    showWeightChart(age);
                    checkHealth(age);

                }
                else
                    {

                        Toast.makeText(getContext(), "Enter Child Age First", Toast.LENGTH_SHORT).show();
                    }
            }
        });



        return view;
    }

    private void showWeightChart(String age) {
        ArrayList<BarEntry> height = new ArrayList<>();
        height.add(new BarEntry(13.0f,0));
        height.add(new BarEntry(15.2f,1));
        height.add(new BarEntry(16.4f,2));
        height.add(new BarEntry(18.9f,3));
        height.add(new BarEntry(19.9f,4));
        height.add(new BarEntry(23.4f,5));
        height.add(new BarEntry(25.8f,6));
        height.add(new BarEntry(29.1f,7));
        height.add(new BarEntry(33.9f,8));
        height.add(new BarEntry(37.9f,9));
        height.add(new BarEntry(43.5f,10));

        BarDataSet barDataSet = new BarDataSet(height,"Weight in Kg");


        ArrayList<String> theDates = new ArrayList<>();
        theDates.add("2Year");
        theDates.add("3Year");
        theDates.add("4Year");
        theDates.add("5Year");
        theDates.add("6Year");
        theDates.add("7Year");
        theDates.add("8Year");
        theDates.add("9Year");
        theDates.add("10Year");
        theDates.add("11Year");
        theDates.add("12Year");

        BarData theData = new BarData(theDates, barDataSet);
        barChartW.setData(theData);
        barChartW.setFitsSystemWindows(true);
        barChartW.invalidate();

        double age_m= Double.parseDouble(age);



        for (int i =0 ; i<11 ;i++){
            if (age_m == i+2)
            {
                barChartW.highlightValue(i,0);
            }

        }



        barChartW.setTouchEnabled(false);
        barChartW.setDragEnabled(false);
        barChartW.setScaleEnabled(false);

    }

    private void showHeightChart(String age) {

        ArrayList<BarEntry> height = new ArrayList<>();
        height.add(new BarEntry(35.7f,0));
        height.add(new BarEntry(39.0f,1));
        height.add(new BarEntry(41.5f,2));
        height.add(new BarEntry(43.5f,3));
        height.add(new BarEntry(47.5f,4));
        height.add(new BarEntry(49.7f,5));
        height.add(new BarEntry(52.5f,6));
        height.add(new BarEntry(55.5f,7));
        height.add(new BarEntry(57.5f,8));
        height.add(new BarEntry(59.7f,9));
        height.add(new BarEntry(62.0f,10));

        BarDataSet barDataSet = new BarDataSet(height,"Height in inch");

        ArrayList<String> theDates = new ArrayList<>();
        theDates.add("2Year");
        theDates.add("3Year");
        theDates.add("4Year");
        theDates.add("5Year");
        theDates.add("6Year");
        theDates.add("7Year");
        theDates.add("8Year");
        theDates.add("9Year");
        theDates.add("10Year");
        theDates.add("11Year");
        theDates.add("12Year");

        BarData theData = new BarData(theDates, barDataSet);
        barChartH.setData(theData);
        barChartH.setFitsSystemWindows(true);
        barChartH.invalidate();

        double age_m= Double.parseDouble(age);



        for (int i =0 ; i<11 ;i++){
            if (age_m == i+2)
            {
                barChartH.highlightValue(i,0);
            }
        }

        barChartH.setTouchEnabled(false);
        barChartH.setDragEnabled(false);
        barChartH.setScaleEnabled(true);

    }

    private void checkHealth(String age) {
        layout.setVisibility(View.VISIBLE);
        double age_m= Double.parseDouble(age);

        if(age_m == .6){
            AgeM.setText("6 Months");
            WeigthM.setText("6.7 Kg");
            HeigthM.setText("64.7 cm");

        }
        else if(age_m == 1){

            AgeM.setText(" 1 Year");
            WeigthM.setText("8.4 kg");
            HeigthM.setText("73.9 cm");
        }
        else if(age_m == 2){

            AgeM.setText(" 2 Years");
            WeigthM.setText("10.1 kg");
            HeigthM.setText("81.6 cm");
        }
        else if(age_m == 3){

            AgeM.setText(" 3 Years");
            WeigthM.setText("11.8 kg");
            HeigthM.setText("88.9 cm");
        }
        else if(age_m == 4){

            AgeM.setText(" 4 Years");
            WeigthM.setText("13.5 kg");
            HeigthM.setText("96 cm");
        }
        else if(age_m == 5){

            AgeM.setText(" 5 Years");
            WeigthM.setText("14.8 kg");
            HeigthM.setText("102.1 cm");
        }
        else {
            AgeM.setText("data not found");
            WeigthM.setText("~ Kg");
            HeigthM.setText("~ cm");

            barChartH.highlightValue(-1,0);
            barChartW.highlightValue(-1,0);
        }
    }

}
