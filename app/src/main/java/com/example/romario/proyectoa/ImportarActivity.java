package com.example.romario.proyectoa;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.example.romario.proyectoa.beans.Profesor;


public class ImportarActivity extends ActionBarActivity {

    Profesor profesor;
    TextView lblProfesor;
    ListView lstModalida, lstCiclo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_importar);

        Intent rec = getIntent();
        profesor = (Profesor)rec.getSerializableExtra("profesor");

        lblProfesor = (TextView)findViewById(R.id.lblProfesorImportar);
        lblProfesor.setText("Docente: "+profesor.getNombres()+" "+profesor.getApellidoPaterno());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_importar, menu);
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
}
