package model;

import java.util.Collection;

public class Calendario {
    private Collection<Horario> calendario;

    public Calendario(Collection<Horario> calendario) {
        this.calendario = calendario;
    }

    public Collection<Horario> getCalendario() {
        return calendario;
    }

    public void setCalendario(Collection<Horario> calendario) {
        this.calendario = calendario;
    }

    public void addToCalendario(Horario horario){
        this.calendario.add(horario);
    }
}
