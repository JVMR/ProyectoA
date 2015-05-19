package com.example.romario.proyectoa.dao.matricula;

import android.content.Context;

import com.example.romario.proyectoa.beans.Matricula;
import com.example.romario.proyectoa.beans.Seccion;
import com.example.romario.proyectoa.dao.matricula.MatriculaDAO;

import java.util.ArrayList;

/**
 * Created by Hernan on 19/05/2015.
 */
public class SQLiteMatriculaDAO implements MatriculaDAO {
    private Context context;

    public SQLiteMatriculaDAO(Context context)
    {
        this.context=context;
    }

    @Override
    public ArrayList<Matricula> listar() {
        return null;
    }

    @Override
    public Matricula buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Matricula obj) {
        return 0;
    }

    @Override
    public int editar(Matricula obj) {
        return 0;
    }

    @Override
    public int eliminar(Matricula obj) {
        return 0;
    }
}
