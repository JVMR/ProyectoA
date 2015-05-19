package com.example.romario.proyectoa.dao.modalidadEstudio;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.romario.proyectoa.beans.ModalidadEstudio;
import com.example.romario.proyectoa.conexion.DbHelper;

import java.util.ArrayList;

/**
 * Created by Hernan on 19/05/2015.
 */
public class SQLiteModalidadEstudioDAO implements ModalidadEstudioDAO {

    private Context context;

    public SQLiteModalidadEstudioDAO(Context context) {
        this.context=context;
    }

    @Override
    public ArrayList<ModalidadEstudio> listar() {
        ArrayList<ModalidadEstudio> lista = new ArrayList<>();
        try {
            DbHelper helper = new DbHelper(context);
            SQLiteDatabase database = helper.getReadableDatabase();
            Cursor q = database.rawQuery("SELECT * FROM MODALIDADES_ESTUDIOS",null);
            ModalidadEstudio obj;
            while (q.moveToNext())
            {
                obj = new ModalidadEstudio();
                obj.setModalidadEstudioId(q.getInt(0));
                obj.setDescripcion(q.getString(1));
                obj.setAbreviatura(q.getString(2));
                lista.add(obj);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public ModalidadEstudio buscar(int id) {
        return null;
    }

    @Override
    public int insertar(ModalidadEstudio obj) {
        return 0;
    }

    @Override
    public int editar(ModalidadEstudio obj) {
        return 0;
    }

    @Override
    public int eliminar(ModalidadEstudio obj) {
        return 0;
    }
}
