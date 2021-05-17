package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "My App";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Wire up the button to do stuff
        //...get the button
        Button btn = (Button) findViewById(R.id.btnDoMagic);
        //..set what happens when the user clicks
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Homework 1");
                Toast.makeText(getApplicationContext(), "Sheng Liu, liu.sheng1@northeastern.edu", Toast.LENGTH_LONG)
                        .show();
            }
        });
    }

    //public void selfIntroduce(View view){
        //TextView textView = findViewById(R.id.textView);
        //textView.setText(R.string.info_string);



}