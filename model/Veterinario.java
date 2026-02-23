package menu.veterinaria.model;

public class Veterinario extends Empleado  {
    
    private String especialidad ;

    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        if(especialidad != null && !especialidad.isEmpty()){
            this.especialidad = especialidad;
        }
    }
    public Veterinario(){

    }
    public Veterinario(String nombre, String apellido, int numeroEmpleado, String especialidad){
        super(nombre, apellido, numeroEmpleado);
        this.especialidad = especialidad;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre del empleado: " + getNombre());
        System.out.println("Apellido del empleado: " + getApellido());
        System.out.println("Numero del empleado: " + getNumeroEmpleado());
        System.out.println("Especialidad: " + getEspecialidad());
    }
}