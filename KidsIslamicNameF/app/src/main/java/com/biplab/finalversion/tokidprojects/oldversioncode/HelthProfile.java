package com.biplab.dcl.tokidprojects.oldversioncode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.biplab.dcl.tokidprojects.R;

public class HelthProfile extends AppCompatActivity {

    TextView AgeM,WeigthM,HeigthM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helth_profile);

        AgeM = findViewById(R.id.Age2);
        WeigthM = findViewById(R.id.weigth);
        HeigthM = findViewById(R.id.height);


        Intent secondIntent = getIntent( );

        String age = secondIntent.getStringExtra("Age");

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
            AgeM.setText("New Born Baby Boy");
            WeigthM.setText("2.6 Kg");
            HeigthM.setText("47.1 cm");
        }
    }
}
