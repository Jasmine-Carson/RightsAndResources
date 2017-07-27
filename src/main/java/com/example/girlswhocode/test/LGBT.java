package com.example.girlswhocode.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.*;

public class LGBT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lgbt);
        Button b1= (Button) findViewById(R.id.button10);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {rights();
            }
        });
        Button b2= (Button) findViewById(R.id.button11);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {resources();
            }
        });
        Button b3= (Button) findViewById(R.id.button22);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {change();
            }
        });
    }
    private void rights() {
        Intent intent = new Intent(this, QueerRights.class);
        startActivity(intent);
    }
    private void resources() {
        Intent intent = new Intent(this, QueerResources.class);
        startActivity(intent);
    }
    private void change() {
        Intent intent = new Intent(this, ChangeName.class);
        startActivity(intent);
    }
}
