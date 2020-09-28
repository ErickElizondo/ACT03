package controller;

import model.Horario;

public class HorarioController {
  private Horario model;
  
  public HorarioController(Horario model) {
	this.model = model;
  }

  public Horario getModel() {
    return model;
  }

  public void setModel(Horario model) {
    this.model = model;
  }
}
