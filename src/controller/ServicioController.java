package controller;

import model.Servicio;

public class ServicioController {
  private Servicio model;
  
  public ServicioController(Servicio model) {
	this.model = model;
  }

  public Servicio getModel() {
    return model;
  }

  public void setModel(Servicio model) {
    this.model = model;
  }
}
