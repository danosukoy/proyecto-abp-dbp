package main.java.com.univibe.models;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String titulo;
    private String descripcion;
    private String categoria;
    private List<Usuario> participantes;

    public Evento(String titulo, String descripcion, String categoria) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.participantes = new ArrayList<>();
    }

    public void agregarParticipante(Usuario usuario) {
        participantes.add(usuario);
    }

    public String getTitulo() { return titulo; }
    public String getCategoria() { return categoria; }
    public List<Usuario> getParticipantes() { return participantes; }
}
