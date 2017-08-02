package com.example.girlswhocode.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {mentalhealth();
            }
        });


        Button police= (Button) findViewById(R.id.button3);
        police.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {arrest();
            }
        });
        Button immigration = (Button)findViewById(R.id.button4);
        immigration.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {immigrants();
            }
        });
        Button queer= (Button) findViewById(R.id.button5);
        queer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {gay();
            }
        });
        Button abuse= (Button) findViewById(R.id.button7);
        abuse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {abused();
            }
        });
        Button assault= (Button) findViewById(R.id.button17);
        assault.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {assaulted();
            }
        });
        Button source= (Button) findViewById(R.id.button25);
        source.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {sources();
            }
        });
    }

    private void mentalhealth() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    private void arrest(){
        Intent intent = new Intent(this, Police.class);
        startActivity(intent);
    }
    private void immigrants(){
        Intent intent = new Intent(this, Immigration.class);
        startActivity(intent);
    }
    public void gay(){
        Intent intent = new Intent(this, LGBT.class);
        startActivity(intent);
    }
    public void abused(){
        Intent intent = new Intent(this, Abuse.class);
        startActivity(intent);
    }
    public void assaulted(){
        Intent intent = new Intent(this, SexualAssault.class);
        startActivity(intent);
    }
    public void sources(){
        Intent intent = new Intent(this, Citations.class);
        startActivity(intent);
    }
}