package es.tienda.modelos;

public class Cliente extends Persona{
    private TipoCliente tipoCliente;

    public Cliente(String nombre, String apellidos, String dni, TipoCliente tipo){
        super(nombre,apellidos,dni,tipo);
    }

    public static Cliente alta(String nombre, String apellidos, String dni, TipoCliente tipo) {
        return new Cliente(nombre, apellidos, dni,tipo);
    }

    @Override
    public void mostrarDatos(){
        //prueba de modificacion
        System.out.printf("Nombre: %s, DNI:%s, TipoCliente:%s",getNombre(),getDni(),tipoCliente);
    }
}
