package es.tienda.modelos;

public class Articulo {
    private String codigo;
    private String descripcion;
    private double precio;

    public Articulo(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public static Articulo alta(String codigo, String descripcion, double precio){
        return new Articulo(codigo, descripcion, precio);
    }

    public void visualizarDatos(Articulo articulo){
        System.out.printf("El articulo con código %s y descripción %s, tiene un precio de %5.2f", articulo.codigo,articulo.descripcion,articulo.precio);
        System.out.println( );
    }

    //.
}
