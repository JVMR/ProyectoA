package com.example.romario.proyectoa.dao.aula;

import android.content.Context;

import com.example.romario.proyectoa.beans.Aula;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteAulaDAO implements AulaDAO {
    private Context context;

    public SQLiteAulaDAO(Context context)
    {
        this.context=context;
    }

    @Override
    public ArrayList<Aula> listar() {
        return null;
    }

    @Override
    public Aula buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Aula obj) {
        return 0;
    }

    @Override
    public int editar(Aula obj) {
        return 0;
    }

    @Override
    public int eliminar(Aula obj) {
        return 0;
    }
}
