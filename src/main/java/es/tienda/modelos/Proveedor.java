package es.tienda.modelos;

public class Proveedor extends Persona {

    private  TipoProveedor tipoProveedor;


    public Proveedor(String nombre, String apellidos, String dni, TipoProveedor tipo) {
        super(nombre, apellidos, dni,tipo);
    }

    public static Proveedor alta(String nombre, String apellidos, String dni, TipoProveedor tipo) {
        return new Proveedor(nombre, apellidos, dni, tipo);
    }

    @Override
    public void mostrarDatos() {
        System.out.println(" DATOS DEL PROVEEDOR ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("DNI: " + getDni());
        System.out.println("Tipo de Proveedor: " + tipoProveedor);
    }
}
