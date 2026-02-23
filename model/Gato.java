package menu.veterinaria.model;

public class Gato extends Animal  {
    
    private String colorOjos ;

    public String getColorOjos(){
        return colorOjos;
    }
    public void setColorOjos(String colorOjos){
        if(colorOjos != null && !colorOjos.isEmpty()){
            this.colorOjos = colorOjos;
        }
    }
    public Gato(){

    }
    public Gato(String nombre, String color, int edad, String colorOjos){
        super(nombre, color, edad);
        this.colorOjos = colorOjos;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre del animal: " + getNombre());
        System.out.println("Color del animal: " + getColor());
        System.out.println("Edad del animal: " + getEdad());
        System.out.println("Color de ojos: " + getColorOjos());
    }
}
