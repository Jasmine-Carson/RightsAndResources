package com.example.girlswhocode.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.*;

public class Police extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);
        Button b1= (Button) findViewById(R.id.button14);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {rights();
            }
        });
        Button b2= (Button) findViewById(R.id.button15);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {resources();
            }
        });
        Button b3= (Button) findViewById(R.id.button16);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {situations();
            }
        });
    }
    private void rights() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    private void resources() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    private void situations() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
