package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Sala;
import model.Servicio;
import model.TipoEstado;
import model.Clase;
import model.Cliente;
import model.Dia;
import model.Horario;
import model.Instructor;

public class Conector {
  private static SalaController salaCont = new SalaController();
  private static ServicioController servicioCont = new ServicioController();
  private static PersonaController personas = new PersonaController();
  private static ClaseController clases = new ClaseController();
  private static HorarioController horarios = new HorarioController();
  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args){
	ArrayList<Integer> tiempos = new ArrayList<>();
	tiempos.add(9);  //hora inicio
	tiempos.add(30); //minutos inicio
	tiempos.add(11); //hora final formato 24 horas
	tiempos.add(30); //minutos final
	Horario horario = new Horario ();
	horario.setDia(Dia.LUNES);
	horario.setId(1);
	horario.setTiempos(tiempos);
	horarios.addHorario(horario);

	loop: while(true){
	  System.out.println("Menu:");
	  System.out.println("1. Definir sala");
	  System.out.println("2. Registrar Servicio");
	  System.out.println("20. Visualizar Servicio");
	  System.out.println("3. Registrar Instructor");
	  System.out.println("30. Visualizar instructores");
	  System.out.println("4. Registrar clientre");
	  System.out.println("5. Programar clase");
	  System.out.println("6. Reservar clase");
	  System.out.println("7. Ver una clase");
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
		matricularCliente();
		break;
	  case 5:
		programarClase();
		break;
	  case 6:
		reservarClase();
		break;
	  case 7:
		verClase();
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

	System.out.println("Indique la hora de finalizacionn ");
	int horaFin = scan.nextInt();

	System.out.println("Indique el costo de la matricula ");
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
	System.out.println("Indique el numero de identificacion: ");
	String identificacion = scan.next();

	System.out.println("Nombre del cliente: ");
	String nombre = scan.next();

	System.out.println("Primer apellido del cliente: ");
	String apellido1 = scan.next();

	System.out.println("Segundo apellido del cliente: ");
	String apellido2 = scan.next();

	System.out.println("Numero de celular del cliente: ");
	int celular = scan.nextInt();

	System.out.println("Correo electronico del cliente: ");
	String correo = scan.next();

	System.out.println("Codigo del cliente: ");
	int idCliente = scan.nextInt();
	if(personas.getClienteByCed(identificacion) == null && personas.getClienteByID(idCliente) == null) {
	  Cliente cliente = new Cliente(identificacion, nombre, apellido1, apellido2, celular, correo, idCliente, TipoEstado.inactivo);
	  personas.addCliente(cliente);
	  System.out.println("Se ha agregado el cliente");
	  for(Cliente cliente2: personas.getClientes()) {
		System.out.println(cliente2.getIdentificacion());
	  }
	}else {
	  System.out.println("No se ha podido agregar el cliente");
	}
  }

  public static void programarClase() {
	System.out.println("Indique el id del horario: ");
	int idHorario = scan.nextInt();

	System.out.println("Indique el id del instructor: ");
	int idInstructor = scan.nextInt();

	System.out.println("Indique el id del servicio ");
	int idServicio = scan.nextInt();
	
	System.out.println("Indique si la clase es temporal ");
	int temporal = scan.nextInt();
	boolean temp = true;
	if(temporal == 0) {
	  temp = false;
	}else {
	  temp = true;
	}

	System.out.println("Indique el numero de clase ");
	int numero = scan.nextInt();

	System.out.println("Indique el aforo de la sala: ");
	int aforo = scan.nextInt();
	
	Horario horario = horarios.getHorario(idHorario);
	Instructor instructor = personas.getInstructorById(idInstructor);
	Servicio servicio = servicioCont.findServicio(idServicio);
	
	if(horario != null && instructor != null && servicio != null) {
	  clases.addClase(new Clase(instructor, temp, numero, aforo, horario, servicio));
		System.out.println("Se ha creado la clase");
	}else {
	  System.out.println("Asegurese de indicar los ids correctos");
	}
  }

  public static void reservarClase(){
	System.out.println("Indique la identificacion del cliente: ");
	String idCliente = scan.next();

	System.out.println("Indique el numero de clase a reservar: ");
	String idClase = scan.next();

	ArrayList<Clase> clasesExistentes = clases.getClases();
	boolean claseEncontrada = false;
	boolean clienteEncontrado = false;

	for (Clase c : clases.getClases()){
	  if(Integer.toString(c.getNumeroClase()).equals(idClase)){
		claseEncontrada = true;

		for(Cliente p : personas.getClientes()){
		  if(p.getIdentificacion().equals(idCliente)){
			clienteEncontrado = true;
			if(c.getAforo() > 0){
			  c.setAforo(c.getAforo()-1);
			  c.getListaClientes().add(p);
			  System.out.println("Cliente reservó la clase de manera exitosa");
			}else{
			  System.out.println("Error: no hay espacio disponible en esta clase");
			}

			break;
		  }
		}

		break;
	  }
	}

	if(!claseEncontrada){
	  System.out.println("Error: La clase no fue encontrada");
	}

	if(!clienteEncontrado){
	  System.out.println("Error: El cliente no fue encontrado");
	}
  }

  public static void verClase(){
	System.out.println("Indique la clase que desea ver: ");
	String idClase = scan.next();
	boolean claseEncontrada = false;

	for (Clase c : clases.getClases()){
	  if(Integer.toString(c.getNumeroClase()).equals(idClase)){
		claseEncontrada = true;
		System.out.print("Código de Clase: ");
		System.out.println(c.getNumeroClase());
		System.out.print("Nombre Instructor: ");
		System.out.println(c.getInstructor().getNombre());
		System.out.print("Aforo: ");
		System.out.println(c.getAforo());
		System.out.println("Horas disponibles: ");
		System.out.println("\t" + c.getHora().toString());
		System.out.println("Especialidades: ");
		for(Servicio s: c.getInstructor().getEspecialidades()){
		  System.out.println("\t" + s.getDescripcion());
		}
		break;
	  }
	}
	if(!claseEncontrada){
	  System.out.println("Error: La clase no fue encontrada");
	}
  }
}
