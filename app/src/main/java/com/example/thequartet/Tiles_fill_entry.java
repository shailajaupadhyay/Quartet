package com.example.thequartet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
public class Tiles_fill_entry extends AppCompatActivity {
    private static final String[] tiles_size=new String[]{
      "1","1.6","2"
    };
    private static DecimalFormat df=new DecimalFormat("###.###");
    TextView l,b;
    Button cal3;
    TextView R1;
    Button tButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiles_fill_entry);

        final AutoCompleteTextView tiles_l= findViewById(R.id.tile1);
        final AutoCompleteTextView tiles_b= findViewById(R.id.tile2);
        l = findViewById(R.id.flength);
        b = findViewById(R.id.fbreath);
        cal3 = (Button) findViewById(R.id.cal3);
        R1=findViewById(R.id.t_result);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,tiles_size);
        tiles_l.setAdapter(adapter);
        tiles_b.setAdapter(adapter);

        tiles_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiles_l.showDropDown();
            }
        });
        tiles_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiles_b.showDropDown();
            }
        });

        cal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double f_length = Double.parseDouble(l.getText().toString());
                double f_breath = Double.parseDouble(b.getText().toString());
                double t_length = Double.parseDouble(tiles_l.getText().toString());
                double t_breath = Double.parseDouble(tiles_b.getText().toString());
                double no_tile = (f_length*f_breath) / (t_length*t_breath);

                R1.setText("Number of Tiles : "+ df.format(no_tile)+" Tiles");
            }
        });

        tButton=findViewById(R.id.btn_tiles_fill_entry);
        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}