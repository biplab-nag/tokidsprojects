package com.apps.finalversion.tokidprojects.oldversioncode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.apps.finalversion.tokidprojects.R;

public class HeightGraphMain extends AppCompatActivity {

    RadioGroup RG21;
    Button ShowWe;
    private RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height_graph_main);

        RG21= (RadioGroup) findViewById(R.id.RB22);
        ShowWe = findViewById(R.id.showH);

        ShowWe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=RG21.getCheckedRadioButtonId();
                radioButton=(RadioButton)findViewById(selectedId);
                if(radioButton.getText().toString().isEmpty()){
                    Toast.makeText(HeightGraphMain.this, "Select Boys or Girls.....!", Toast.LENGTH_SHORT).show();

                }
                else {
                    if(radioButton.getText().toString().equals("Boys")){
                        Intent intent;
                        intent = new Intent(HeightGraphMain.this, HeightGraphBoyes.class);
                        startActivity(intent);
                        finish();
                    }
                    else if(radioButton.getText().toString().equals("Girls")) {
                        Intent intent = new Intent(HeightGraphMain.this, HeightGraph.class);
                        startActivity(intent);
                        finish();
                    }
                }



            }
        });
    }


}
