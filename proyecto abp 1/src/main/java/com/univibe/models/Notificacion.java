package main.java.com.univibe.models;

import java.time.LocalDateTime;

public class Notificacion {
    private String tipo;
    private LocalDateTime fecha;
    private Usuario receptor;

    public Notificacion(String tipo, LocalDateTime fecha, Usuario receptor) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.receptor = receptor;
    }

    public String getTipo() { return tipo; }
    public Usuario getReceptor() { return receptor; }
}
