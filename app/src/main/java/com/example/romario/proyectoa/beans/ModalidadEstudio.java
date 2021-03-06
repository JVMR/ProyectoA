package com.example.romario.proyectoa.beans;

import java.io.Serializable;

/**
 * Created by Hernan on 19/05/2015.
 */
public class ModalidadEstudio implements Serializable {

    private int modalidadEstudioId;
    private String descripcion;
    private String abreviatura;

    @Override
    public String toString()
    {
        return abreviatura+" - "+descripcion;
    }

    public int getModalidadEstudioId() {
        return modalidadEstudioId;
    }

    public void setModalidadEstudioId(int modalidadEstudioId) {
        this.modalidadEstudioId = modalidadEstudioId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
}
