package es.tienda.modelos;

public class Cliente extends Persona{
    private TipoCliente tipoCliente;

    public Cliente(String nombre, String apellidos, String dni, TipoCliente tipoCliente){
        super(nombre,apellidos,dni);
        this.tipoCliente = tipoCliente;
    }

    public static Cliente alta(String nombre, String apellidos, String dni, TipoCliente tipoCliente) {
        return new Cliente(nombre, apellidos, dni,tipoCliente);
    }

    @Override
    public void mostrarDatos(){
        //prueba de modificacion
        System.out.printf("Nombre: %s, DNI:%s, TipoCliente:%s",getNombre(),getDni(),tipoCliente);
        System.out.println( );
    }
}
