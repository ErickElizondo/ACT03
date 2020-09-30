package model;

import java.util.ArrayList;

public class Horario {
  private int id;
  private ArrayList<Integer> tiempos = new ArrayList<>();
  private Dia dia;
  
  public ArrayList<Integer> getTiempos() {
	return tiempos;
  }

  public void setTiempos(ArrayList<Integer> tiempos) {
	this.tiempos = tiempos;
  }

  public Dia getDia() {
    return dia;
  }

  public void setDia(Dia dia) {
    this.dia = dia;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  
  public String toString() {
	return "ID: "+ this.id + "\nHora Inicio: " + tiempos.get(0) + "\nMinutos inicio: " + tiempos.get(1)
		+ "\nHora final: "+ tiempos.get(2) + "\nMinutos final: " + tiempos.get(3)  + "\nDia: " + dia;
  }
}

