package com.academy.car.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

// Classe che rappresenta un veicolo di tipo moto (derivato dalla classe base Veicolo)
@Entity
@Table(name = "moto")
public class Moto 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMoto;
	
	// Ogni moto è legata a un solo veicolo

	@OneToOne
    @JoinColumn(name = "id_veicolo")
    private Veicolo veicolo;
    
	private String targa;
    private int cilindrata;
    
    public Moto()
    {}

    public Moto(Integer idMoto, Veicolo veicolo, String targa, int cilindrata) 
    {
        this.idMoto = idMoto;
        this.veicolo = veicolo;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    public Moto(Veicolo veicolo, String targa, int cilindrata) 
    {
        this.veicolo = veicolo;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }
    
    public Integer getIdMoto() 
    {
        return idMoto;
    }
    public void setIdMoto(Integer idMoto) 
    {
        this.idMoto = idMoto;
    }

    public Veicolo getVeicolo() 
    {
        return veicolo;
    }
    public void setVeicolo(Veicolo veicolo) 
    {
        this.veicolo = veicolo;
    }
    
	public int getCilindrata() 
	{
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) 
	{
		this.cilindrata = cilindrata;
	}
	
	public String getTarga() 
	{
		return targa;
	}
	public void setTarga(String targa) 
	{
		this.targa = targa;
	}

	@Override
    public String toString() 
	{
        return "Moto{" +
                "idMoto=" + idMoto +
                ", veicolo=" + veicolo +
                ", targa='" + targa + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }
}