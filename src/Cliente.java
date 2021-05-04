public class Cliente extends Persona {
    private int idCliente;

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(String nombre, int cedula, int edad) {
        super(nombre, cedula, edad);

    }

    @Override
    public boolean esMayorEdad() {
        return super.esMayorEdad();
    }

    public void registrarCliente() {
    }
}


