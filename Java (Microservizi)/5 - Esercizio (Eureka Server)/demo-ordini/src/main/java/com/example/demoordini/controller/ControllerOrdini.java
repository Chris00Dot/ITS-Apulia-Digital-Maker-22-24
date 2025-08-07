package com.example.demoordini.controller;

import com.example.demoordini.service.ServizioOrdini;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerOrdini {
    @Autowired
    ServizioOrdini servizioOrdini;
    @GetMapping("/ordini")
    public String getOrdini() {
        return servizioOrdini.reportOrdini();
    }

    @GetMapping("/ordini/lb")
    public String getLB(HttpServletRequest request){
        return request.getRequestURL().toString();
    }
}


