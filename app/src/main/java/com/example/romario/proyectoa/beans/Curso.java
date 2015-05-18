package com.example.romario.proyectoa.beans;

import java.io.Serializable;

public class Curso implements Serializable {
     private int cursoId;
     private String descripcion;

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}


