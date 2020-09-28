package controller;

import model.Sala;

public class SalaController {
  private Sala model;

  public SalaController(Sala model) {
	this.model = model;
  }

  public Sala getModel() {
    return model;
  }

  public void setModel(Sala model) {
    this.model = model;
  }
}
