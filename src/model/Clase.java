package model;

import java.util.ArrayList;

public class Clase {
  private Instructor instructor;
  private boolean esTemporal;
  private int numeroClase;
  private Horario hora;
  private ArrayList<Cliente> listaClientes = new ArrayList<>();
  private int aforo;
  private Servicio tipoServicio;

  public Clase(Instructor instructor, boolean esTemporal, int numeroClase, int aforo, Horario hora, Servicio tipoServicio) {
	this.instructor = instructor;
	this.esTemporal = esTemporal;
	this.numeroClase = numeroClase;
	this.aforo = aforo;
	this.hora = hora;
	this.tipoServicio = tipoServicio;
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

  public Horario getHora() {
	return hora;
  }

  public void setHora(Horario hora) {
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

  public int getAforo() {
	return aforo;
  }

  public void setAforo(int aforo) {
	this.aforo = aforo;
  }

  public Servicio getTipoServicio() {
    return tipoServicio;
  }

  public void setTipoServicio(Servicio tipoServicio) {
    this.tipoServicio = tipoServicio;
  }
}
