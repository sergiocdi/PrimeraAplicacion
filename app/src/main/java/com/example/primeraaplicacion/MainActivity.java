package com.example.primeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Ejemplo", "Estoy onStart");

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent ejemplo = new Intent(this, Activity1.class);
        startActivity(ejemplo);
    }
}