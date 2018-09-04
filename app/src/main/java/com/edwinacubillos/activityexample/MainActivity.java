package com.edwinacubillos.activityexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("metodo","onCreate()");    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("metodo","onStart()");    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("metodo","onResume()");    }

        //Activa
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("metodo","onPause()");    }

        //Visible
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("metodo","onStop()");    }

        //Parada
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("metodo","onRestart()");    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("metodo","onDestroy()");    }
}
