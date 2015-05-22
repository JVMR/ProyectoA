package com.example.romario.proyectoa.dao.evaluacion;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.romario.proyectoa.beans.Evaluacion;
import com.example.romario.proyectoa.conexion.DbHelper;
import com.example.romario.proyectoa.dao.evaluacion.EvaluacionDAO;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteEvaluacionDAO implements EvaluacionDAO {
    private Context context;

    public SQLiteEvaluacionDAO(Context context)
    {
        this.context=context;
    }

    @Override
    public ArrayList<Evaluacion> listar() {
        ArrayList<Evaluacion> lista = new ArrayList<>();
        try {
            DbHelper helper = new DbHelper(context);
            SQLiteDatabase database = helper.getReadableDatabase();
            Cursor q = database.rawQuery("SELECT * FROM EVALUACIONES ORDER BY evaluacionId asc",null);
            Evaluacion obj;
            while (q.moveToNext())
            {
                obj = new Evaluacion();
                obj.setEvaluacionId(q.getInt(0));
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
    public Evaluacion buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Evaluacion obj) {
        return 0;
    }

    @Override
    public int editar(Evaluacion obj) {
        return 0;
    }

    @Override
    public int eliminar(Evaluacion obj) {
        return 0;
    }
}
