package com.examen.api_rest;

import com.examen.api_rest.model.Mensaje;
import com.examen.api_rest.repository.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MensajeService {
    @Autowired
    private MensajeRepository mensajeRepository;

    public Mensaje createMensaje(Mensaje mensaje) {
        return mensajeRepository.save(mensaje);
    }

    public Mensaje getMensajeById(Long id) {
        Optional<Mensaje> optionalMensaje = mensajeRepository.findById(id);
        return optionalMensaje.get();
    }

    public List<Mensaje> getAllMensajes() {
        return mensajeRepository.findAll();
    }

    public void deleteMensajeById(Long id) {
        mensajeRepository.deleteById(id);
    }
}
