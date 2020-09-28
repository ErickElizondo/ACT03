package model;
import java.util.ArrayList;
public class Clase {
    private Instructor instructor;
    private boolean esTemporal;
    private int numeroClase;
    private ArrayList<Integer> hora;
    private ArrayList<Cliente> listaClientes;

    public Clase(Instructor instructor, boolean esTemporal, int numeroClase) {
        this.instructor = instructor;
        this.esTemporal = esTemporal;
        this.numeroClase = numeroClase;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public boolean isEsTemporal() {
        return esTemporal;
    }

    public void setEsTemporal(boolean esTemporal) {
        this.esTemporal = esTemporal;
    }

    public ArrayList<Integer> getHora() {
        return hora;
    }

    public void setHora(ArrayList<Integer> hora) {
        this.hora = hora;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public int getNumeroClase() {
        return numeroClase;
    }

    public void setNumeroClase(int numeroClase) {
        this.numeroClase = numeroClase;
    }
}
