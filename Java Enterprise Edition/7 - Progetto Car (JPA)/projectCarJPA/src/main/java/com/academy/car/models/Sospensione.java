package com.academy.car.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Classe che rappresenta il tipo di sospensione di un veicolo (es. Anteriore, Posteriore)
@Entity
@Table(name = "sospensione")
public class Sospensione 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSospensione;
	
    private String tipoSospensione;
    private String marcaSospensione;
    private String materiale;
    
    public Sospensione()
    {}

    public Sospensione(int idSospensione, String tipoSospensione, String marcaSospensione, String materiale) 
    {
        this.idSospensione = idSospensione;
        this.tipoSospensione = tipoSospensione;
        this.marcaSospensione = marcaSospensione;
        this.materiale = materiale;
    }

	public int getIdSospensione() 
	{
		return idSospensione;
	}
	public void setIdSospensione(int idSospensione) 
	{
		this.idSospensione = idSospensione;
	}

	public String getTipoSospensione() 
	{
		return tipoSospensione;
	}
	public void setTipoSospensione(String tipoSospensione) 
	{
		this.tipoSospensione = tipoSospensione;
	}

	public String getMarcaSospensione() 
	{
		return marcaSospensione;
	}
	public void setMarcaSospensione(String marcaSospensione) 
	{
		this.marcaSospensione = marcaSospensione;
	}

	public String getMateriale() 
	{
		return materiale;
	}
	public void setMateriale(String materiale) 
	{
		this.materiale = materiale;
	}

	@Override
	public String toString() 
	{
		return "Sospensione [idSospensione=" + idSospensione + ", tipoSospensione=" + tipoSospensione
				+ ", marcaSospensione=" + marcaSospensione + ", materiale=" + materiale + "]";
	} 
}