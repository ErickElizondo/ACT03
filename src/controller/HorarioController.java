package controller;

import java.util.ArrayList;

import model.Horario;

public class HorarioController {
  private ArrayList<Horario> horarios = new ArrayList<>();
  
  public HorarioController(Horario model) {}

  public ArrayList<Horario> getHorarios() {
    return horarios;
  }

  public void setHorarios(ArrayList<Horario> horarios) {
    this.horarios = horarios;
  }
}
