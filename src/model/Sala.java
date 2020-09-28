package model;

import java.util.Collection;

public class Sala {
    private String nombre;
    private int capacidad;
    private int horarioAtencionInicio;
    private int horarioAtencionFin;
    private int costoMatreicula;
    private int mensualidad;
    private Collection<Servicio> listaServicio ;
    private Collection<Instructor> listaInstructores;

    public Sala(String nombre, int capacidad, int horarioAtencionInicio, int horarioAtencionFin, int costoMatreicula, int mensualidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.horarioAtencionInicio = horarioAtencionInicio;
        this.horarioAtencionFin = horarioAtencionFin;
        this.costoMatreicula = costoMatreicula;
        this.mensualidad = mensualidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getHorarioAtencionInicio() {
        return horarioAtencionInicio;
    }

    public void setHorarioAtencionInicio(int horarioAtencionInicio) {
        this.horarioAtencionInicio = horarioAtencionInicio;
    }

    public int getHorarioAtencionFin() {
        return horarioAtencionFin;
    }

    public void setHorarioAtencionFin(int horarioAtencionFin) {
        this.horarioAtencionFin = horarioAtencionFin;
    }

    public Collection<Servicio> getListaServicio() {
        return listaServicio;
    }

    public void setListaServicio(Collection<Servicio> listaServicio) {
        this.listaServicio = listaServicio;
    }

    public Collection<Instructor> getListaInstructores() {
        return listaInstructores;
    }

    public void setListaInstructores(Collection<Instructor> listaInstructores) {
        this.listaInstructores = listaInstructores;
    }

    public void addToListaServicio(Servicio servicio){
        this.listaServicio.add(servicio);
    }

    public void addToListaInstructores(Instructor instructor){
        this.listaInstructores.add(instructor);
    }

    public int getCostoMatreicula() {
        return costoMatreicula;
    }

    public void setCostoMatreicula(int costoMatreicula) {
        this.costoMatreicula = costoMatreicula;
    }

    public int getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(int mensualidad) {
        this.mensualidad = mensualidad;
    }
}

