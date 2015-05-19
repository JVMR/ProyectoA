package com.example.romario.proyectoa.dao.evaluacion;

import android.content.Context;

import com.example.romario.proyectoa.beans.Evaluacion;
import com.example.romario.proyectoa.dao.evaluacion.EvaluacionDAO;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteEvaluacionDAO implements EvaluacionDAO {
    private Context context;

    public SQLiteEvaluacionDAO(Context context)
    {
        this.context=context;
    }

    @Override
    public ArrayList<Evaluacion> listar() {
        return null;
    }

    @Override
    public Evaluacion buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Evaluacion obj) {
        return 0;
    }

    @Override
    public int editar(Evaluacion obj) {
        return 0;
    }

    @Override
    public int eliminar(Evaluacion obj) {
        return 0;
    }
}
