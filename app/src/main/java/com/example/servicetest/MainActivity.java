package com.example.servicetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (Foreground.get(this).isBackground()){
            Toast.makeText(this, "Yes Is Background", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Yes Is Foreground", Toast.LENGTH_SHORT).show();
        }
    }
}
