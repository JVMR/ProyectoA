package com.example.romario.proyectoa.dao.horario;

import android.content.Context;

import com.example.romario.proyectoa.beans.Horario;
import com.example.romario.proyectoa.dao.horario.HorarioDAO;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteHorarioDAO implements HorarioDAO {
    private Context context;

    public SQLiteHorarioDAO(Context context)
    {
        this.context=context;
    }

    @Override
    public ArrayList<Horario> listar() {
        return null;
    }

    @Override
    public Horario buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Horario obj) {
        return 0;
    }

    @Override
    public int editar(Horario obj) {
        return 0;
    }

    @Override
    public int eliminar(Horario obj) {
        return 0;
    }
}
