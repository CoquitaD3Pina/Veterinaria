package menu.veterinaria.model;

public abstract class Animal {

    private String nombre , color ;
    private int edad;

    public Animal(){

    }
    public Animal(String nombre , String color , int edad){
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getColor(){
        return color;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        if (nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        }
    }
    public void setColor(String color){
        if (color != null && !color.isEmpty()){
            this.color = color;
        }
    }
    public void setEdad(int edad){
        if (edad > 0){
            this.edad = edad;
        }
    }
    public abstract void mostrarInfo();
}
