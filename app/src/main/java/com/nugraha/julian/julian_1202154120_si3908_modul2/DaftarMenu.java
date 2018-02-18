package com.nugraha.julian.julian_1202154120_si3908_modul2;

/**
 * Created by Julian on 2/18/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.razerblade.julian_1202154120_modul2.R;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView recycle;
    private adapter adaptermenu;

    public static ArrayList<model>menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_daftar_menu);
        menuList = menuisi();
        recycle = (RecyclerView)findViewById(R.id.recyclerView);
        adaptermenu = new adapter(menuList);
        recycle.setAdapter(adaptermenu);
        recycle.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<model> menuisi() {
        ArrayList<model> isi = new ArrayList<>();
        isi.add(new model("Bakso Enak",15000,R.drawable.bakso_enak,"Bakso dengan isian yang sangatt banyak bikin ngiler euy"));
        isi.add(new model("Sate Manggarai",25000,R.drawable.sate_manggarai,"Sate yang terkenal dan pastinya enak"));
        isi.add(new model("Tempe Orek",5000,R.drawable.tempe_orek,"Tempe khas dari jawa nihh pastinya makyoss"));
        isi.add(new model("Tahu",1000,R.drawable.tahu,"Tahu Yang dimasak dengan cara digoreng "));
        isi.add(new model("Kerupuk Udang",1000,R.drawable.kerupuk_udang,"Kerupuk asli dengan bahan utama dari udang"));
        isi.add(new model("Kerupuk Bulat",1000,R.drawable.kerupuk_bulat,"Kerupuk Bulat khas Warteg"));
        isi.add(new model("Tempe Mendoan",1000,R.drawable.tempe_mendoan,"Tempe Mendoan yang enak"));

        return  isi;
    }
}

