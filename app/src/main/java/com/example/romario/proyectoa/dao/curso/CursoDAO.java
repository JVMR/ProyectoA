package com.example.romario.proyectoa.dao.curso;

import com.example.romario.proyectoa.beans.Curso;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface CursoDAO {
    public ArrayList<Curso> listar();
    public Curso buscar(int id);
    public int insertar(Curso obj);
    public int editar(Curso obj);
    public int eliminar(Curso obj);
}
