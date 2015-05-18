package com.example.romario.proyectoa.dao;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Hernan on 18/05/2015.
 */
public interface GenericDAO<T, ID extends Serializable> {
    public ArrayList<T> listar();
    public T buscar(int id);
    public int insertar(T obj);
    public int editar(T obj);
    public int eliminar(T obj);
}
