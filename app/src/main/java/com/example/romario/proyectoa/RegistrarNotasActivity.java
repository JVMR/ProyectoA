package com.example.romario.proyectoa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.romario.proyectoa.beans.Calificacion;
import com.example.romario.proyectoa.beans.Ciclo;
import com.example.romario.proyectoa.beans.Curso;
import com.example.romario.proyectoa.beans.Evaluacion;
import com.example.romario.proyectoa.beans.ModalidadEstudio;
import com.example.romario.proyectoa.beans.Profesor;
import com.example.romario.proyectoa.beans.Seccion;
import com.example.romario.proyectoa.dao.Factory;
import com.example.romario.proyectoa.dao.calificacion.CalificacionDAO;
import com.example.romario.proyectoa.dao.ciclo.CicloDAO;
import com.example.romario.proyectoa.dao.curso.CursoDAO;
import com.example.romario.proyectoa.dao.evaluacion.EvaluacionDAO;
import com.example.romario.proyectoa.dao.modalidadEstudio.ModalidadEstudioDAO;
import com.example.romario.proyectoa.dao.profesor.ProfesorDAO;
import com.example.romario.proyectoa.dao.seccion.SeccionDAO;

import org.apache.http.cookie.params.CookieSpecPNames;

import java.util.ArrayList;


public class RegistrarNotasActivity extends Activity {

    Spinner spnModalidad,spnCiclo,spnProfesor,spnAsignatura,spnSeccion,spnTipoPrueba,spnGrupo,spnNumPrueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_notas);

        spnModalidad=(Spinner)findViewById(R.id.spnModalidadRegistrar);
        spnCiclo=(Spinner)findViewById(R.id.spnCiclo);
        spnProfesor=(Spinner)findViewById(R.id.spnProfesor);
        spnAsignatura=(Spinner)findViewById(R.id.spnAsignatura);
        spnSeccion=(Spinner)findViewById(R.id.spnSeccion);
        spnGrupo=(Spinner)findViewById(R.id.spnGrupo);
        spnTipoPrueba=(Spinner)findViewById(R.id.spnTipoPrueba);
        spnNumPrueba=(Spinner)findViewById(R.id.spnNumPrueba);
        llenarModalidad();
        llenarCiclos();
        llenarProfesor();
        llenarAsignatura();
        llenarSeccion();
        llenarTipoPrueba();
        llenarGrupo();
        llenarNumPrueba();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registrar_notas, menu);
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

    public void llenarModalidad(){
        Factory factory = Factory.getFactory(Factory.TIPO_SQLITE);
        ModalidadEstudioDAO modalidadEstudioDAO = factory.getModalidadEstudioDAO(this);
        ArrayList<ModalidadEstudio> lista = modalidadEstudioDAO.listar();

        ArrayAdapter<ModalidadEstudio> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,lista);
        spnModalidad.setAdapter(adapter);
    }

    private void llenarCiclos() {
        Factory factory = Factory.getFactory(Factory.TIPO_SQLITE);
        CicloDAO cicloDAO = factory.getCicloDAO(this);
        ArrayList<Ciclo> lista = cicloDAO.listar();

        ArrayAdapter<Ciclo> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,lista);
        spnCiclo.setAdapter(adapter);
    }

    private void llenarProfesor() {
        Factory factory = Factory.getFactory(Factory.TIPO_SQLITE);
        ProfesorDAO profesorDAO = factory.getProfesorDAO(this);
        ArrayList<Profesor> lista = profesorDAO.listar();

        ArrayAdapter<Profesor> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,lista);
        spnProfesor.setAdapter(adapter);
    }

    private void llenarAsignatura() {
        Factory factory = Factory.getFactory(Factory.TIPO_SQLITE);
        CursoDAO cursoDAO = factory.getCursoDAO(this);
        ArrayList<Curso> lista = cursoDAO.listar();

        ArrayAdapter<Curso> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,lista);
        spnAsignatura.setAdapter(adapter);
    }

    private void llenarSeccion() {
        Factory factory = Factory.getFactory(Factory.TIPO_SQLITE);
        SeccionDAO seccionDAO = factory.getSeccionDAO(this);
        ArrayList<Seccion> lista = seccionDAO.listar();

        ArrayAdapter<Seccion> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,lista);
        spnSeccion.setAdapter(adapter);
    }

    private void llenarGrupo() {
        ArrayAdapter<String> myAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,new String[]{"Seleccione","1","2"});
        spnGrupo.setAdapter(myAdapter);
    }

    private void llenarTipoPrueba() {
        Factory factory = Factory.getFactory(Factory.TIPO_SQLITE);
        EvaluacionDAO evaluacionDAO = factory.getEvaluacionDAO(this);
        ArrayList<Evaluacion> lista = evaluacionDAO.listar();

        ArrayAdapter<Evaluacion> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,lista);
        spnTipoPrueba.setAdapter(adapter);
    }
    private void llenarNumPrueba() {

        ArrayAdapter<String> myAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,new String[]{"Seleccione","1","2","3","4"});
        spnNumPrueba.setAdapter(myAdapter);
    }
}
