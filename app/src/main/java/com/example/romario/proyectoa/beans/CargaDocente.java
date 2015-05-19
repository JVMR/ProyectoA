package com.example.romario.proyectoa.beans;

import java.io.Serializable;

/**
 * Created by Hernan on 19/05/2015.
 */
public class CargaDocente implements Serializable {
    private int cargaDocenteId;
    private int cursoId;
    private int profesorId;
    private int cicloId;

    public int getCargaDocenteId() {
        return cargaDocenteId;
    }

    public void setCargaDocenteId(int cargaDocenteId) {
        this.cargaDocenteId = cargaDocenteId;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public int getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(int profesorId) {
        this.profesorId = profesorId;
    }

    public int getCicloId() {
        return cicloId;
    }

    public void setCicloId(int cicloId) {
        this.cicloId = cicloId;
    }
}
