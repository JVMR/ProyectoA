package com.example.romario.proyectoa.dao;

import android.content.Context;

import com.example.romario.proyectoa.dao.alumno.AlumnoDAO;
import com.example.romario.proyectoa.dao.alumnoHorario.AlumnoHorarioDAO;
import com.example.romario.proyectoa.dao.aula.AulaDAO;
import com.example.romario.proyectoa.dao.calificacion.CalificacionDAO;
import com.example.romario.proyectoa.dao.carerra.CarerraDAO;
import com.example.romario.proyectoa.dao.cargaDocente.CargaDocenteDAO;
import com.example.romario.proyectoa.dao.ciclo.CicloDAO;
import com.example.romario.proyectoa.dao.curso.CursoDAO;
import com.example.romario.proyectoa.dao.cursoEvaluacion.CursoEvaluacionDAO;
import com.example.romario.proyectoa.dao.dia.DiaDAO;
import com.example.romario.proyectoa.dao.estado.EstadoDAO;
import com.example.romario.proyectoa.dao.evaluacion.EvaluacionDAO;
import com.example.romario.proyectoa.dao.horario.HorarioDAO;
import com.example.romario.proyectoa.dao.matricula.MatriculaDAO;
import com.example.romario.proyectoa.dao.modalidadEstudio.ModalidadEstudioDAO;
import com.example.romario.proyectoa.dao.profesor.ProfesorDAO;
import com.example.romario.proyectoa.dao.registroNota.RegistroNotaDAO;
import com.example.romario.proyectoa.dao.seccion.SeccionDAO;
import com.example.romario.proyectoa.dao.tipoAula.TipoAulaDAO;

/**
 * Created by Hernan on 17/05/2015.
 */
public abstract class Factory {
    public static final int TIPO_SQLITE = 1;

    public abstract AlumnoDAO getAlumnoDAO(Context context);
    public abstract AlumnoHorarioDAO getAlumnoHorarioDAO(Context context);
    public abstract AulaDAO getAulaDAO(Context context);
    public abstract CalificacionDAO getCalificacionDAO(Context context);
    public abstract CarerraDAO getCarerraDAO(Context context);
    public abstract CursoDAO getCursoDAO(Context context);
    public abstract CursoEvaluacionDAO getCursoEvaluacionDAO(Context context);
    public abstract DiaDAO getDiaDAO(Context context);
    public abstract EstadoDAO getEstadoDAO(Context context);
    public abstract EvaluacionDAO getEvaluacionDAO(Context context);
    public abstract HorarioDAO getHorarioDAO(Context context);
    public abstract ProfesorDAO getProfesorDAO(Context context);
    public abstract RegistroNotaDAO getRegistroNotaDAO(Context context);
    public abstract SeccionDAO getSeccionDAO(Context context);
    public abstract TipoAulaDAO getTipoAulaDAO(Context context);
    public abstract ModalidadEstudioDAO getModalidadEstudioDAO(Context context);
    public abstract CicloDAO getCicloDAO(Context context);
    public abstract CargaDocenteDAO getCargaDocenteDAO(Context context);
    public abstract MatriculaDAO getMatriculaDAO(Context context);

    public static Factory getFactory(int tipo) {
        switch (tipo) {
            case TIPO_SQLITE :
                return new SQLiteFactory();
            default :
                return null;
        }
    }
}
