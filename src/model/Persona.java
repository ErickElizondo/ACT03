package model;

public class Persona {
  protected String identificacion;
  protected String nombre;
  protected String apellido1;
  protected String apellido2;
  protected int celular;
  protected String correo;

  public Persona(String identificacion, String nombre, String apellido1, String apellido2, int celular, String correo) {
	this.identificacion = identificacion;
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.celular = celular;
	this.correo = correo;
  }

  public String getIdentificacion() {
	return identificacion;
  }

  public void setIdentificacion(String identificacion) {
	this.identificacion = identificacion;
  }

  public String getNombre() {
	return nombre;
  }

  public void setNombre(String nombre) {
	this.nombre = nombre;
  }

  public String getApellido1() {
	return apellido1;
  }

  public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
  }

  public String getApellido2() {
	return apellido2;
  }

  public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
  }

  public int getCelular() {
	return celular;
  }

  public void setCelular(int celular) {
	this.celular = celular;
  }

  public String getCorreo() {
	return correo;
  }

  public void setCorreo(String correo) {
	this.correo = correo;
  }
}
