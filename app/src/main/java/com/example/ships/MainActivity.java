package com.example.ships;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExecutorService exec = Executors.newFixedThreadPool(2);
        for (int i=0; i<=3; i++){
            exec.execute(new ShipThread(String.valueOf(i)));
        }

    }
}
