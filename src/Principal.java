public class Principal {

    private static Object Cliente;

    public static void main(String []args){
        Cliente cli = new Cliente ("Diego Cliente",123456,15);
        cli.registrarCliente();
        System.out.println("Nombre: "+ cli.nombre);
       System.out.println("Cedula: "+ cli.cedula);
        System.out.println("Edad: "+ cli.edad);
    }
}
