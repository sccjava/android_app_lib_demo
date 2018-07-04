package com.test.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("MainActivity Main", "My text is " + getString(com.bfrx.R.string.mytext));

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent i = new Intent();
                i.setClass(getApplicationContext(), com.bfrx.MainActivity.class);
                startActivity(i);
            }
        }).start();
    }
}
