package menu.veterinaria.service;

import menu.veterinaria.repository.CitaRepositorio;
import menu.veterinaria.model.*;
import java.util.ArrayList;

public class CitaServicio {

    private CitaRepositorio repositorio = new CitaRepositorio();

    public void registrar(Cita cita){
        if(cita != null){
            repositorio.guardar(cita);
            System.out.println("Se registro la cita");
        }

    }

    public void mostrarCitas(){
        ArrayList <Cita> citas = repositorio.obtenerTodos();
        if (citas.isEmpty()){
            System.out.println("No hay nada que mostrar");
        }else{
            for (Cita a : citas) {
                a.mostrarInfo();
                System.out.println("----------");
            }
        }

    }

    public Cita buscar(int idCita) {
        Cita cita = repositorio.buscarPorCita(idCita);
        if (cita == null) {
            System.out.println("No hay citas");
        }
        return cita;
    }

    public void eliminar(int idCita) {
        Cita cita = repositorio.buscarPorCita(idCita);
        if (cita != null) {
            repositorio.eliminar(cita);
            System.out.println("Cita eliminada ");
        } else {
            System.out.println("Cita no encontrada ");
        }
    }

}

