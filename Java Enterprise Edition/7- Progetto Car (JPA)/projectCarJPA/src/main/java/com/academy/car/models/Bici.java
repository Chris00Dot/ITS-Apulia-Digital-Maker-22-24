package com.academy.car.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

//Classe che rappresenta un veicolo di tipo bici (derivato dalla classe base Veicolo)
@Entity
@Table(name = "bici")
public class Bici
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBici;
	
	// Ogni bici è legata a un solo veicolo

	@OneToOne
    @JoinColumn(name = "id_veicolo") 
    private Veicolo veicolo;
	
	// Ogni bici ha una sola sospensione
    
	@ManyToOne
    @JoinColumn(name = "id_sospensione")
	private Sospensione sospensione; 
	
    private boolean pieghevole;   
    private int numeroMarche;     
    
    public Bici() 
    {}

    public Bici(Integer idBici, Veicolo veicolo, Sospensione sospensione, boolean pieghevole, int numeroMarche) 
    {
        this.idBici = idBici;
        this.veicolo = veicolo;
        this.sospensione = sospensione;
        this.pieghevole = pieghevole;
        this.numeroMarche = numeroMarche;
    }
    
    public Bici(Veicolo veicolo, Sospensione sospensione, boolean pieghevole, int numeroMarche) 
    {
        this.veicolo = veicolo;
        this.sospensione = sospensione;
        this.pieghevole = pieghevole;
        this.numeroMarche = numeroMarche;
    }
    
    public Integer getIdBici() 
    {
        return idBici;
    }
    public void setIdBici(Integer idBici) {
        this.idBici = idBici;
    }

    public Veicolo getVeicolo() 
    {
        return veicolo;
    }
    public void setVeicolo(Veicolo veicolo) 
    {
        this.veicolo = veicolo;
    }

	public Sospensione getSospensione() 
	{
		return sospensione;
	}
	public void setSospensione(Sospensione sospensione) 
	{
		this.sospensione = sospensione;
	}

	public boolean isPieghevole() 
	{
		return pieghevole;
	}
	public void setPieghevole(boolean pieghevole) 
	{
		this.pieghevole = pieghevole;
	}

	public int getNumeroMarche() 
	{
		return numeroMarche;
	}
	public void setNumeroMarche(int numeroMarche) 
	{
		this.numeroMarche = numeroMarche;
	}

	@Override
	public String toString() 
	{
        return "Bici{" +
                "idBici=" + idBici +
                ", veicolo=" + veicolo +
                ", sospensione=" + sospensione +
                ", pieghevole=" + pieghevole +
                ", numeroMarche=" + numeroMarche +
                '}';
    }
}