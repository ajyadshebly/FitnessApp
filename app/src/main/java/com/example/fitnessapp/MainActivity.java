package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button exercise,stopW,advices,todo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exercise=findViewById(R.id.exercise);
        stopW=findViewById(R.id.stopW);
        advices=findViewById(R.id.advices);
        todo=findViewById(R.id.todo);
        initial();
    }

    private void initial() {
        stopW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,StopWatch.class);
                startActivity(intent);
            }
        });


    }
}