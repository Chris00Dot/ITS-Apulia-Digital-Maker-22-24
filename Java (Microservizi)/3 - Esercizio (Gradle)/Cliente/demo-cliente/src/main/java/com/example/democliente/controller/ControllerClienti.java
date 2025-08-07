package com.example.democliente.controller;

import com.example.democliente.service.ServizioClienti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClienti
{
    @Autowired
    ServizioClienti servizioClienti;

    @GetMapping("/clienti")
    public String getClientiConID()
    {
        return servizioClienti.reportClienti();
    }

    @GetMapping("/clienti/{ID}")
    public String getClientiConID(@PathVariable Long ID)
    {
        return servizioClienti.reportClienti() + ID;
    }
}
