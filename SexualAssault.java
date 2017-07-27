package com.example.girlswhocode.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SexualAssault extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexual_assault);
        Button tips= (Button) findViewById(R.id.button18);
        tips.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {getTips();
            }
        });
        Button laws= (Button) findViewById(R.id.button19);
        laws.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {getLaws();
            }
        });
        Button report= (Button) findViewById(R.id.button21);
        report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {report();
            }
        });
        Button resource= (Button) findViewById(R.id.button20);
        resource.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {resources();
            }
        });
    }
    private void getTips() {
        Intent intent = new Intent(this, AssaultTips.class);
        startActivity(intent);
    }
    private void getLaws() {
        Intent intent = new Intent(this, AssaultLaws.class);
        startActivity(intent);
    }
    private void report() {
        Intent intent = new Intent(this, ReportAssault.class);
        startActivity(intent);
    }
    private void resources() {
        Intent intent = new Intent(this, AssaultResources.class);
        startActivity(intent);
    }
}
