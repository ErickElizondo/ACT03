package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Instructor;

public class PersonaController {
  private ArrayList<Instructor> instructores = new ArrayList<>();
  private ArrayList<Cliente> clientes = new ArrayList<>();
  
  public PersonaController() {}

  public ArrayList<Instructor> getInstructores() {
    return instructores;
  }

  public void setInstructores(ArrayList<Instructor> instructores) {
    this.instructores = instructores;
  }

  public ArrayList<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(ArrayList<Cliente> clientes) {
    this.clientes = clientes;
  }

  public void addCliente(Cliente cliente) {
	clientes.add(cliente);
  }
  
  public void addInstructor(Instructor instructor) {
	instructores.add(instructor);
  }
}
