package model;
import java.util.ArrayList;

public class Instructor extends Persona{
  private int idInstructor;
  private ArrayList<Servicio> especialidades = new ArrayList<>();
  public Instructor(String identificacion, String nombre, String apellido1, String apellido2, int celular, String correo, int idInstructor) {
	super(identificacion, nombre, apellido1, apellido2, celular, correo);
	this.idInstructor = idInstructor;
  }

  public int getIdInstructor() {
	return idInstructor;
  }

  public void setIdInstructor(int idInstructor) {
	this.idInstructor = idInstructor;
  }

  public ArrayList<Servicio> getEspecialidades() {
	return especialidades;
  }

  public void setEspecialidades(ArrayList<Servicio> especialidades) {
	this.especialidades = especialidades;
  }

  @Override
  public String toString() {
	return "Instructor{" +
		"idInstructor=" + idInstructor +
		", especialidades=" + especialidades +
		", identificacion='" + identificacion + '\'' +
		", nombre='" + nombre + '\'' +
		", apellido1='" + apellido1 + '\'' +
		", apellido2='" + apellido2 + '\'' +
		", celular=" + celular +
		", correo='" + correo + '\'' +
		'}';
  }
}
