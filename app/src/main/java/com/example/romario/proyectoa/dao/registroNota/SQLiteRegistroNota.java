package com.example.romario.proyectoa.dao.registroNota;

import com.example.romario.proyectoa.beans.Carrera;
import com.example.romario.proyectoa.dao.registroNota.RegistroNotaDAO;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteRegistroNota implements RegistroNotaDAO {
    @Override
    public ArrayList<Carrera> listar() {
        return null;
    }

    @Override
    public Carrera buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Carrera obj) {
        return 0;
    }

    @Override
    public int editar(Carrera obj) {
        return 0;
    }

    @Override
    public int eliminar(Carrera obj) {
        return 0;
    }
}
