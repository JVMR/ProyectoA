package com.example.romario.proyectoa.dao.alumno;

import com.example.romario.proyectoa.beans.Alumno;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface AlumnoDAO {
    public ArrayList<Alumno> listar();
    public Alumno buscar(int id);
    public int insertar(Alumno obj);
    public int editar(Alumno obj);
    public int eliminar(Alumno obj);
}
