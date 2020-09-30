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
  
  public  Cliente getClienteByID(int id) {
	for(Cliente cliente: clientes) {
	  if(cliente.getIdCliente() == id) {
		return cliente;
	  }
	}
	return null;
  }
  
  public  Cliente getClienteByCed(String ced) {
	for(Cliente cliente: clientes) {
	  if(cliente.getIdentificacion().equals(ced)) {
		return cliente;
	  }
	}
	return null;
  }
  
  public Instructor getInstructorById(int id) {
	for(Instructor instructor: instructores) {
	  if(instructor.getIdInstructor() == id) {
		return instructor;
	  }
	}
	return null;
}
  
}
