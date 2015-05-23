package com.example.romario.proyectoa.dao.curso;

import com.example.romario.proyectoa.beans.Curso;
import com.example.romario.proyectoa.dao.GenericDAO;

import java.util.ArrayList;


/**
 * Created by Hernan on 17/05/2015.
 */
public interface CursoDAO extends GenericDAO<Curso, Long>
{
public ArrayList<Curso> listarXprofesor(int profesorId,int cicloId);
}
