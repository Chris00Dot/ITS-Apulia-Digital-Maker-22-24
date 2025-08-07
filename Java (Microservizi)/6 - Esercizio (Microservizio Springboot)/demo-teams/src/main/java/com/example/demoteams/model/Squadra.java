package com.example.demoteams.model;

import java.util.List;

public class Squadra
{
    private String nome;
    private List<Calciatore> calciatori;

    public Squadra(String nome, List<Calciatore> calciatori)
    {
        this.nome = nome;
        this.calciatori = calciatori;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public List<Calciatore> getCalciatori()
    {
        return calciatori;
    }

    public void setCalciatori(List<Calciatore> calciatori)
    {
        this.calciatori = calciatori;
    }
}