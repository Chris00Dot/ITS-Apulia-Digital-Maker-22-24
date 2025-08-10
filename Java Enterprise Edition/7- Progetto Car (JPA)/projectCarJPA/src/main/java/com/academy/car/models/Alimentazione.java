package com.academy.car.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Classe che rappresenta un tipo di alimentazione per i veicoli
@Entity
@Table(name = "alimentazione")
public class Alimentazione 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlimentazione;
	
    private String tipoCarburante;
    
    public Alimentazione()
    {}

    public Alimentazione(int idAlimentazione, String tipoCarburante) 
    {
        this.idAlimentazione = idAlimentazione;
        this.tipoCarburante = tipoCarburante;
    }

	public int getIdAlimentazione() 
	{
		return idAlimentazione;
	}
	public void setIdAlimentazione(int idAlimentazione) 
	{
		this.idAlimentazione = idAlimentazione;
	}

	public String getTipoCarburante() 
	{
		return tipoCarburante;
	}
	public void setTipoCarburante(String tipoCarburante) 
	{
		this.tipoCarburante = tipoCarburante;
	}

	@Override
	public String toString() 
	{
		return "Alimentazione [idAlimentazione=" + idAlimentazione + ", tipoCarburante=" + tipoCarburante + "]";
	}
}