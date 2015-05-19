package com.example.romario.proyectoa;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.romario.proyectoa.beans.Ciclo;
import com.example.romario.proyectoa.beans.ModalidadEstudio;
import com.example.romario.proyectoa.beans.Profesor;
import com.example.romario.proyectoa.dao.Factory;
import com.example.romario.proyectoa.dao.ciclo.CicloDAO;
import com.example.romario.proyectoa.dao.modalidadEstudio.ModalidadEstudioDAO;

import java.util.ArrayList;


public class ImportarActivity extends ActionBarActivity implements View.OnClickListener{

    Profesor profesor;
    TextView lblProfesor;
    Spinner spnModalidad, spnCiclo;
    Button btnImportar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_importar);

        Intent rec = getIntent();
        profesor = (Profesor)rec.getSerializableExtra("profesor");

        lblProfesor = (TextView)findViewById(R.id.lblProfesorImportar);
        lblProfesor.setText("DOCENTE: "+(profesor.getNombres()+" "+profesor.getApellidoPaterno()).toUpperCase());

        spnModalidad=(Spinner)findViewById(R.id.spnModalidadImportar);
        llenarModalidades();
        spnCiclo=(Spinner)findViewById(R.id.spnCicloImportar);
        llenarCiclos();


        //Typeface myCustomFont =Typeface.createFromAsset(getAssets(),"fonts/fontawesome.ttf");

        Button btnImportar = (Button)findViewById(R.id.btnImportarImportar);
        //btnImportar.setTypeface(myCustomFont);
        btnImportar.setOnClickListener(this);

    }

    private void llenarCiclos() {
        Factory factory = Factory.getFactory(Factory.TIPO_SQLITE);
        CicloDAO cicloDAO = factory.getCicloDAO(this);
        ArrayList<Ciclo> lista = cicloDAO.listar();

        ArrayAdapter<Ciclo> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,lista);
        spnCiclo.setAdapter(adapter);
    }

    private void llenarModalidades() {
        Factory factory = Factory.getFactory(Factory.TIPO_SQLITE);
        ModalidadEstudioDAO modalidadEstudioDAO = factory.getModalidadEstudioDAO(this);
        ArrayList<ModalidadEstudio> lista = modalidadEstudioDAO.listar();

        ArrayAdapter<ModalidadEstudio> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,lista);
        spnModalidad.setAdapter(adapter);

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

    @Override
    public void onClick(View v) {
        if(v==btnImportar)
        {

        }
    }
}
