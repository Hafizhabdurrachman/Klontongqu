package com.example.papb.papb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambah(View v){
        Intent i=new Intent(MainActivity.this,input.class);
        startActivity(i);
    }

    public void laporanbarang(View v){
        Intent i=new Intent(MainActivity.this,laporan.class);
        startActivity(i);
    }

    public void barang(View view) {
        Intent i=new Intent (MainActivity.this, UpdateBarang.class);
        startActivity(i);
    }
}
