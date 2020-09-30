package controller;

import java.util.ArrayList;

import model.Horario;

public class HorarioController {
  private ArrayList<Horario> horarios = new ArrayList<>();
  
  public HorarioController() {}

  public ArrayList<Horario> getHorarios() {
    return horarios;
  }

  public void setHorarios(ArrayList<Horario> horarios) {
    this.horarios = horarios;
  }
  
  public void addHorario(Horario horario) {
	horarios.add(horario);
  }
  
  public Horario getHorario(int id) {
	for(Horario horario: horarios) {
	  if(horario.getId() == id) {
		return horario;
	  }
	}
	return null;
  }
}
