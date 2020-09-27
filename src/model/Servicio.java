package model;

public class Servicio {
    private Horario horarioInstructor;
    private int costoMatreicula;
    private int mensualidad;
    private int numServicio;
    private Entrenamiento tipoEntrenamiento;

    public Servicio(int costoMatreicula, int mensualidad, int numServicio, Entrenamiento tipoEntrenamiento) {
        this.costoMatreicula = costoMatreicula;
        this.mensualidad = mensualidad;
        this.numServicio = numServicio;
        this.tipoEntrenamiento = tipoEntrenamiento;
    }

    public Horario getHorarioInstructor() {
        return horarioInstructor;
    }

    public void setHorarioInstructor(Horario horarioInstructor) {
        this.horarioInstructor = horarioInstructor;
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

    public int getNumServicio() {
        return numServicio;
    }

    public void setNumServicio(int numServicio) {
        this.numServicio = numServicio;
    }

    public Entrenamiento getTipoEntrenamiento() {
        return tipoEntrenamiento;
    }

    public void setTipoEntrenamiento(Entrenamiento tipoEntrenamiento) {
        this.tipoEntrenamiento = tipoEntrenamiento;
    }
}
