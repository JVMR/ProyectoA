package com.example.romario.proyectoa.dao.alumno;

import android.database.sqlite.SQLiteDatabase;

import com.example.romario.proyectoa.beans.Alumno;
import com.example.romario.proyectoa.conexion.MySQLiteHelper;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteAlumnoDAO implements AlumnoDAO {
    @Override
    public ArrayList<Alumno> listar() {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        try {
            //MySQLiteHelper sql = new MySQLiteHelper(,null,null,1);
            //SQLiteDatabase db = sql.getWritableDatabase();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return alumnos;
    }

    @Override
    public Alumno buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Alumno obj) {
        return 0;
    }

    @Override
    public int editar(Alumno obj) {
        return 0;
    }

    @Override
    public int eliminar(Alumno obj) {
        return 0;
    }
}
