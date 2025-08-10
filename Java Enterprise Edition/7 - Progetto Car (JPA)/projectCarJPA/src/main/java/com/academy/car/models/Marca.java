package com.academy.car.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Classe che rappresenta una marca di veicolo (es. Ferrari, BMW, etc.)
@Entity
@Table(name = "marca")
public class Marca 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMarca;
	
    private String nomeMarca;
    private String nazione;
    private int annoFondazione;
    
    public Marca()
    {}

    public Marca(int idMarca, String nomeMarca, String nazione, int annoFondazione) 
    {
        this.idMarca = idMarca;
        this.nomeMarca = nomeMarca;
        this.nazione = nazione;
        this.annoFondazione = annoFondazione;
    }

	public int getIdMarca() 
	{
		return idMarca;
	}
	public void setIdMarca(int idMarca) 
	{
		this.idMarca = idMarca;
	}

	public String getNomeMarca() 
	{
		return nomeMarca;
	}
	public void setNomeMarca(String nomeMarca) 
	{
		this.nomeMarca = nomeMarca;
	}

	public String getNazione() 
	{
		return nazione;
	}
	public void setNazione(String nazione) 
	{
		this.nazione = nazione;
	}

	public int getAnnoFondazione() 
	{
		return annoFondazione;
	}
	public void setAnnoFondazione(int annoFondazione) 
	{
		this.annoFondazione = annoFondazione;
	}

	@Override
	public String toString() 
	{
		return "Marca [idMarca=" + idMarca + ", nomeMarca=" + nomeMarca + ", nazione=" + nazione + ", annoFondazione="
				+ annoFondazione + "]";
	}
}