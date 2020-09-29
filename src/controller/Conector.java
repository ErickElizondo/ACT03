package controller;

import model.Clase;
import model.Entrenamiento;
import model.Sala;
import model.Servicio;
import model.Instructor;


import java.util.ArrayList;
import java.util.Scanner;

public class Conector {
    private static SalaController salaCont = new SalaController();
    private static ServicioController servicioCont = new ServicioController();
    private static PersonaController instructorCont = new PersonaController();
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Entrenamiento> entrenamientos = new ArrayList<>();
    private static ArrayList<Instructor> instructores = new ArrayList<>();
    public static void main(String[] args) {
        loop: while(true){
            System.out.println("Menu:");
            System.out.println("1. Definir sala");
            System.out.println("2. Registrar Servicio");
            System.out.println("20. Visualizar Servicio");
            System.out.println("3. Registrar Instructor");
            System.out.println("30. Visualizar instructores");
            int input = scan.nextInt();
            switch (input){
                case 1:
                    crearSala();
                    break;
                case 2:
                    crearServicio();
                    break;
                case 20:
                    mostrarServicio();
                    break;
                case 3:
                    crearInstructor();
                    break;
                case 30:
                    mostrarInstructores();
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
    public static void crearInstructor(){
        System.out.println("Indique el número de identificación: ");
        String identificacion = scan.next();

        System.out.println("Nombre del instructor: ");
        String nombre = scan.next();

        System.out.println("Primer apellido del instructor: ");
        String apellido1 = scan.next();

        System.out.println("Segundo apellido del instructor: ");
        String apellido2 = scan.next();

        System.out.println("Número de celular del instructor: ");
        int celular = scan.nextInt();

        System.out.println("Correo electronico del instructor: ");
        String correo = scan.next();

        System.out.println("Código del instructor: ");
        int idInstructor = scan.nextInt();

        instructorCont = new PersonaController(new Instructor(identificacion, nombre, apellido1, apellido2, celular, correo, idInstructor));
        instructores.add(new Instructor(identificacion, nombre, apellido1, apellido2, celular, correo, idInstructor));
        System.out.println("Se ha creado el instructor para la sala actual");
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

    public static void mostrarInstructores(){
        if(instructores.isEmpty()){
            for(Instructor instructor:instructores) {
                System.out.println(instructor.toString());
            }
        }else
            System.out.println("No hay instructores en la sala");
    }
}
