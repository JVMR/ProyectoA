package com.example.romario.proyectoa.dao.profesor;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.romario.proyectoa.beans.Profesor;
import com.example.romario.proyectoa.conexion.DbHelper;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteProfesorDAO implements ProfesorDAO {
    private Context context;

    public SQLiteProfesorDAO(Context context)
    {
        this.context=context;
    }

    @Override
    public ArrayList<Profesor> listar() {
        return null;
    }

    @Override
    public Profesor buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Profesor obj) {
        return 0;
    }

    @Override
    public int editar(Profesor obj) {
        return 0;
    }

    @Override
    public int eliminar(Profesor obj) {
        return 0;
    }

    @Override
    public Profesor logear(String username, String password) {
       Profesor obj=null;
        try {
            DbHelper helper = new DbHelper(context);
            SQLiteDatabase database = helper.getReadableDatabase();
            Cursor q = database.rawQuery("SELECT * FROM PROFESOR WHERE username=? AND password=?",new String[]{username,password});

            if (q.moveToNext())
            {
                obj = new Profesor();
                obj.setProfesorId(q.getInt(0));
                obj.setNombres(q.getString(1));
                obj.setApellidoPaterno(q.getString(2));
                obj.setApellidoMaterno(q.getString(3));
                obj.setEmail(q.getString(4));
                obj.setUsername(q.getString(5));
                obj.setPassword(q.getString(6));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}
