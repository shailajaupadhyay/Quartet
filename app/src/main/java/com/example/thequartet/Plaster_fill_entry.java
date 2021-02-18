package com.example.thequartet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Plaster_fill_entry extends AppCompatActivity {
    EditText p1,p2;
    EditText Wl, Wh,Cl,Ch;
    Button cal1,button;
    TextView R1,R2,R3,R4;
    TextView T1,T2;
    private static DecimalFormat df=new DecimalFormat("###.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plaster_fill_entry);

        p1 = findViewById(R.id.plaster);
        p2 = findViewById(R.id.plaster2);
        Wl = findViewById(R.id.pwlength);
        Wh = findViewById(R.id.pwheight);
        Cl = findViewById(R.id.pclength);
        Ch = findViewById(R.id.pcheight);
        cal1 =(Button)findViewById(R.id.cal1);
        R1 = findViewById(R.id.P_result);
        R2 = findViewById(R.id.P_result1);
        R3 = findViewById(R.id.P_result2);
        R4 = findViewById(R.id.P_result3);
        T1 = findViewById(R.id.walltext);
        T2 = findViewById(R.id.cellingtext);
        cal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double w_length = Double.parseDouble(Wl.getText().toString());
                double w_height = Double.parseDouble(Wh.getText().toString());
                double w_plaster = Double.parseDouble(p1.getText().toString());
                double c_length = Double.parseDouble(Cl.getText().toString());
                double c_height = Double.parseDouble(Ch.getText().toString());
                double c_plaster = Double.parseDouble(p2.getText().toString());

                double w_mortar = (w_length * w_height)*w_plaster;
                double w_dry_v = w_mortar*1.33;
                double cement_w = (w_dry_v/7)/0.0347;
                double sand_w = (w_dry_v/7)*6;

                double c_mortar = (c_length * c_height)*c_plaster;
                double c_dry_v = c_mortar*1.33;
                double cement_c = (c_dry_v/5)/0.0347;
                double sand_c = (c_dry_v/5)*4;

                T1.setText("FOR WALLS :");
                R1.setText("Quantity of Cement : "+ df.format(cement_w) +" Bags");
                R2.setText("Quantity of Sand : "+ df.format(sand_w) +"m\u00B3");
                T2.setText("FOR CELLING :");
                R3.setText("Quantity of Cement : "+ df.format(cement_c) +" Bags");
                R4.setText("Quantity of Sand : "+ df.format(sand_c) +"m\u00B3");

            }
        });

        button=findViewById(R.id.btn_plaster);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }

}
