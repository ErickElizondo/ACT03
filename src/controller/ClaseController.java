package controller;

import model.Clase;

public class ClaseController {
  private Clase model;
  
  public ClaseController(Clase model) {
	this.model = model;
  }

  public Clase getModel() {
    return model;
  }

  public void setModel(Clase model) {
    this.model = model;
  }
}
