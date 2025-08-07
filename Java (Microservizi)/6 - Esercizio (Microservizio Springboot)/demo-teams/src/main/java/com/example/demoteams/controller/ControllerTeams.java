package com.example.demoteams.controller;

import com.example.demoteams.model.Calciatore;
import com.example.demoteams.model.Squadra;
import com.example.demoteams.service.ServiceTeams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ControllerTeams
{
    @Autowired
    private ServiceTeams serviceTeams;

    @GetMapping("/teams")
    public List<Squadra> getAllTeams()
    {
        return serviceTeams.getAllTeams();
    }

    @GetMapping("/team/{name}")
    public List<Calciatore> getAllPlayersByTeamName(@PathVariable String name)
    {
        return serviceTeams.getAllPlayersByTeamName(name);
    }

    @ExceptionHandler({ RuntimeException.class})
    public ResponseEntity<String> handleException(RuntimeException e)
    {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}