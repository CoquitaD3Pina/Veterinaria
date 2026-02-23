package menu.veterinaria;

import menu.veterinaria.model.*;
import menu.veterinaria.service.*;
import java.util.Scanner;

public class Main {

    static AnimalServicio animalServicio = new AnimalServicio();
    static EmpleadoServicio empleadoServicio = new EmpleadoServicio();
    static CitaServicio citaServicio = new CitaServicio();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = -1;
        while (opcion != 4) {
            System.out.println("\n=== Sistema Veterinaria ===");
            System.out.println("1. Animales");
            System.out.println("2. Empleados");
            System.out.println("3. Citas");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1: menuAnimales(); break;
                case 2: menuEmpleados(); break;
                case 3: menuCitas(); break;
                case 4: System.out.println("Hasta luego!"); break;
                default: System.out.println("Opcion invalida");
            }
        }  
    }
    static void menuAnimales() {
    int opcion = 0;
    while (opcion != 5) {
        System.out.println("\n=== Animales ===");
        System.out.println("1. Registrar animal");
        System.out.println("2. Ver todos");
        System.out.println("3. Buscar animal");
        System.out.println("4. Eliminar animal");
        System.out.println("5. Regresar");
        System.out.print("Elige una opcion: ");
        opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion) {
            case 1: registrarAnimal(); break;
            case 2: animalServicio.mostrarTodos(); break;
            case 3: buscarAnimal(); break;
            case 4: eliminarAnimal(); break;
            case 5: break;
            default: System.out.println("Opcion invalida");
            }
        }
    }
    static void registrarAnimal() {
    System.out.print("Tipo (perro/gato): ");
    String tipo = teclado.nextLine();

    System.out.print("Nombre: ");
    String nombre = teclado.nextLine();

    System.out.print("Color: ");
    String color = teclado.nextLine();

    System.out.print("Edad: ");
    int edad = teclado.nextInt();
    teclado.nextLine();

    if (tipo.equalsIgnoreCase("perro")) {
        System.out.print("Raza: ");
        String raza = teclado.nextLine();
        animalServicio.registrar(new Perro(nombre, color, edad, raza));
    } else {
        System.out.print("Color de ojos: ");
        String colorOjos = teclado.nextLine();
        animalServicio.registrar(new Gato(nombre, color, edad, colorOjos));
    }
}
    static void buscarAnimal(){
        System.out.print("Nombre del animal: ");
        String nombre = teclado.nextLine();
        Animal animal = animalServicio.buscar(nombre);
        if (animal != null) {
            animal.mostrarInfo();
        }
    }
    static void eliminarAnimal(){
        System.out.print("Nombre del animal: ");
        String nombre = teclado.nextLine();
        animalServicio.eliminar(nombre);
    }

    static void menuEmpleados(){
        int opcion = 0;
        while (opcion != 5) {
        System.out.println("\n=== Empleados ===");
        System.out.println("1. Registrar empleados");
        System.out.println("2. Ver todos");
        System.out.println("3. Buscar empleado");
        System.out.println("4. Eliminar empleado");
        System.out.println("5. Regresar");
        System.out.print("Elige una opcion: ");
        opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion) {
            case 1: registrarEmpleado(); break;
            case 2: empleadoServicio.mostrarTodos(); break;
            case 3: buscarEmpleado(); break;
            case 4: eliminarEmpleado(); break;
            case 5: break;
            default: System.out.println("Opcion invalida");
            }
        }
    }
    static void registrarEmpleado() {
    System.out.print("Tipo (Ayudante/Veterinario): ");
    String tipo = teclado.nextLine();

    System.out.print("Nombre: ");
    String nombre = teclado.nextLine();

    System.out.print("Apellido: ");
    String apellido = teclado.nextLine();

    System.out.print("Numero de empleado: ");
    int numeroEmpleado = teclado.nextInt();
    teclado.nextLine();

    if (tipo.equalsIgnoreCase("ayudante" )) {
        System.out.print("Area: ");
        String area = teclado.nextLine();
        empleadoServicio.registrar(new Ayudante(nombre, apellido, numeroEmpleado, area));
    } else {
         System.out.print("Especialidad: ");
    String especialidad = teclado.nextLine();
    empleadoServicio.registrar(new Veterinario(nombre, apellido, numeroEmpleado, especialidad));
    }
}
    static void buscarEmpleado(){
        System.out.print("Id del empleado: ");
        int id = teclado.nextInt();
        teclado.nextLine();
        Empleado empleado = empleadoServicio.buscar(id);
        if (empleado != null){
            empleado.mostrarInfo();
        }
        }
    static void eliminarEmpleado(){
        System.out.print("Id del empleado: ");
        int id = teclado.nextInt();
        teclado.nextLine();
        empleadoServicio.eliminar(id);
    }
    static void menuCitas(){
        int opcion = 0;
        while (opcion != 5) {
        System.out.println("\n=== Citas ===");
        System.out.println("1. Registrar cita");
        System.out.println("2. Ver citas");
        System.out.println("3. Buscar cita");
        System.out.println("4. Eliminar cita");
        System.out.println("5. Regresar");
        System.out.print("Elige una opcion: ");
        opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion) {
            case 1: registrarCita(); break;
            case 2: citaServicio.mostrarCitas(); break;
            case 3: buscarCita(); break;
            case 4: eliminarCita(); break;
            case 5: break;
            default: System.out.println("Opcion invalida");
            }
        }
    }
    static void registrarCita() {
    // id de la cita
    System.out.print("ID de la cita: ");
    int idCita = teclado.nextInt();
    teclado.nextLine();

    System.out.print("Fecha entrada (dd/mm/yyyy): ");
    String fechaEntrada = teclado.nextLine();

    System.out.print("Fecha salida (dd/mm/yyyy): ");
    String fechaSalida = teclado.nextLine();

    System.out.print("Nombre del animal: ");
    String nombreAnimal = teclado.nextLine();
    Animal animal = animalServicio.buscar(nombreAnimal);

    System.out.print("Numero del empleado: ");
    int numEmpleado = teclado.nextInt();
    teclado.nextLine();
    Empleado empleado = empleadoServicio.buscar(numEmpleado);

    System.out.print("Nombre del dueño: ");
    String nombreDueño = teclado.nextLine();
    System.out.print("Apellido del dueño: ");
    String apellidoDueño = teclado.nextLine();
    System.out.print("Telefono del dueño: ");
    String telefono = teclado.nextLine();
    Dueño dueño = new Dueño(nombreDueño, apellidoDueño, telefono);

    if (animal != null && empleado != null) {
        citaServicio.registrar(new Cita(fechaEntrada, fechaSalida, idCita, animal, empleado, dueño));
    } else {
        System.out.println(" Animal o empleado no encontrado");
    }
}
    static void buscarCita(){
        System.out.print("Id de cita: ");
        int id = teclado.nextInt();
        teclado.nextLine();
        Cita cita = citaServicio.buscar(id);
        if (cita != null){
            cita.mostrarInfo();
        }
    }
    static void eliminarCita(){
        System.out.print("Id de cita: ");
        int id = teclado.nextInt();
        teclado.nextLine();
        citaServicio.eliminar(id);
    }
}