package com.example.romario.proyectoa.dao.profesor;

import com.example.romario.proyectoa.beans.Profesor;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface ProfesorDAO {
    public ArrayList<Profesor> listar();
    public Profesor buscar(int id);
    public int insertar(Profesor obj);
    public int editar(Profesor obj);
    public int eliminar(Profesor obj);
}
