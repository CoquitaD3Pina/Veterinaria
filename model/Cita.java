package menu.veterinaria.model;

public class Cita {

    private String fechaEntrada, fechaSalida;
    private Animal animal;
    private Empleado empleado;
    private Dueño dueño;
    private int idCita;

    public Cita(){

    }
    public Cita(String fechaEntrada, String fechaSalida, int idCita, Animal animal, Empleado empleado, Dueño dueño){
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.animal = animal;
        this.empleado = empleado;
        this.dueño = dueño;
        this.idCita = idCita;
    }
    public int getIdCita(){
        return idCita;
    }
    public String getFechaEntrada(){
        return fechaEntrada;
    }
    public String getFechaSalida(){
        return fechaSalida;
    }
    public Animal getAnimal(){
        return animal;
    }
    public Empleado getEmpleado(){
        return empleado;
    }
    public Dueño getDueño(){
        return dueño;
    }
    public void setIdCita(int idCita) {
        if (idCita > 0){
            this.idCita = idCita;
        }
    }
    public void setFechaEntrada(String fechaEntrada) {
        if (fechaEntrada != null && !fechaEntrada.isEmpty()) {
            this.fechaEntrada = fechaEntrada;
    }
    }
    public void setFechaSalida(String fechaSalida) {
        if (fechaSalida != null && !fechaSalida.isEmpty()) {
            this.fechaSalida = fechaSalida;
    }
    }
    public void setAnimal(Animal animal) {
    if (animal != null) {
        this.animal = animal;
    }
    }
    public void setEmpleado(Empleado empleado) {
    if (empleado != null) {
        this.empleado = empleado;
    }
    }
    public void setDueño(Dueño dueño) {
    if (dueño != null) {
        this.dueño = dueño;
    }
    }
    public void mostrarInfo() {
    System.out.println("Fecha entrada: " + fechaEntrada);
    System.out.println("Fecha salida: " + fechaSalida);
    System.out.println("--- Animal ---");
    animal.mostrarInfo();
    System.out.println("--- Dueño ---");
    dueño.mostrarInfo();
    System.out.println("--- Veterinario ---");
    empleado.mostrarInfo();
    }
   
    


}

