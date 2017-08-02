package com.example.girlswhocode.test;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.content.Intent;
        import android.view.View;
        import android.widget.*;

public class Abuse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abuse);
        Button b1= (Button) findViewById(R.id.button12);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {rights();
            }
        });
        Button b2 = (Button)findViewById(R.id.button13);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {resources();
            }
        });
        Button b3 = (Button)findViewById(R.id.button23);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {helpme();
            }
        });
        Button b4 = (Button)findViewById(R.id.button24);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {helpfriend();
            }
        });
    }

    private void rights() {
        Intent intent = new Intent(this, AbuseRights.class);
        startActivity(intent);
    }
    private void resources() {
        Intent intent = new Intent(this, AbuseResources.class);
        startActivity(intent);
    }
    private void helpme() {
        Intent intent = new Intent(this, IfAbused.class);
        startActivity(intent);
    }
    private void helpfriend() {
        Intent intent = new Intent(this, AbusedFriend.class);
        startActivity(intent);
    }
}
