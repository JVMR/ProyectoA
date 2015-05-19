package com.example.romario.proyectoa.beans;

import java.io.Serializable;

/**
 * Created by Hernan on 19/05/2015.
 */
public class Ciclo implements Serializable {
    private int cicloId;
    private String descripcion;

    public int getCicloId() {
        return cicloId;
    }

    public void setCicloId(int cicloId) {
        this.cicloId = cicloId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
