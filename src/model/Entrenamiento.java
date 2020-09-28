package model;

import java.util.concurrent.atomic.AtomicInteger;

public class Entrenamiento {
    private String entrenamiento;
    private int codigo;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Entrenamiento(String entrenamiento) {
        this.entrenamiento = entrenamiento;
        this.codigo = count.incrementAndGet();
    }

    public String getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(String entrenamiento) {
        this.entrenamiento = entrenamiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
