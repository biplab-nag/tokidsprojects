package com.apps.finalversion.tokidprojects.oldversioncode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.apps.finalversion.tokidprojects.R;

public class BoysFlowchart extends AppCompatActivity {

    EditText ageM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys_flowchart);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ageM= findViewById(R.id.age);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void submit(View view) {

        String age=ageM.getText().toString();

        if(!TextUtils.isEmpty(age)){

            //double age_m= Double.parseDouble(age);

            Intent intent = new Intent(BoysFlowchart.this,HelthProfile.class);

            intent.putExtra("Age",age);
            startActivity(intent);


        }
        else {
            Toast.makeText(this, "Enter Child Age First", Toast.LENGTH_SHORT).show();

        }


    }
}
