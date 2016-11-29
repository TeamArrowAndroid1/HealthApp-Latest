package com.arrowhc.harry.arrowhc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Add_patients extends AppCompatActivity {

    Button GoToAddpatient;
    Spinner sp;
    ArrayAdapter<CharSequence> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_patients);
        //GoToAddpatient = (Button) findViewById(R.id.add_patients);
        sp = (Spinner) findViewById(R.id.spinner2);
        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.department, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(arrayAdapter);
        TextView useridd = (TextView) findViewById(R.id.didedittext);
        String user = getIntent().getStringExtra("doc");
        if (user != null) {
            useridd.setText(user);
        }

        GoToAddpatient = (Button) findViewById(R.id.add_patients);

        GoToAddpatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getBaseContext(), Staff_Activity.class);

                startActivity(intent);

            }


        });
    }
}

