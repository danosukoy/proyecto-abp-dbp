package main.java.com.univibe.models;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nombre;
    private String descripcion;
    private List<Usuario> miembros;

    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(Usuario usuario) {
        miembros.add(usuario);
    }

    public String getNombre() { return nombre; }
    public List<Usuario> getMiembros() { return miembros; }
}
