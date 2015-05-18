package com.example.romario.proyectoa.dao.dia;

import com.example.romario.proyectoa.beans.Dia;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface DiaDAO {
    public ArrayList<Dia> listar();
    public Dia buscar(int id);
    public int insertar(Dia obj);
    public int editar(Dia obj);
    public int eliminar(Dia obj);
}
