package menu.veterinaria.model;

public abstract class Empleado {

    private String nombre, apellido;
    private int numeroEmpleado;

    public Empleado(){

    }
    public Empleado(String nombre, String apellido, int numeroEmpleado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroEmpleado = numeroEmpleado;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getNumeroEmpleado(){
        return numeroEmpleado;
    }
    public void setNombre(String nombre){
        if (nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        }
    }
    public void setApellido(String apellido){
        if (apellido != null && !apellido.isEmpty()){
            this.apellido = apellido;
        }
    }
    public void setNumeroEmpleado(int numeroEmpleado){
        if (numeroEmpleado > 0){
            this.numeroEmpleado = numeroEmpleado;
        }
    }    
    public abstract void mostrarInfo();
}
