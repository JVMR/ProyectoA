package com.example.romario.proyectoa.dao.alumno;

import android.database.sqlite.SQLiteDatabase;

import com.example.romario.proyectoa.beans.Alumno;
import com.example.romario.proyectoa.conexion.DbHelper;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteAlumnoDAO implements AlumnoDAO {
    @Override
    public ArrayList<Alumno> listar() {

        ArrayList<Alumno> alumnos = new ArrayList<>();
        DbHelper dbHelper = null;
        try {
            dbHelper = new DbHelper();
            SQLiteDatabase database=dbHelper.opendb();
            dbHelper.getReadableDatabase();
            //dbHelper.

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(dbHelper!=null)
                dbHelper.closeDB();
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
