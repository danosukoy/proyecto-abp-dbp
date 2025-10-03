package main.java.com.univibe.services;


import main.java.com.univibe.models.Usuario;
import main.java.com.univibe.models.Evento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioService {
    private List<Usuario> usuarios;

    public UsuarioService() {
        this.usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Optional<Usuario> login(String correo, String contrasena) {
        return usuarios.stream()
                .filter(u -> u.getCorreo().equalsIgnoreCase(correo) && u.getContrasena().equals(contrasena))
                .findFirst();
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public void inscribirUsuarioAEvento(Usuario usuario, Evento evento) {
        usuario.inscribirse(evento);
        evento.agregarParticipante(usuario);
    }
}

