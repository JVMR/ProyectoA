package com.example.romario.proyectoa.dao.calificacion;

import com.example.romario.proyectoa.beans.Calificacion;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface CalificacionDAO {
    public ArrayList<Calificacion> listar();
    public Calificacion buscar(int id);
    public int insertar(Calificacion obj);
    public int editar(Calificacion obj);
    public int eliminar(Calificacion obj);
}
