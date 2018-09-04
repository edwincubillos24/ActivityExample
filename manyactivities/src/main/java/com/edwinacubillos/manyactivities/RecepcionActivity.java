package com.edwinacubillos.manyactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class RecepcionActivity extends AppCompatActivity {

    private TextView tNombre, tCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepcion);

        tNombre = findViewById(R.id.tNombre);
        tCorreo = findViewById(R.id.tCorreo);

        Bundle args = getIntent().getExtras();
        if (args != null) {
            tNombre.setText(args.getString("nombre"));
            tCorreo.setText(args.getString("correo"));
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this, "Regresando", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mRecepcion){  //se presiono recepcion

        } else {         //se presiono salir

        }

        return super.onOptionsItemSelected(item);

    }
}
