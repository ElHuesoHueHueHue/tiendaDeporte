package es.tienda.modelos;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        List<Proveedor> proveedores = new ArrayList<>();
        List<Articulo> articulos = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            System.out.print("Dime el nombre de tu cliente ");
            String nombre = Entrada.cadena();
            System.out.print("Dime el apellido de tu cliente ");
            String apellido = Entrada.cadena();
            System.out.print("Dime el dni de tu cliente ");
            String dni = Entrada.cadena();
            System.out.print("Dime el tipo de cliente ");
            TipoCliente tipo = TipoCliente.valueOf(Entrada.cadena());
            clientes.add(i,Cliente.alta(nombre,apellido,dni,tipo));
        }

        for (int i = 0; i < 4; i++){
            System.out.print("Dime el nombre de tu proveedor ");
            String nombre = Entrada.cadena();
            System.out.print("Dime el apellido de tu proveedor ");
            String apellido = Entrada.cadena();
            System.out.print("Dime el dni de tu proveedor ");
            String dni = Entrada.cadena();
            System.out.print("Que tipo de proveedor es ");
            TipoProveedor tipo = TipoProveedor.valueOf(Entrada.cadena());
            proveedores.add(i,Proveedor.alta(nombre,apellido,dni,tipo));
        }

        for (int i = 0; i < 3; i++){
            System.out.print("Dime el código de tu articulo ");
            String codigo = Entrada.cadena();
            System.out.print("Dime la descripción de tu articulo ");
            String descripcion = Entrada.cadena();
            System.out.print("Dime el precio de tu articulo ");
            Double precio = Entrada.realDoble();
            articulos.add(i,new Articulo(codigo,descripcion,precio));
        }

        for (Cliente cliente : clientes){
            cliente.mostrarDatos();
        }

        for (Proveedor proveedor : proveedores){
            proveedor.mostrarDatos();
        }

        for (Articulo articulo : articulos){
            articulo.visualizarDatos(articulo);
        }

    }
}
