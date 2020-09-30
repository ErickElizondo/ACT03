package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Sala;
import model.Servicio;
import model.Instructor;

public class Conector {
  private static SalaController salaCont = new SalaController();
  private static ServicioController servicioCont = new ServicioController();
  private static PersonaController personas = new PersonaController();
  private static ClaseController clases = new ClaseController();
  private static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {
	loop: while(true){
	  System.out.println("Menu:");
	  System.out.println("1. Definir sala");
	  System.out.println("2. Registrar Servicio");
	  System.out.println("20. Visualizar Servicio");
	  System.out.println("3. Registrar Instructor");
	  System.out.println("30. Visualizar instructores");
	  System.out.println("4. Visualizar instructores");
	  System.out.println("5. Visualizar instructores");
	  int input = scan.nextInt();
	  switch (input){
	  case 1:
		crearSala();
		break;
	  case 2:
		crearServicio();
		break;
	  case 20:
		mostrarServicios();
		break;
	  case 3:
		crearInstructor();
		break;
	  case 30:
		mostrarInstructores();
		break;
	  case 4:
		mostrarInstructores();
		break;
	  case 5:
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

	salaCont.setModel(new Sala(nombre, capacidad, horaInicio, horaFin, matricula, mensualidad));

	System.out.println("Se ha creado la sala.");
  }

  public static void crearServicio(){
	System.out.println("Indique el servicio: ");
	String descripcion = scan.next();
	Servicio servicio = new Servicio(descripcion);
	if(!servicioCont.isRepeatead(descripcion)) {
	  servicioCont.getServicios().add(servicio);
	  System.out.println("Se ha agregado el servicion");
	}else {
	  System.out.println("No se ha agregado el servicio");
	}
  }
  
  public static void crearInstructor(){
	System.out.println("Indique el numero de identificacion: ");
	String identificacion = scan.next();

	System.out.println("Nombre del instructor: ");
	String nombre = scan.next();

	System.out.println("Primer apellido del instructor: ");
	String apellido1 = scan.next();

	System.out.println("Segundo apellido del instructor: ");
	String apellido2 = scan.next();

	System.out.println("Numero de celular del instructor: ");
	int celular = scan.nextInt();

	System.out.println("Correo electronico del instructor: ");
	String correo = scan.next();

	System.out.println("Codigo del instructor: ");
	int idInstructor = scan.nextInt();

	personas.addInstructor(new Instructor(identificacion, nombre, apellido1, apellido2, celular, correo, idInstructor));
	System.out.println("Se ha creado el instructor para la sala actual");
  }

  public static void mostrarServicios(){
	ArrayList<Servicio> servicios = servicioCont.getServicios();
	if(!servicios.isEmpty()){
	  for(Servicio servicio: servicios) {
		System.out.println(servicio.toString());
	  }
	}else
	  System.out.println("No hay servicios en la sala");
  }

  public static void mostrarInstructores(){
	ArrayList<Instructor> instructores= personas.getInstructores();
	if(!instructores.isEmpty()){
	  for(Instructor instructor: instructores) {
		System.out.println(instructor.toString());
	  }
	}else
	  System.out.println("No hay instructores en la sala");
  }
  
  public static void matricularCliente() {
	
  }
  
  public static void programarClase() {
	
  }
}
