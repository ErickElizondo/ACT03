package controller;

import java.util.ArrayList;

import model.Clase;

public class ClaseController {
  private ArrayList<Clase> clases = new ArrayList<>();
  
  public ClaseController() {}

  public ArrayList<Clase> getClases() {
    return clases;
  }

  public void setClases(ArrayList<Clase> clases) {
    this.clases = clases;
  }
  
  public void addClase(Clase clase) {
	clases.add(clase);
  }
}
