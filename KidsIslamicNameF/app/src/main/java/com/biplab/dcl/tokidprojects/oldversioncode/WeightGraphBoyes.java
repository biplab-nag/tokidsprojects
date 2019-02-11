package com.biplab.dcl.tokidprojects.oldversioncode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.biplab.dcl.tokidprojects.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class WeightGraphBoyes extends AppCompatActivity {

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_graph_boyes);

        barChart = (BarChart) findViewById(R.id.bargraph2_boys);


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
        barChart.setData(theData);
        barChart.setFitsSystemWindows(true);
        barChart.invalidate();

        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);
    }
}
