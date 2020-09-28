package controller;
import model.Servicio;

import java.util.ArrayList;

public class ServicioController {
  private ArrayList<Servicio> model = new ArrayList<>();

  public ArrayList<Servicio> getModel() {
    return model;
  }

  public void setModel(ArrayList<Servicio> model) {
    this.model = model;
  }
  
  public Servicio findServicio(int numServicio){
    for (Servicio target:model
         ) {
      if(target.getNumServicio() == numServicio)
        return target;
    }
    return null;
  }

}
