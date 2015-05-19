package com.example.romario.proyectoa.beans;

import java.io.Serializable;

/**
 * Created by Hernan on 19/05/2015.
 */
public class Matricula implements Serializable {
    private int matriculaId;
    private int alumnoId;
    private int cicloId;
    private int estadoId;

    public int getMatriculaId() {
        return matriculaId;
    }

    public void setMatriculaId(int matriculaId) {
        this.matriculaId = matriculaId;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getCicloId() {
        return cicloId;
    }

    public void setCicloId(int cicloId) {
        this.cicloId = cicloId;
    }

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }
}
