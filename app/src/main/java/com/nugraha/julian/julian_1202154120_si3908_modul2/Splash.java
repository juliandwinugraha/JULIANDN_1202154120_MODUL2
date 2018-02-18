package com.nugraha.julian.julian_1202154120_si3908_modul2;

/**
 * Created by Julian on 2/18/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.razerblade.julian_1202154120_modul2.R;

public class Splash extends AppCompatActivity {
    //Set waktu lama splashscreen dalamam milisecond
    private static int splashInterval = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_splash);
        Toast.makeText(this,"JULIAN_1202154120",Toast.LENGTH_LONG).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent
                //jeda selesai Splashscreen
            }
        }, splashInterval);

    }

    ;
}