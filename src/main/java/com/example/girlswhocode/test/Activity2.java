package com.example.girlswhocode.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.*;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {helpFriend();
            }
        });
        button.setY(200);
        button.setX(50);
        Button b2 = (Button) findViewById(R.id.button6);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {helpMe();
            }
        });
    }

    private void helpFriend() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
    private void helpMe() {
        Intent intent = new Intent(this, HelpMeMental.class);
        startActivity(intent);
    }


}
