package com.biplab.dcl.tokidsproject.oldversioncode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.biplab.dcl.tokidsproject.R;

public class WeightGraphMain extends AppCompatActivity {

    private int count21 = 0;
    private int res = 0;
    RadioGroup RG21;
    Button ShowWe;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_graph_main);

       RG21= (RadioGroup) findViewById(R.id.RB21);

       ShowWe = findViewById(R.id.showW);

        ShowWe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=RG21.getCheckedRadioButtonId();
                radioButton=(RadioButton)findViewById(selectedId);
                if(radioButton.getText().toString().isEmpty()){
                    Toast.makeText(WeightGraphMain.this, "Select Boys or Girls.....!", Toast.LENGTH_SHORT).show();

                }
                else {
                    if(radioButton.getText().toString().equals("Boys")){
                        Intent intent;
                        intent = new Intent(WeightGraphMain.this, WeightGraphBoyes.class);
                        startActivity(intent);
                        finish();
                    }
                    else if(radioButton.getText().toString().equals("Girls")) {
                        Intent intent = new Intent(WeightGraphMain.this, WeightGraph.class);
                        startActivity(intent);
                        finish();
                    }
                }



            }
        });
    }
}
