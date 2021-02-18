package com.example.thequartet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DASHBOARD extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_a_s_h_b_o_a_r_d);

        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DASHBOARD.this,MATERIAL.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.bottom_nav_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_about:
                startActivity(new Intent(getApplicationContext(),about_use_activity.class));
                overridePendingTransition(0,0);
                return true;

            case R.id.nav_use:
                startActivity(new Intent(getApplicationContext(),use_activity.class));
                overridePendingTransition(0,0);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}