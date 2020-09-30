package model;

public class Cliente extends Persona{
  private int idCliente;
  private TipoEstado estado;

  public Cliente(String identificacion, String nombre, String apellido1, String apellido2, int celular, String correo, int idCliente, TipoEstado estado) {
	super(identificacion, nombre, apellido1, apellido2, celular, correo);
	this.idCliente = idCliente;
	this.estado = estado;
  }

  public int getIdCliente() {
	return idCliente;
  }
  
  public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
  }

  public TipoEstado getEstado() {
	return estado;
  }

  public void setEstado(TipoEstado estado) {
	this.estado = estado;
  }
}
