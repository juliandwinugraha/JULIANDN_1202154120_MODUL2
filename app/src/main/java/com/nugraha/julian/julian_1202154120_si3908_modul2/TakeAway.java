package com.nugraha.julian.julian_1202154120_si3908_modul2;

/**
 * Created by Julian on 2/18/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.razerblade.julian_1202154120_modul2.R;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_take_away);
    }

    public void lestgo(View view) {
        startActivity(new Intent(this,DaftarMenu.class));
    }
}
