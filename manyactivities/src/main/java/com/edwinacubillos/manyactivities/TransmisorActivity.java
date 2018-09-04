package com.edwinacubillos.manyactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TransmisorActivity extends AppCompatActivity {

    private EditText eNombre, eCorreo;
    private Button bEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transmisor);

        eNombre = findViewById(R.id.eNombre);
        eCorreo = findViewById(R.id.eCorreo);
        bEnviar = findViewById(R.id.bEnviar);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransmisorActivity.this, RecepcionActivity.class);
                intent.putExtra("nombre",eNombre.getText().toString());
                intent.putExtra("correo",eCorreo.getText().toString());
                startActivity(intent);
              //  finish(); //kill the activity
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this,"Saliendo",Toast.LENGTH_SHORT).show();
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
            Intent intent = new Intent(TransmisorActivity.this, RecepcionActivity.class);
            intent.putExtra("nombre",eNombre.getText().toString());
            intent.putExtra("correo",eCorreo.getText().toString());
            startActivity(intent);
        } else {         //se presiono salir
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);

    }
}
