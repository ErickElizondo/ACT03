package controller;

import model.Servicio;

import java.util.ArrayList;

public class ServicioController {
  private ArrayList<Servicio> servicios = new ArrayList<>();

  public ArrayList<Servicio> getServicios() {
    return servicios;
  }

  public void setServicios(ArrayList<Servicio> servicios) {
    this.servicios = servicios;
  }
  
  public Servicio findServicio(int numServicio){
    for (Servicio target:servicios) {
      if(target.getNumServicio() == numServicio)
        return target;
    }
    return null;
  }
  
  public boolean isRepeatead(String descripcion) {
	for(Servicio servicio: servicios) {
	  if(servicio.getDescripcion().equals(descripcion)) {
		return true;
	  }
	}
	return false;
  }
}
