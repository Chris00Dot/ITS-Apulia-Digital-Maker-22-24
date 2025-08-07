package com.example.democlienti.controller;

import com.example.democlienti.service.ServiceClienti;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class ControllerClienti {
    @Autowired
    ServiceClienti servizioClienti;
    @GetMapping("/clienti")
    public String getClienti() {
        return servizioClienti.reportClienti();
    }
    @GetMapping("/clienti/{id}/{nome}")
    public String getClienti(@PathVariable String id, @PathVariable String nome) {
        return servizioClienti.reportClienti() + " con id " + id + " con nome " + nome;
    }

    @GetMapping("/cliente")
    public String getClientiConRequestParam(@RequestParam(name="id") String id) {
        return servizioClienti.reportClienti() + " con id " + id;
    }
    @GetMapping("/clienti/ordini")
    public String getClientiConOrdini(@RequestParam(name="nomeCliente") String nomeCliente) {
        return servizioClienti.reportClientiConOrdini(nomeCliente);
    }
}
