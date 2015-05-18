package com.example.romario.proyectoa.dao;

import com.example.romario.proyectoa.dao.alumno.AlumnoDAO;
import com.example.romario.proyectoa.dao.alumnoHorario.AlumnoHorarioDAO;
import com.example.romario.proyectoa.dao.aula.AulaDAO;
import com.example.romario.proyectoa.dao.calificacion.CalificacionDAO;
import com.example.romario.proyectoa.dao.carerra.CarerraDAO;
import com.example.romario.proyectoa.dao.curso.CursoDAO;
import com.example.romario.proyectoa.dao.cursoEvaluacion.CursoEvaluacionDAO;
import com.example.romario.proyectoa.dao.dia.DiaDAO;
import com.example.romario.proyectoa.dao.estado.EstadoDAO;
import com.example.romario.proyectoa.dao.evaluacion.EvaluacionDAO;
import com.example.romario.proyectoa.dao.horario.HorarioDAO;
import com.example.romario.proyectoa.dao.profesor.ProfesorDAO;
import com.example.romario.proyectoa.dao.registroNota.RegistroNotaDAO;
import com.example.romario.proyectoa.dao.seccion.SeccionDAO;
import com.example.romario.proyectoa.dao.tipoAula.TipoAulaDAO;

/**
 * Created by Hernan on 17/05/2015.
 */
public abstract class Factory {
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
