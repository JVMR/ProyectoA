package com.example.romario.proyectoa.dao.carerra;

import com.example.romario.proyectoa.beans.Carrera;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface CarerraDAO {
    public ArrayList<Carrera> listar();
    public Carrera buscar(int id);
    public int insertar(Carrera obj);
    public int editar(Carrera obj);
    public int eliminar(Carrera obj);
}
