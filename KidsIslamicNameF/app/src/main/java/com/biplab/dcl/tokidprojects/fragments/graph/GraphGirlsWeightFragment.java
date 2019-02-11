package com.biplab.dcl.tokidprojects.fragments.graph;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.biplab.dcl.tokidprojects.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GraphGirlsWeightFragment extends Fragment {

    BarChart barChart;

    public GraphGirlsWeightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_graph_girls_weight, container, false);
        barChart = (BarChart) view.findViewById(R.id.bargraph2);


        ArrayList<BarEntry> height = new ArrayList<>();
        height.add(new BarEntry(12.0f,0));
        height.add(new BarEntry(14.2f,1));
        height.add(new BarEntry(15.4f,2));
        height.add(new BarEntry(17.9f,3));
        height.add(new BarEntry(19.9f,4));
        height.add(new BarEntry(22.4f,5));
        height.add(new BarEntry(25.8f,6));
        height.add(new BarEntry(28.1f,7));
        height.add(new BarEntry(31.9f,8));
        height.add(new BarEntry(36.9f,9));
        height.add(new BarEntry(41.5f,10));

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
        barChart.setData(theData);
        barChart.setFitsSystemWindows(true);
        barChart.invalidate();

        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);

        return view;
    }

}
