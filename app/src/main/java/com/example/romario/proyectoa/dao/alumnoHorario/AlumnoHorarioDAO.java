package com.example.romario.proyectoa.dao.alumnoHorario;

import com.example.romario.proyectoa.beans.AlumnoHorario;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface AlumnoHorarioDAO {
    public ArrayList<AlumnoHorario> listar();
    public AlumnoHorario buscar(int id);
    public int insertar(AlumnoHorario obj);
    public int editar(AlumnoHorario obj);
    public int eliminar(AlumnoHorario obj);
}
