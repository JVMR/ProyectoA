package com.example.romario.proyectoa.dao.alumno;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.romario.proyectoa.beans.Alumno;
import com.example.romario.proyectoa.conexion.DbHelper;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteAlumnoDAO implements AlumnoDAO {
    private Context context;

    public SQLiteAlumnoDAO(Context context)
    {
        this.context=context;
    }

    @Override
    public ArrayList<Alumno> listar() {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            DbHelper helper = new DbHelper(context);
            SQLiteDatabase database = helper.getReadableDatabase();
            Cursor q = database.rawQuery("SELECT * FROM ALUMNOS",null);
            Alumno obj;
            while (q.moveToNext())
            {
                obj = new Alumno();
                obj.setAlumnoId(q.getInt(0));
                obj.setNombres(q.getString(1));
                obj.setApellidoPaterno(q.getString(2));
                obj.setApellidoMaterno(q.getString(3));
                obj.setEmail(q.getString(4));
                obj.setEstadoId(5);
                alumnos.add(obj);
            }
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
