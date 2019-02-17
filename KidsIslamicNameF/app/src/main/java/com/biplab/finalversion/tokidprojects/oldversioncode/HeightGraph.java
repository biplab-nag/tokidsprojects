package com.biplab.dcl.tokidprojects.oldversioncode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.biplab.dcl.tokidprojects.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class HeightGraph extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height_graph);

        barChart = (BarChart) findViewById(R.id.bargraph);

        ArrayList<BarEntry> height = new ArrayList<>();
        height.add(new BarEntry(33.7f,0));
        height.add(new BarEntry(37.0f,1));
        height.add(new BarEntry(39.5f,2));
        height.add(new BarEntry(42.5f,3));
        height.add(new BarEntry(45.5f,4));
        height.add(new BarEntry(47.7f,5));
        height.add(new BarEntry(50.5f,6));
        height.add(new BarEntry(52.5f,7));
        height.add(new BarEntry(54.5f,8));
        height.add(new BarEntry(56.7f,9));
        height.add(new BarEntry(59.0f,10));

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
        barChart.setData(theData);
        barChart.setFitsSystemWindows(true);
        barChart.invalidate();

        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);
    }

}
