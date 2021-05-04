public class Administrador extends Persona {

private int idAdministrador;

public Administrador(String nombre, int cedula, int edad){
    super(nombre, cedula, edad);

    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public boolean esMayorEdad() {
        return super.esMayorEdad();
    }

    protected void registarAdninistrador(){
        if(esMayorEdad()) {
            System.out.println("Administrador registrado (datos): ");
            System.out.println("Nombre: " + getNombre());
            System.out.println("Cedula: " + getCedula());
            System.out.println("Edad: " + getEdad());
        }

    }

    public void registarAdmin() {
    }
}

