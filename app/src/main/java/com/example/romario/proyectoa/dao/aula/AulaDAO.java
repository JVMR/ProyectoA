package com.example.romario.proyectoa.dao.aula;

import com.example.romario.proyectoa.beans.Aula;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface AulaDAO {
    public ArrayList<Aula> listar();
    public Aula buscar(int id);
    public int insertar(Aula obj);
    public int editar(Aula obj);
    public int eliminar(Aula obj);
}
