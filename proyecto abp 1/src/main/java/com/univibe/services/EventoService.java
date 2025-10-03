package main.java.com.univibe.services;


import main.java.com.univibe.models.Evento;
import java.util.ArrayList;
import java.util.List;

public class EventoService {
    private List<Evento> eventos;

    public EventoService() {
        this.eventos = new ArrayList<>();
    }

    public void crearEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }

    public List<Evento> filtrarPorCategoria(String categoria) {
        return eventos.stream()
                .filter(e -> e.getCategoria().equalsIgnoreCase(categoria))
                .toList();
    }
}

