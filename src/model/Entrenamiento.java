package model;

public class Entrenamiento {
    private String entrenamiento;
    private int codigo;

    public Entrenamiento(String entrenamiento, int codigo) {
        this.entrenamiento = entrenamiento;
        this.codigo = codigo;
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
