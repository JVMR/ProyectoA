package com.example.romario.proyectoa.dao.seccion;


import com.example.romario.proyectoa.beans.Seccion;
import com.example.romario.proyectoa.dao.GenericDAO;

import java.util.ArrayList;


/**
 * Created by Hernan on 17/05/2015.
 */
public interface SeccionDAO extends GenericDAO<Seccion, Long>
{

    public ArrayList<Seccion> listarxCiclo_Profesor_Curso(int idCiclo,int idProfesor,int idCurso);
    public ArrayList<Integer> listarGruposxCiclo_Profesor_Curso(int idCiclo,int idProfesor,int idCurso,int idSeccion);

}
