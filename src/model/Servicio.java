package model;

import java.util.concurrent.atomic.AtomicInteger;

public class Servicio {
    private int numServicio;
    private Entrenamiento tipoEntrenamiento;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Servicio(Entrenamiento tipoEntrenamiento) {
        this.numServicio = count.incrementAndGet(); //Para evitar ver si existe el numServicio, es como el IDENITTY
        this.tipoEntrenamiento = tipoEntrenamiento;
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

    public void mostrarDatos(){
        System.out.println("numServicio: "+ numServicio);
        System.out.println("Tipo de entrenamiento: " + tipoEntrenamiento.getEntrenamiento());
    }
}
