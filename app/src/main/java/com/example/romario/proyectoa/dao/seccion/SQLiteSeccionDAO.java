package com.example.romario.proyectoa.dao.seccion;

import android.content.Context;

import com.example.romario.proyectoa.beans.Seccion;
import com.example.romario.proyectoa.dao.seccion.SeccionDAO;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteSeccionDAO implements SeccionDAO {
    private Context context;

    public SQLiteSeccionDAO(Context context)
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
