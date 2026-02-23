package menu.veterinaria.repository;

import java.util.ArrayList;
import menu.veterinaria.model.*;

public class CitaRepositorio {

    private ArrayList <Cita> citas = new ArrayList<>();
    
    public void guardar(Cita cita) {
        citas.add(cita);
    }

    public ArrayList<Cita> obtenerTodos() {
        return citas;
    }

    public Cita buscarPorCita(int idCita) {
        for (Cita a : citas) {
            if (a.getIdCita() == idCita) {
                return a;
            }
        }
        return null; // no encontrado
    }

    public void eliminar(Cita cita) {
        citas.remove(cita);
    }
}
