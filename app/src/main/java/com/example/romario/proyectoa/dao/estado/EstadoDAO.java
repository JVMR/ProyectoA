package com.example.romario.proyectoa.dao.estado;

import com.example.romario.proyectoa.beans.Estado;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface EstadoDAO {
    public ArrayList<Estado> listar();
    public Estado buscar(int id);
    public int insertar(Estado obj);
    public int editar(Estado obj);
    public int eliminar(Estado obj);
}
