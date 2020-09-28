package controller;

import model.Clase;
import model.Entrenamiento;
import model.Sala;
import model.Servicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Conector {
    private static SalaController salaCont = new SalaController();
    private static ServicioController servicioCont = new ServicioController();
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Entrenamiento> entrenamientos = new ArrayList<>();
    public static void main(String[] args) {
        loop: while(true){
            System.out.println("Menu:");
            System.out.println("1. Definir sala");
            System.out.println("2. Registrar Servicio");
            System.out.println("3. Visualizar Servicio");
            int input = scan.nextInt();
            switch (input){
                case 1:
                    crearSala();
                    break;
                case 2:
                    crearServicio();
                    break;
                case 3:
                    mostrarServicio();
                    break;
                default:
                    break loop;
            }
        }


    }

    public static void crearSala(){
        System.out.println("Indique el nombre de la sala: ");
        String nombre = scan.next();

        System.out.println("Indique la capacidad: ");
        int capacidad = scan.nextInt();

        System.out.println("Indique la hora de inicio ");
        int horaInicio = scan.nextInt();

        System.out.println("Indique la hora de finalización ");
        int horaFin = scan.nextInt();

        System.out.println("Indique el costo de la matrícula ");
        int matricula = scan.nextInt();

        System.out.println("Indique el costo de la mensualidad: ");
        int mensualidad = scan.nextInt();

        salaCont = new SalaController(new Sala(nombre, capacidad, horaInicio, horaFin, matricula, mensualidad));

        System.out.println("Se ha creado la sala.");
    }

    public static void crearServicio(){
        Entrenamiento entrenamiento = crearEntrenamiento();
        Servicio servicio = new Servicio(entrenamiento);
        servicioCont.getModel().add(servicio);
        System.out.println("Se ha creado el servicio.");
        salaCont.getModel().addToListaServicio(servicio);
        /*
        if (servicioCont.findServicio(numServicio)){
            System.out.println("Ya existe ese servicio. ");
            return;
        }else{

        }*/

    }

    public static Entrenamiento crearEntrenamiento(){
        System.out.println("Defina el tipo de entrenamiento");
        String tipoEntrenamiento = scan.next();
        Entrenamiento find = findEntrenamiento(tipoEntrenamiento);
        if(find != null){
            return find;
        }else{
            Entrenamiento entrenamiento = new Entrenamiento(tipoEntrenamiento);
            return entrenamiento;
        }
    }

    public static Entrenamiento findEntrenamiento(String tipoEntrenamiento){
        for (Entrenamiento target:entrenamientos
             ) {
            if(target.getEntrenamiento() == tipoEntrenamiento)
                return target;
        }
        return null;
    }

    public static void mostrarServicio(){
        System.out.println("Indique el código del servicio: ");
        int codigo = scan.nextInt();
        Servicio servicio = servicioCont.findServicio(codigo);
        if(servicio!=null){
            servicio.mostrarDatos();
        }else
            System.out.println("No existe ese servicio");
    }


}
