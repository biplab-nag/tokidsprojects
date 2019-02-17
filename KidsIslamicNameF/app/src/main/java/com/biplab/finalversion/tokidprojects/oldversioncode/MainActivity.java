package com.biplab.finalversion.tokidprojects.oldversioncode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.biplab.finalversion.tokidprojects.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button4);
        Button button2 = findViewById(R.id.button3);
        Button button3 = findViewById(R.id.button5);
        Button button4 = findViewById(R.id.button6);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBoysName();


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGirlsName();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBoysFlowchart();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGirlsFlowchart();

            }
        });
    }

    public void openBoysName(){
        Intent intent = new Intent(this, BoysName.class);
        startActivity(intent);
    }

    public void openGirlsName(){
        Intent intent2 = new Intent(this, GirlsName.class);
        startActivity(intent2);
    }
    public void openBoysFlowchart(){
        Intent intent3 = new Intent(this, BoysFlowchart.class);
        startActivity(intent3);
    }
    public void openGirlsFlowchart(){
        Intent intent4 = new Intent(this, GirlsFlowchart.class);
        startActivity(intent4);
    }

    public void button7(View view) {
        Intent intent = new Intent(this, WeightGraphMain.class);
        startActivity(intent);
    }

    public void button8(View view) {

        Intent intent = new Intent(this, HeightGraphMain.class);
        startActivity(intent);
    }
}
