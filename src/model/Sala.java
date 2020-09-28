package model;

import java.util.Collection;

public class Sala {
    private String nombre;
    private int capacidad;
    private int horarioAtencionInicio;
    private int horarioAtencionFin;
    private Collection<Servicio> listaServicio;
    private Collection<Instructor> listaInstructores;

    public Sala(String nombre, int capacidad, int horarioAtencionInicio, int horarioAtencionFin, Collection<Servicio> listaServicio, Collection<Instructor> listaInstructores) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.horarioAtencionInicio = horarioAtencionInicio;
        this.horarioAtencionFin = horarioAtencionFin;
        this.listaServicio = listaServicio;
        this.listaInstructores = listaInstructores;
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
    
}

