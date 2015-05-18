package com.example.romario.proyectoa.conexion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by Hernan on 17/05/2015.
 */
public class MySQLiteHelper extends SQLiteOpenHelper {

    public MySQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "ProyectoDAMI", factory, version);
    }

    private String fileReader()
    {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String texto=null;
        try { archivo = new File ("script.sqlite");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            texto="";
            String linea;
            while((linea=br.readLine())!=null)
                texto+=linea;
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return texto;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(fileReader());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
