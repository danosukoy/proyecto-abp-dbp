package main.java.com.univibe.models;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;
    private List<Evento> eventosInscritos;
    private int puntos;
    private List<String> logros;
    private List<Grupo> grupos;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.eventosInscritos = new ArrayList<>();
        this.puntos = 0;
        this.logros = new ArrayList<>();
        this.grupos = new ArrayList<>();
    }

    // --- Métodos de negocio ---
    public void inscribirse(Evento evento) {
        eventosInscritos.add(evento);
        puntos += 10; // puntos por inscribirse
    }

    public void agregarLogro(String logro) {
        logros.add(logro);
    }

    // --- Getters y Setters ---
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public List<Evento> getEventosInscritos() {
        return eventosInscritos;
    }

    public void setEventosInscritos(List<Evento> eventosInscritos) {
        this.eventosInscritos = eventosInscritos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public List<String> getLogros() {
        return logros;
    }

    public void setLogros(List<String> logros) {
        this.logros = logros;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
}


