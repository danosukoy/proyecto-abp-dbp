package main.java.com.univibe.models;


public class Logro {
    private String nombre;
    private String descripcion;

    public Logro(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
}
