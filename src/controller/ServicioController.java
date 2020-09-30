package controller;

import model.Servicio;

import java.util.ArrayList;

public class ServicioController {
  private ArrayList<Servicio> models = new ArrayList<>();

  public ArrayList<Servicio> getModel() {
    return models;
  }

  public void setModel(ArrayList<Servicio> model) {
    this.models = model;
  }
  
  public Servicio findServicio(int numServicio){
    for (Servicio target:models
         ) {
      if(target.getNumServicio() == numServicio)
        return target;
    }
    return null;
  }
  
  public boolean isRepeatead(String descripcion) {
	for(Servicio servicio: models) {
	  if(servicio.getDescripcion().equals(descripcion)) {
		return true;
	  }
	}
	return false;
  }
}
