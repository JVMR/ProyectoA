package com.example.romario.proyectoa.dao;

/**
 * Created by Hernan on 17/05/2015.
 */
public class Factory {
    public static final int TIPO_SQLITE = 1;

    public abstract AlumnoDAO getAlumnoDAO();
    public abstract AlumnoHorarioDAO getAlumnoHorarioDAO();
    public abstract AulaDAO getAula();
    public abstract CalificacionDAO getCalificacionDAO();
    public abstract CarerraDAO getCarerraDAO();
    public abstract CursoDAO getCursoDAO();
    public abstract CursoEvaluacionDAO getCursoEvaluacionDAO();
    public abstract DiaDAO getDiaDAO();
    public abstract EstadoDAO getEstadoDAO();
    public abstract EvaluacionDAO getEvaluacionDAO();
    public abstract HorarioDAO getHorarioDAO();
    public abstract ProfesorDAO getProfesorDAO();
    public abstract RegistroNotaDAO getRegistroNota();
    public abstract SeccionDAO getSeccion();
    public abstract TipoAulaDAO getTipoAulaDAO();

    public static Factory getFactory(int tipo) {
        switch (tipo) {
            case TIPO_SQLITE :
                return new SQLiteFactory();
            default :
                return null;
        }
    }


}
