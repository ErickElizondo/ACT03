package model;

import java.util.concurrent.atomic.AtomicInteger;

public class Servicio {
  private int numServicio;
  private String descripcion;
  private static final AtomicInteger count = new AtomicInteger(0);

  public Servicio(String descripcion) {
	this.numServicio = count.incrementAndGet(); //Para evitar ver si existe el numServicio, es como el IDENITTY
	this.descripcion = descripcion;
  }

  public int getNumServicio() {
	return numServicio;
  }

  public void setNumServicio(int numServicio) {
	this.numServicio = numServicio;
  }

  public String getDescripcion() {
	return descripcion;
  }

  public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
  }

  public String toString(){
	return "numServicio: " + numServicio + "\n"+ "Tipo de servicio: " + descripcion;
  }
}
