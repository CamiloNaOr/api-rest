package com.examen.api_rest.controller;

import com.examen.api_rest.MensajeService;
import com.examen.api_rest.model.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/mensajes")
public class UserController {

    @Autowired
    private MensajeService mensajeService;

    @PostMapping
    public Mensaje createMensaje(@RequestBody Mensaje mensaje) {
        return mensajeService.createMensaje(mensaje);
    }

    @GetMapping
    public List<Mensaje> getAllMensajes() {
        return mensajeService.getAllMensajes();
    }

    @GetMapping("{id}")
    public Mensaje searchMensajeById(@PathVariable Long id) {
        return mensajeService.getMensajeById(id);
    }

    @DeleteMapping("{id}")
    public void deleteMensajeById(@PathVariable Long id) {
        mensajeService.deleteMensajeById(id);
    }
}
