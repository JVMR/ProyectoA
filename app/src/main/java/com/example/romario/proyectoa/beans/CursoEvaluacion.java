package com.example.romario.proyectoa.beans;

import java.io.Serializable;

public class CursoEvaluacion implements Serializable {
     private int cursosEvaluacionesId;
     private int cursoId;
     private int evaluacionId;
     private int porcentaje;

    public int getCursosEvaluacionesId() {
        return cursosEvaluacionesId;
    }

    public void setCursosEvaluacionesId(int cursosEvaluacionesId) {
        this.cursosEvaluacionesId = cursosEvaluacionesId;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public int getEvaluacionId() {
        return evaluacionId;
    }

    public void setEvaluacionId(int evaluacionId) {
        this.evaluacionId = evaluacionId;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
}


