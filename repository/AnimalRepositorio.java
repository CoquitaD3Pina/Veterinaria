package menu.veterinaria.repository;

import menu.veterinaria.model.Animal;
import java.util.ArrayList;

public class AnimalRepositorio {

    private ArrayList<Animal> animales = new ArrayList<>();

    // guardar un animal
    public void guardar(Animal animal) {
        animales.add(animal);
    }

    // obtener todos los animales
    public ArrayList<Animal> obtenerTodos() {
        return animales;
    }

    // buscar por nombre
    public Animal buscarPorNombre(String nombre) {
        for (Animal a : animales) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                return a;
            }
        }
        return null; // no encontrado
    }

    // eliminar
    public void eliminar(Animal animal) {
        animales.remove(animal);
    }
}