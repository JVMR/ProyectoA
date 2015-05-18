package com.example.romario.proyectoa.dao;

import com.example.romario.proyectoa.dao.alumno.AlumnoDAO;
import com.example.romario.proyectoa.dao.alumno.SQLiteAlumnoDAO;
import com.example.romario.proyectoa.dao.alumnoHorario.AlumnoHorarioDAO;
import com.example.romario.proyectoa.dao.alumnoHorario.SQLiteAlumnoHorarioDAO;
import com.example.romario.proyectoa.dao.aula.AulaDAO;
import com.example.romario.proyectoa.dao.aula.SQLiteAula;
import com.example.romario.proyectoa.dao.calificacion.CalificacionDAO;
import com.example.romario.proyectoa.dao.calificacion.SQLiteCalificacionDAO;
import com.example.romario.proyectoa.dao.carerra.CarerraDAO;
import com.example.romario.proyectoa.dao.carerra.SQLiteCarerraDAO;
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
import com.example.romario.proyectoa.dao.profesor.ProfesorDAO;
import com.example.romario.proyectoa.dao.profesor.SQLiteProfesorDAO;
import com.example.romario.proyectoa.dao.registroNota.RegistroNotaDAO;
import com.example.romario.proyectoa.dao.registroNota.SQLiteRegistroNota;
import com.example.romario.proyectoa.dao.seccion.SQLiteSeccion;
import com.example.romario.proyectoa.dao.seccion.SeccionDAO;
import com.example.romario.proyectoa.dao.tipoAula.SQLiteTipoAulaDAO;
import com.example.romario.proyectoa.dao.tipoAula.TipoAulaDAO;

/**
 * Created by Hernan on 17/05/2015.
 */
public class SQLiteFactory extends Factory {

    @Override
    public AlumnoDAO getAlumnoDAO() {
        return new SQLiteAlumnoDAO();
    }

    @Override
    public AlumnoHorarioDAO getAlumnoHorarioDAO() {
        return new SQLiteAlumnoHorarioDAO();
    }

    @Override
    public AulaDAO getAula() {
        return new SQLiteAula();
    }

    @Override
    public CalificacionDAO getCalificacionDAO() {
        return new SQLiteCalificacionDAO();
    }

    @Override
    public CarerraDAO getCarerraDAO() {
        return new SQLiteCarerraDAO();
    }

    @Override
    public CursoDAO getCursoDAO() {
        return new SQLiteCursoDAO();
    }

    @Override
    public CursoEvaluacionDAO getCursoEvaluacionDAO() {
        return new SQLiteCursoEvaluacionDAO();
    }

    @Override
    public DiaDAO getDiaDAO() {
        return new SQLiteDiaDAO();
    }

    @Override
    public EstadoDAO getEstadoDAO() {
        return new SQLiteEstadoDAO();
    }

    @Override
    public EvaluacionDAO getEvaluacionDAO() {
        return new SQLiteEvaluacionDAO();
    }

    @Override
    public HorarioDAO getHorarioDAO() {
        return new SQLiteHorarioDAO();
    }

    @Override
    public ProfesorDAO getProfesorDAO() {
        return new SQLiteProfesorDAO();
    }

    @Override
    public RegistroNotaDAO getRegistroNota() {
        return new SQLiteRegistroNota();
    }

    @Override
    public SeccionDAO getSeccion() {
        return new SQLiteSeccion();
    }

    @Override
    public TipoAulaDAO getTipoAulaDAO() {
        return new SQLiteTipoAulaDAO();
    }
}
