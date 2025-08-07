package com.example.demoteams.model;

public class Calciatore
{
    private String cognome;
    private String nome;
    private String ruolo;
    private int forza;

    public Calciatore(String cognome, String nome, String ruolo, int forza)
    {
        this.cognome = cognome;
        this.nome = nome;
        this.ruolo = ruolo;
        this.forza = forza;
    }

    public String getCognome()
    {
        return cognome;
    }
    public void setCognome(String cognome)
    {
        this.cognome = cognome;
    }

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getRuolo()
    {
        return ruolo;
    }
    public void setRuolo(String ruolo)
    {
        this.ruolo = ruolo;
    }

    public int getForza()
    {
        return forza;
    }
    public void setForza(int forza)
    {
        this.forza = forza;
    }
}
