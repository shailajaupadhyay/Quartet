package com.example.thequartet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MATERIAL extends AppCompatActivity {
    Button b5,b6,b7,b8,btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_a_t_e_r_i_a_l);
        btn=findViewById(R.id.btn_material);
        b5=findViewById(R.id.button4);
        b6=findViewById(R.id.button7);
        b7=findViewById(R.id.button8);
        b8=findViewById(R.id.button9);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MATERIAL.this,FillEntry.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MATERIAL.this,Plaster_fill_entry.class);
                startActivity(intent);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MATERIAL.this,Concreate_fill_entry.class);
                startActivity(intent);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MATERIAL.this,Tiles_fill_entry.class);
                startActivity(intent);

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}