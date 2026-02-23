package menu.veterinaria.service;

import menu.veterinaria.model.*;
import menu.veterinaria.repository.EmpleadoRepositorio;
import java.util.ArrayList;

public class EmpleadoServicio {

    // conecta con el repositorio
    private EmpleadoRepositorio repositorio = new EmpleadoRepositorio();

    // registrar empleado
    public void registrar(Empleado empleado) {
        if (empleado != null) {
            repositorio.guardar(empleado);
            System.out.println("Empleado registrado exitosamente");
        }
    }

    // mostrar todos
    public void mostrarTodos() {
        ArrayList<Empleado> empleados = repositorio.obtenerTodos();
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados");
        } else {
            for (Empleado e : empleados) {
                e.mostrarInfo();
                System.out.println("----------");
            }
        }
    }

    // buscar por numero de empleado
    public Empleado buscar(int numeroEmpleado) {
        Empleado empleado = repositorio.buscarNuEmpleado(numeroEmpleado);
        if (empleado == null) {
            System.out.println("Empleado no encontrado");
        }
        return empleado;
    }

    // eliminar
    public void eliminar(int numeroEmpleado) {
        Empleado empleado = repositorio.buscarNuEmpleado(numeroEmpleado);
        if (empleado != null) {
            repositorio.eliminar(empleado);
            System.out.println("Empleado eliminado");
        } else {
            System.out.println("Empleado no encontrado");
        }
    }
}
