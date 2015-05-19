package com.example.romario.proyectoa;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.romario.proyectoa.beans.Profesor;


public class OpcionesActivity extends ActionBarActivity implements View.OnClickListener {

    Button btnExportar, btnImportar, btnRegistroNotas;
    Profesor profesor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        Intent rec = getIntent();
        profesor = (Profesor)rec.getSerializableExtra("profesor");

        btnExportar=(Button)findViewById(R.id.btnExportar);
        btnExportar.setOnClickListener(this);
        btnImportar=(Button)findViewById(R.id.btnImportar);
        btnImportar.setOnClickListener(this);
        btnRegistroNotas=(Button)findViewById(R.id.btnRegistroNotas);
        btnRegistroNotas.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent ir;
        if(v==btnExportar)
        {
            ir= new Intent(this,ExportarActivity.class);
        }
        else if(v==btnImportar)
        {
            ir= new Intent(this,ImportarActivity.class);
        }
        else
        {
            ir= new Intent(this,RegistrarNotasActivity.class);
        }
        ir.putExtra("profesor",profesor);
        startActivity(ir);
    }
}
