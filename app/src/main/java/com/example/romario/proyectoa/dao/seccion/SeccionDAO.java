package com.example.romario.proyectoa.dao.seccion;

import com.example.romario.proyectoa.beans.Seccion;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface SeccionDAO {
    public ArrayList<Seccion> listar();
    public Seccion buscar(int id);
    public int insertar(Seccion obj);
    public int editar(Seccion obj);
    public int eliminar(Seccion obj);
}
