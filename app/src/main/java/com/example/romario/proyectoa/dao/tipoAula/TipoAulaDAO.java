package com.example.romario.proyectoa.dao.tipoAula;

import com.example.romario.proyectoa.beans.TipoAula;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface TipoAulaDAO {
    public ArrayList<TipoAula> listar();
    public TipoAula buscar(int id);
    public int insertar(TipoAula obj);
    public int editar(TipoAula obj);
    public int eliminar(TipoAula obj);
}
