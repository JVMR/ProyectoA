package com.example.romario.proyectoa.dao.horario;

import com.example.romario.proyectoa.beans.Horario;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public interface HorarioDAO {
    public ArrayList<Horario> listar();
    public Horario buscar(int id);
    public int insertar(Horario obj);
    public int editar(Horario obj);
    public int eliminar(Horario obj);
}
