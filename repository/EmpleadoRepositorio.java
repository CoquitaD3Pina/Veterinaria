package menu.veterinaria.repository;

import java.util.ArrayList;
import menu.veterinaria.model.Empleado;

public class EmpleadoRepositorio {

    private ArrayList <Empleado> empleados = new ArrayList<>();
    
    public void guardar(Empleado empleado) {
        empleados.add(empleado);
    }

    public ArrayList<Empleado> obtenerTodos() {
        return empleados;
    }

    public Empleado buscarNuEmpleado(int numeroEmpleado) {
        for (Empleado a : empleados) {
            if (a.getNumeroEmpleado() == numeroEmpleado) {
                return a;
            }
        }
        return null; // no encontrado
    }

    public void eliminar(Empleado empleado) {
        empleados.remove(empleado);
    }
}
