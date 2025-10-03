package main.java.com.univibe.models;

public class QR {
    private String codigo;
    private Usuario usuario;
    private Evento evento;

    public QR(String codigo, Usuario usuario, Evento evento) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.evento = evento;
    }

    public String getCodigo() { return codigo; }
}
