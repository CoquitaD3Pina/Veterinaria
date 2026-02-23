package menu.veterinaria.model;

public class Ayudante extends Empleado  {
    
    private String area ;

    public String getArea(){
        return area;
    }
    public void setArea(String area){
        if(area != null && !area.isEmpty()){
            this.area = area;
        }
    }
    public Ayudante(){

    }
    public Ayudante(String nombre, String apellido, int numeroEmpleado, String area){
        super(nombre, apellido, numeroEmpleado);
        this.area = area;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre del empleado: " + getNombre());
        System.out.println("Apellido del empleado: " + getApellido());
        System.out.println("Numero del empleado: " + getNumeroEmpleado());
        System.out.println("Area: " + getArea());
    }
}