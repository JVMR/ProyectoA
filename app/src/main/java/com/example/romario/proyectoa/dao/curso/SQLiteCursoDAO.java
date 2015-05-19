package com.example.romario.proyectoa.dao.curso;

import android.content.Context;

import com.example.romario.proyectoa.beans.Curso;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteCursoDAO implements CursoDAO {

    private Context context;

    public SQLiteCursoDAO(Context context)
    {
        this.context=context;
    }


    @Override
    public ArrayList<Curso> listar() {
        return null;
    }

    @Override
    public Curso buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Curso obj) {
        return 0;
    }

    @Override
    public int editar(Curso obj) {
        return 0;
    }

    @Override
    public int eliminar(Curso obj) {
        return 0;
    }
}
