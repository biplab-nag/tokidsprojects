package com.apps.finalversion.tokidprojects.oldversioncode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.apps.finalversion.tokidprojects.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class HeightGraphBoyes extends AppCompatActivity {

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height_graph_boyes);

        barChart = (BarChart) findViewById(R.id.bargraph_boys);

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
        barChart.setData(theData);
        barChart.setFitsSystemWindows(true);
        barChart.invalidate();

        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);
    }
}
