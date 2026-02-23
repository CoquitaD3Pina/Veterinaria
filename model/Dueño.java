package menu.veterinaria.model;

public class Dueño {

    private String nombre, apellido, telefono;
    

    public Dueño(){

    }
    public Dueño(String nombre, String apellido, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNumeroTelefono(){
        return telefono;
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
    public void setTelefono(String telefono){
        if (telefono.length() == 12){
            this.telefono = telefono;
        }
    }
    public void mostrarInfo(){
        System.out.println("Nombre del dueño: " + getNombre());
        System.out.println("Apellido del dueño: " + getApellido());
        System.out.println("Telefono del dueño: " + getNumeroTelefono());
    }

    
}
