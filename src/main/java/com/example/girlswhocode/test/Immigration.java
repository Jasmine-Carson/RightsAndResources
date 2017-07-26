package com.example.girlswhocode.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.*;

public class Immigration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immigration);
        Button b1 = (Button) findViewById(R.id.button9);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {resource();
            }
        });
        Button b2 = (Button) findViewById(R.id.button8);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {rights();
            }
        });
    }

    private void resource(){
        Intent intent = new Intent(this, ImmigrationResource.class);
        startActivity(intent);
    }

    private void rights(){
        Intent intent = new Intent(this, ImmigrationRights.class);
        startActivity(intent);
    }
}
