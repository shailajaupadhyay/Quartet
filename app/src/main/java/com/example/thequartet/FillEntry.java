package com.example.thequartet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class FillEntry extends AppCompatActivity {
    EditText Bl, Bb, Bh;
    EditText Wl, Wb, Wh;
    Button cal;
    TextView R1, R2,R3;
    Button btButton;
    private static DecimalFormat df=new DecimalFormat("###.###");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fill_entry);

        Bl = findViewById(R.id.blength);
        Bb = findViewById(R.id.bbreathe);
        Bh = findViewById(R.id.bheight);
        Wl = findViewById(R.id.wlength);
        Wb = findViewById(R.id.wbreath);
        Wh = findViewById(R.id.wheight);
        cal = (Button) findViewById(R.id.cal);
        R1 = findViewById(R.id.result);
        R2 = findViewById(R.id.result1);
        R3 = findViewById(R.id.result2);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double w_length = Double.parseDouble(Wl.getText().toString());
                double w_breathe = Double.parseDouble(Wb.getText().toString());
                double w_height = Double.parseDouble(Wh.getText().toString());
                double b_length = Double.parseDouble(Bl.getText().toString());
                double b_breathe = Double.parseDouble(Bb.getText().toString());
                double b_height = Double.parseDouble(Bh.getText().toString());
                double brick = (w_length * w_breathe * w_height) / ((b_length+0.01) * (b_breathe+0.01) * (b_height+0.01));
                double wet_v =(w_length * w_breathe * w_height*25.0)/100;
                double dry_v =(wet_v)*1.33;
                double cement = (dry_v/7.0)/0.0347;
                double sand = (dry_v/7.0)*6.0;

                R1.setText("Number of Bricks : "+ df.format(brick));
                R2.setText("Quantity of Cement : "+ df.format(cement) +" Bags");
                R3.setText("Quantity of Sand : "+df.format(sand) +" m\u00B3");

            }
        });

        btButton=findViewById(R.id.btn_fill_entry);
        btButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }

}