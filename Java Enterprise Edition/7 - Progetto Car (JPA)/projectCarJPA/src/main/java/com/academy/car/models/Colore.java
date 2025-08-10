package com.academy.car.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Classe che rappresenta il colore del veicolo
@Entity
@Table(name = "colore")
public class Colore 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idColore;
	
    private String tipoColore;
    
    public Colore()
    {}

    public Colore(int idColore, String tipoColore) 
    {
        this.idColore = idColore;
        this.tipoColore = tipoColore;
    }

	public int getIdColore() 
	{
		return idColore;
	}
	public void setIdColore(int idColore) 
	{
		this.idColore = idColore;
	}

	public String getTipoColore() 
	{
		return tipoColore;
	}
	public void setTipoColore(String tipoColore) 
	{
		this.tipoColore = tipoColore;
	}

	@Override
	public String toString() 
	{
		return "Colore [idColore=" + idColore + ", tipoColore=" + tipoColore + "]";
	}
}