package com.example.romario.proyectoa.conexion;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by Hernan on 18/05/2015.
 */
public class DbHelper {

    private static final String DATABASE_NAME = "damiDb.sqlite";
    private SQLiteDatabase database;

    public static final String DATABASE_FILE_PATH = "/sdcard/dami";

    private DbHelper databaseHelper;
    private SQLiteDatabase database2;

    public DbHelper()
    {
        File makeFolder = new File("/sdcard/dami");
        if (!makeFolder.exists())
            if (!makeFolder.mkdir()) {
            }
        try {
            database = SQLiteDatabase.openOrCreateDatabase(DATABASE_FILE_PATH+ File.separator + DATABASE_NAME, null);
            onCreate(database);
        }
        catch (SQLiteException ex) {
            onCreate(database);
        } finally {
            closeDB();
        }
    }

    private String scriptReader()
    {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String texto=null;
        try { archivo = new File ("script.sql");
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

    public SQLiteDatabase opendb() {
        databaseHelper = new DbHelper();
        database2 = databaseHelper.getWritableDatabase();
        return database2;
    }

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(scriptReader());
    }
/*
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
    }
*/
    public SQLiteDatabase getReadableDatabase() {
        database = SQLiteDatabase.openDatabase(DATABASE_FILE_PATH+ File.separator + DATABASE_NAME, null,SQLiteDatabase.OPEN_READONLY);
        return database;
    }

    public SQLiteDatabase getWritableDatabase() {
        database = SQLiteDatabase.openDatabase(DATABASE_FILE_PATH+ File.separator + DATABASE_NAME, null,SQLiteDatabase.OPEN_READWRITE);
        return database;
    }

    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }

}
