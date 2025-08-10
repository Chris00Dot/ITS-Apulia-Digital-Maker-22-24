package com.academy.car.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Classe che rappresenta la categoria del veicolo (es. SUV, Berlina, etc...)
@Entity
@Table(name = "categoria")
public class Categoria 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
	
    private String nomeCategoria;
    
    public Categoria()
    {}

    public Categoria(int idCategoria, String nomeCategoria) 
    {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
    }

	public int getIdCategoria() 
	{
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) 
	{
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() 
	{
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) 
	{
		this.nomeCategoria = nomeCategoria;
	}

	@Override
	public String toString() 
	{
		return "Categoria [idCategoria=" + idCategoria + ", nomeCategoria=" + nomeCategoria + "]";
	}
}