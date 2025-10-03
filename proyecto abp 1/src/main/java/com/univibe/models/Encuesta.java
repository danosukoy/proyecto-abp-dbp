package main.java.com.univibe.models;

import java.util.List;

public class Encuesta {
    private String pregunta;
    private List<String> opciones;

    public Encuesta(String pregunta, List<String> opciones) {
        this.pregunta = pregunta;
        this.opciones = opciones;
    }

    public String getPregunta() { return pregunta; }
    public List<String> getOpciones() { return opciones; }
}
