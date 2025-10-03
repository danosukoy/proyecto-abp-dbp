package main.java.com.univibe;

import main.java.com.univibe.models.Evento;
import main.java.com.univibe.models.Usuario;
import main.java.com.univibe.services.EventoService;

public class Main {
    public static void main(String[] args) {
        EventoService eventoService = new EventoService();

        Evento e1 = new Evento("Hackathon UTEC", "Competencia de programación", "Tecnología");
        eventoService.crearEvento(e1);

        Usuario u1 = new Usuario("Diego", "diego@utec.edu.pe", "1234");
        u1.inscribirse(e1);

        System.out.println(u1.getNombre() + " tiene " + u1.getPuntos() + " puntos.");
    }
}
