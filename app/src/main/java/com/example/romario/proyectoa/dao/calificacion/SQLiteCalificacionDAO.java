package com.example.romario.proyectoa.dao.calificacion;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.romario.proyectoa.beans.Calificacion;
import com.example.romario.proyectoa.conexion.DbHelper;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteCalificacionDAO implements CalificacionDAO {

    private Context context;

    public SQLiteCalificacionDAO(Context context)
    {
        this.context=context;
    }


    @Override
    public ArrayList<Calificacion> listar() {
        ArrayList<Calificacion> lista = new ArrayList<>();
        try {
            DbHelper helper = new DbHelper(context);
            SQLiteDatabase database = helper.getReadableDatabase();
            Cursor q = database.rawQuery("SELECT * FROM CALIFICACIONES",null);
            Calificacion obj;
            while (q.moveToNext())
            {
                obj = new Calificacion();
                obj.setNotaId(q.getInt(0));
                obj.setDescripcion(q.getString(1));
                lista.add(obj);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public Calificacion buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Calificacion obj) {
        return 0;
    }

    @Override
    public int editar(Calificacion obj) {
        return 0;
    }

    @Override
    public int eliminar(Calificacion obj) {
        return 0;
    }
}
