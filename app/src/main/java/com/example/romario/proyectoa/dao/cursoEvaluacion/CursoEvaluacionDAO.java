package com.example.romario.proyectoa.dao.cursoEvaluacion;

import com.example.romario.proyectoa.beans.CursoEvaluacion;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface CursoEvaluacionDAO {
    public ArrayList<CursoEvaluacion> listar();
    public CursoEvaluacion buscar(int id);
    public int insertar(CursoEvaluacion obj);
    public int editar(CursoEvaluacion obj);
    public int eliminar(CursoEvaluacion obj);
}
