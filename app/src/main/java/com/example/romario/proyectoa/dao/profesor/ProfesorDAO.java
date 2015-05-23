package com.example.romario.proyectoa.dao.profesor;

import com.example.romario.proyectoa.beans.Profesor;
import com.example.romario.proyectoa.dao.GenericDAO;

import java.util.ArrayList;


/**
 * Created by Hernan on 17/05/2015.
 */
public interface ProfesorDAO extends GenericDAO<Profesor, Long>
{
    public Profesor logear(String username, String password);
    public ArrayList<Profesor> listarXciclo(int cicloId);
}