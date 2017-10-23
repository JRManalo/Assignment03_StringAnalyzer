package com.example.jrman.class4;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//  Activity that contains an input field
//  Button that is disabled (enabled = false)
//  check a condition of the input field
//  if true -> enable the button
//  handler that will check the condition every 1 second
    EditText messageEdit;


    int delayAmout = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locateView();

        bindData();
    }

    private void locateView(){
        messageEdit = (EditText) findViewById(R.id.messageEditText);
    }

    private void bindData(){
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "Suh Du", Toast.LENGTH_SHORT).show();
            }
        };

        handler.postDelayed(runnable, delayAmout);
    }
}
