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
            Cursor q = database.rawQuery("SELECT * FROM SECCIONES s inner join HORARIOS h on s.seccionId=h.seccionId where  ORDER BY descripcion asc ",null);
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

    public ArrayList<Seccion> listarxCiclo_Profesor_Curso(int idCiclo,int idProfesor,int idCurso) {
        ArrayList<Seccion> lista = new ArrayList<>();
        try {
            DbHelper helper = new DbHelper(context);
            SQLiteDatabase database = helper.getReadableDatabase();
            Cursor q = database.rawQuery("SELECT s.seccionId,s.descripcion FROM SECCIONES s inner join HORARIOS h on s.seccionId=h.seccionId where h.cicloId="+idCiclo+" and h.profesorId="+idProfesor+" and h.cursoId="+idCurso+" ORDER BY s.seccionId asc ",null);
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


    public ArrayList<Integer> listarGruposxCiclo_Profesor_Curso(int idCiclo,int idProfesor,int idCurso,int idSeccion) {
        ArrayList<Integer> lista = new ArrayList<>();
        try {
            DbHelper helper = new DbHelper(context);
            SQLiteDatabase database = helper.getReadableDatabase();
            Cursor q = database.rawQuery("SELECT grupo FROM  HORARIOS  where cicloId="+idCiclo+" and profesorId="+idProfesor+" and cursoId="+idCurso+" and seccionId="+idSeccion+" ORDER BY grupo asc ",null);

            while (q.moveToNext())
            {
                lista.add(q.getInt(0));
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
