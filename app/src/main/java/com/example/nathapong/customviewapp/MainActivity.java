package com.example.nathapong.customviewapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyCustomView myCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCustomView = (MyCustomView)findViewById(R.id.customView);

        myCustomView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Hello !!!", Toast.LENGTH_SHORT).show();

                myCustomView.setTextColor(Color.RED);
                myCustomView.setViewColor(Color.YELLOW);
                myCustomView.setViewText("How are you ?");
            }
        });

        /*final View myView = findViewById(R.id.customView);
        myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello !!!", Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
