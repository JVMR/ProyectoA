package com.example.romario.proyectoa.dao;

import android.content.Context;

import com.example.romario.proyectoa.dao.alumno.AlumnoDAO;
import com.example.romario.proyectoa.dao.alumno.SQLiteAlumnoDAO;
import com.example.romario.proyectoa.dao.alumnoHorario.AlumnoHorarioDAO;
import com.example.romario.proyectoa.dao.alumnoHorario.SQLiteAlumnoHorarioDAO;
import com.example.romario.proyectoa.dao.aula.AulaDAO;
import com.example.romario.proyectoa.dao.aula.SQLiteAulaDAO;
import com.example.romario.proyectoa.dao.calificacion.CalificacionDAO;
import com.example.romario.proyectoa.dao.calificacion.SQLiteCalificacionDAO;
import com.example.romario.proyectoa.dao.carerra.CarerraDAO;
import com.example.romario.proyectoa.dao.carerra.SQLiteCarerraDAO;
import com.example.romario.proyectoa.dao.cargaDocente.CargaDocenteDAO;
import com.example.romario.proyectoa.dao.cargaDocente.SQLiteCargaDocenteDAO;
import com.example.romario.proyectoa.dao.ciclo.CicloDAO;
import com.example.romario.proyectoa.dao.ciclo.SQLiteCicloDAO;
import com.example.romario.proyectoa.dao.curso.CursoDAO;
import com.example.romario.proyectoa.dao.curso.SQLiteCursoDAO;
import com.example.romario.proyectoa.dao.cursoEvaluacion.CursoEvaluacionDAO;
import com.example.romario.proyectoa.dao.dia.DiaDAO;
import com.example.romario.proyectoa.dao.dia.SQLiteDiaDAO;
import com.example.romario.proyectoa.dao.estado.EstadoDAO;
import com.example.romario.proyectoa.dao.estado.SQLiteEstadoDAO;
import com.example.romario.proyectoa.dao.evaluacion.EvaluacionDAO;
import com.example.romario.proyectoa.dao.cursoEvaluacion.SQLiteCursoEvaluacionDAO;
import com.example.romario.proyectoa.dao.evaluacion.SQLiteEvaluacionDAO;
import com.example.romario.proyectoa.dao.horario.HorarioDAO;
import com.example.romario.proyectoa.dao.horario.SQLiteHorarioDAO;
import com.example.romario.proyectoa.dao.matricula.SQLiteMatriculaDAO;
import com.example.romario.proyectoa.dao.matricula.MatriculaDAO;
import com.example.romario.proyectoa.dao.modalidadEstudio.ModalidadEstudioDAO;
import com.example.romario.proyectoa.dao.modalidadEstudio.SQLiteModalidadEstudioDAO;
import com.example.romario.proyectoa.dao.profesor.ProfesorDAO;
import com.example.romario.proyectoa.dao.profesor.SQLiteProfesorDAO;
import com.example.romario.proyectoa.dao.registroNota.RegistroNotaDAO;
import com.example.romario.proyectoa.dao.registroNota.SQLiteRegistroNotaDAO;
import com.example.romario.proyectoa.dao.seccion.SQLiteSeccionDAO;
import com.example.romario.proyectoa.dao.seccion.SeccionDAO;
import com.example.romario.proyectoa.dao.tipoAula.SQLiteTipoAulaDAO;
import com.example.romario.proyectoa.dao.tipoAula.TipoAulaDAO;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteFactory extends Factory {

    @Override
    public AlumnoDAO getAlumnoDAO(Context context) {
        return new SQLiteAlumnoDAO(context);
    }

    @Override
    public AlumnoHorarioDAO getAlumnoHorarioDAO(Context context) {
        return new SQLiteAlumnoHorarioDAO(context);
    }

    @Override
    public AulaDAO getAulaDAO(Context context) {
        return new SQLiteAulaDAO(context);
    }

    @Override
    public CalificacionDAO getCalificacionDAO(Context context) {
        return new SQLiteCalificacionDAO(context);
    }

    @Override
    public CarerraDAO getCarerraDAO(Context context) {
        return new SQLiteCarerraDAO(context);
    }

    @Override
    public CursoDAO getCursoDAO(Context context) {
        return new SQLiteCursoDAO(context);
    }

    @Override
    public CursoEvaluacionDAO getCursoEvaluacionDAO(Context context) {
        return new SQLiteCursoEvaluacionDAO(context);
    }

    @Override
    public DiaDAO getDiaDAO(Context context) {
        return new SQLiteDiaDAO(context);
    }

    @Override
    public EstadoDAO getEstadoDAO(Context context) {
        return new SQLiteEstadoDAO(context);
    }

    @Override
    public EvaluacionDAO getEvaluacionDAO(Context context) {
        return new SQLiteEvaluacionDAO(context);
    }

    @Override
    public HorarioDAO getHorarioDAO(Context context) {
        return new SQLiteHorarioDAO(context);
    }

    @Override
    public ProfesorDAO getProfesorDAO(Context context) {
        return new SQLiteProfesorDAO(context);
    }

    @Override
    public RegistroNotaDAO getRegistroNotaDAO(Context context) {
        return new SQLiteRegistroNotaDAO(context);
    }

    @Override
    public SeccionDAO getSeccionDAO(Context context) {
        return new SQLiteSeccionDAO(context);
    }

    @Override
    public TipoAulaDAO getTipoAulaDAO(Context context) {
        return new SQLiteTipoAulaDAO(context);
    }

    @Override
    public ModalidadEstudioDAO getModalidadEstudioDAO(Context context) {
        return new SQLiteModalidadEstudioDAO(context);
    }

    @Override
    public CicloDAO getCicloDAO(Context context) {
        return new SQLiteCicloDAO(context);
    }

    @Override
    public CargaDocenteDAO getCargaDocenteDAO(Context context) {
        return new SQLiteCargaDocenteDAO(context);
    }

    @Override
    public MatriculaDAO getMatriculaDAO(Context context) {
        return new SQLiteMatriculaDAO(context);
    }
}
