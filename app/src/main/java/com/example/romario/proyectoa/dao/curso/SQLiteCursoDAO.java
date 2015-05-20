package com.example.romario.proyectoa.dao.curso;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.romario.proyectoa.beans.Curso;
import com.example.romario.proyectoa.conexion.DbHelper;

import java.util.ArrayList;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteCursoDAO implements CursoDAO {

    private Context context;

    public SQLiteCursoDAO(Context context)
    {
        this.context=context;
    }


    @Override
    public ArrayList<Curso> listar() {
        ArrayList<Curso> lista = new ArrayList<>();
        try {
            DbHelper helper = new DbHelper(context);
            SQLiteDatabase database = helper.getReadableDatabase();
            Cursor q = database.rawQuery("SELECT * FROM CURSOS",null);
            Curso obj;
            while (q.moveToNext())
            {
                obj = new Curso();
                obj.setCursoId(q.getInt(0));
                obj.setCodigo(q.getString(1));
                obj.setDescripcion(q.getString(2));
                lista.add(obj);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public Curso buscar(int id) {
        return null;
    }

    @Override
    public int insertar(Curso obj) {
        return 0;
    }

    @Override
    public int editar(Curso obj) {
        return 0;
    }

    @Override
    public int eliminar(Curso obj) {
        return 0;
    }
}
