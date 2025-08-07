package com.example.democlienti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceClienti {

    @Autowired
    RestTemplate restTemplate;
    public String reportClienti() {
        return "Clienti";
    }
    public String reportClientiConOrdini(String nomeCliente) {
        String risposta = restTemplate.getForObject("http://microservizio-ordini:8080/ordini", String.class);
        return nomeCliente + " " + risposta;
    }
}
