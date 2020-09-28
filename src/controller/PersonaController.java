package controller;

import model.Persona;

public class PersonaController {
  private Persona model;
  
  public PersonaController(Persona model){
	this.model = model;
  }

  public Persona getModel() {
    return model;
  }

  public void setModel(Persona model) {
    this.model = model;
  }
}
