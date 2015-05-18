package com.example.romario.proyectoa.dao.evaluacion;

import com.example.romario.proyectoa.beans.Evaluacion;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface EvaluacionDAO {
    public ArrayList<Evaluacion> listar();
    public Evaluacion buscar(int id);
    public int insertar(Evaluacion obj);
    public int editar(Evaluacion obj);
    public int eliminar(Evaluacion obj);
}
