package com.example.romario.proyectoa.dao.cargaDocente;

import android.content.Context;

import com.example.romario.proyectoa.beans.Seccion;

import java.util.ArrayList;

/**
 * Created by Hernan on 19/05/2015.
 */
public class SQLiteCargaDocenteDAO implements CargaDocenteDAO {
    private Context context;

    public SQLiteCargaDocenteDAO(Context context)
    {
        this.context=context;
    }

    @Override
    public ArrayList<Seccion> listar() {
        return null;
    }

    @Override
    public Seccion buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Seccion obj) {
        return 0;
    }

    @Override
    public int editar(Seccion obj) {
        return 0;
    }

    @Override
    public int eliminar(Seccion obj) {
        return 0;
    }
}