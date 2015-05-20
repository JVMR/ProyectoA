package com.example.romario.proyectoa.dao.seccion;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.romario.proyectoa.beans.Seccion;
import com.example.romario.proyectoa.conexion.DbHelper;
import com.example.romario.proyectoa.dao.seccion.SeccionDAO;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteSeccionDAO implements SeccionDAO {
    private Context context;

    public SQLiteSeccionDAO(Context context)
    {
        this.context=context;
    }

    @Override
    public ArrayList<Seccion> listar() {
        ArrayList<Seccion> lista = new ArrayList<>();
        try {
            DbHelper helper = new DbHelper(context);
            SQLiteDatabase database = helper.getReadableDatabase();
            Cursor q = database.rawQuery("SELECT * FROM SECCIONES",null);
            Seccion obj;
            while (q.moveToNext())
            {
                obj = new Seccion();
                obj.setSeccionId(q.getInt(0));
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
    public Seccion buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Seccion obj) {
        return 0;
    }

    @Override
    public int editar(Seccion obj) {
        return 0;
    }

    @Override
    public int eliminar(Seccion obj) {
        return 0;
    }
}
