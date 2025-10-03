package main.java.com.univibe.services;


import main.java.com.univibe.models.Notificacion;
import main.java.com.univibe.models.Usuario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NotificacionService {
    private List<Notificacion> notificaciones;

    public NotificacionService() {
        this.notificaciones = new ArrayList<>();
    }

    public void enviarNotificacion(String tipo, Usuario receptor) {
        Notificacion notificacion = new Notificacion(tipo, LocalDateTime.now(), receptor);
        notificaciones.add(notificacion);
    }

    public List<Notificacion> obtenerNotificacionesDeUsuario(Usuario usuario) {
        return notificaciones.stream()
                .filter(n -> n.getReceptor().equals(usuario))
                .toList();
    }

    public List<Notificacion> listarTodas() {
        return notificaciones;
    }
}

