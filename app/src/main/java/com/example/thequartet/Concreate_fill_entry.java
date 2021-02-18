package com.example.thequartet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Concreate_fill_entry extends AppCompatActivity {
    Button cButton;
    Button cal2;
    TextView cl, cb, ch;
    TextView R1, R2, R3;
    AutoCompleteTextView G;

    private static final String[] Grade = new String[]{
            "M 5", "M 7.5", "M 10", "M 15", "M 20", "M 25"
    };
    private static DecimalFormat dff = new DecimalFormat("###.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concreate_fill_entry);
        G = findViewById(R.id.grade);
        cl = findViewById(R.id.clength);
        cb = findViewById(R.id.cbreath);
        ch = findViewById(R.id.cheight);
        cal2 = (Button) findViewById(R.id.cal2);
        R1 = findViewById(R.id.c_result);
        R2 = findViewById(R.id.c_result1);
        R3 = findViewById(R.id.c_result2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, Grade);
        G.setAdapter(adapter);
        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G.showDropDown();
            }
        });
        cal2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        double c_length = Double.parseDouble(cl.getText().toString());
                                        double c_breath = Double.parseDouble(cb.getText().toString());
                                        double c_height = Double.parseDouble(ch.getText().toString());
                                        double vol = c_length * c_breath * c_height;
                                        double cement, sand, aggregate;
                                        String Ga = G.getText().toString();
                                        switch (Ga) {
                                            case "M 5":
                                                cement = ((1.0 / 16.0)*vol*1440)/50;
                                                sand = (5.0 / 16.0) * vol;
                                                aggregate = (10.0 / 16.0) * vol;
                                                R1.setText("Quantity of Cement " +dff.format(cement)+" Bags");
                                                R2.setText("Quantity of Sand " +dff.format(sand) +" m\u00B3");
                                                R3.setText("Quantity of Aggregate " +dff.format(aggregate) +" m\u00B3");
                                                break;
                                            case "M 7.5":
                                                cement = ((1.0/ 13.0) * vol*1440)/50;
                                                sand = (4.0 / 13.0) * vol;
                                                aggregate = (8.0 / 13.0) * vol;
                                                R1.setText("Quantity of Cement " + dff.format(cement)+" Bags");
                                                R2.setText("Quantity of Sand  " + dff.format(sand) +" m\u00B3");
                                                R3.setText("Quantity of Aggregate " + dff.format(aggregate) +" m\u00B3");
                                                break;

                                            case "M 10":
                                                cement = ((1.0 / 10.0) * vol*1440)/50;
                                                sand = (3.0 / 10.0) * vol;
                                                aggregate = (6.0 / 10.0) * vol;
                                                R1.setText("Quantity of Cement " + dff.format(cement)+" Bags");
                                                R2.setText("Quantity of Sand  " + dff.format(sand) +" m\u00B3");
                                                R3.setText("Quantity of Aggregate " + dff.format(aggregate) +" m\u00B3");
                                                break;
                                            case "M 15":
                                                cement = ((1.0 / 7.0) * vol*1440)/50;
                                                sand = (2.0 / 7.0) * vol;
                                                aggregate = (4.0 / 7.0) * vol;
                                                R1.setText("Quantity of Cement " + dff.format(cement)+" Bags");
                                                R2.setText("Quantity of Sand " + dff.format(sand) +" m\u00B3");
                                                R3.setText("Quantity of Aggregate " + dff.format(aggregate) +" m\u00B3");
                                                break;
                                            case "M 20":
                                                cement = ((1.0 / 5.5) * vol*1440)/50;
                                                sand = (1.5 / 5.5) * vol;
                                                aggregate = (3.0 / 5.5) * vol;
                                                R1.setText("Quantity of Cement " + dff.format(cement)+" Bags");
                                                R2.setText("Quantity of Sand " + dff.format(sand) +" m\u00B3");
                                                R3.setText("Quantity of Aggregate " + dff.format(aggregate) +" m\u00B3");
                                                break;
                                            case "M 25":
                                                cement = ((1.0 / 4.0) * vol*1440)/50;
                                                sand = (1.0 / 4.0) * vol;
                                                aggregate = (2.0 / 4.0) * vol;
                                                R1.setText("Quantity of Cement " + dff.format(cement)+" Bags");
                                                R2.setText("Quantity of Sand " + dff.format(sand) +" m\u00B3");
                                                R3.setText("Quantity of Aggregate " + dff.format(aggregate) +" m\u00B3");
                                                break;
                                            default:
                                                R1.setText("Please Select Grade ");
                                                break;
                                        }
                                    }
                                });

        cButton = findViewById(R.id.btn_concrete_fill_entry);
        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}

