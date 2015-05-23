package com.example.romario.proyectoa.dao.evaluacion;

import com.example.romario.proyectoa.beans.Evaluacion;
import com.example.romario.proyectoa.dao.GenericDAO;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface EvaluacionDAO extends GenericDAO<Evaluacion, Long>
{
    public ArrayList<Evaluacion> listarXCurso(int idCurso);
}
