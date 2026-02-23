package menu.veterinaria.model;

public class Perro extends Animal  {
    
    private String raza ;

    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        if(raza != null && !raza.isEmpty()){
            this.raza=raza;
        }
    }
    public Perro(){

    }
    public Perro(String nombre, String color, int edad, String raza){
        super(nombre, color, edad);
        this.raza = raza;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre del animal: " + getNombre());
        System.out.println("Color del animal: " + getColor());
        System.out.println("Edad del animal: " + getEdad());
        System.out.println("Raza del animal: " + getRaza());
    }
}
