package menu.veterinaria.service;

import menu.veterinaria.model.*;
import menu.veterinaria.repository.AnimalRepositorio;
import java.util.ArrayList;

public class AnimalServicio {

    // conecta con el repositorio
    private AnimalRepositorio repositorio = new AnimalRepositorio();

    // registrar animal
    public void registrar(Animal animal) {
        if (animal != null) {
            repositorio.guardar(animal);
            System.out.println("Animal registrado exitosamente");
        }
    }

    // mostrar todos
    public void mostrarTodos() {
        ArrayList<Animal> animales = repositorio.obtenerTodos();
        if (animales.isEmpty()) {
            System.out.println("No hay animales registrados");
        } else {
            for (Animal a : animales) {
                a.mostrarInfo();
                System.out.println("----------");
            }
        }
    }

    // buscar por nombre
    public Animal buscar(String nombre) {
        Animal animal = repositorio.buscarPorNombre(nombre);
        if (animal == null) {
            System.out.println("Animal no encontrado");
        }
        return animal;
    }

    // eliminar
    public void eliminar(String nombre) {
        Animal animal = repositorio.buscarPorNombre(nombre);
        if (animal != null) {
            repositorio.eliminar(animal);
            System.out.println("Animal eliminado");
        } else {
            System.out.println("Animal no encontrado");
        }
    }
}