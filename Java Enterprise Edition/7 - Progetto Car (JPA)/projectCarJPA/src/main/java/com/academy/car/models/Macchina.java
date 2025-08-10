package com.academy.car.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "macchina")
public class Macchina 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMacchina;
    
    // Ogni macchina è legata a un solo veicolo
    
    @OneToOne
    @JoinColumn(name = "id_veicolo") 
    private Veicolo veicolo;

    private int numeroPorte;
    private String targa;
    private int cilindrata;

    public Macchina() 
    {}

    public Macchina(Integer idMacchina, Veicolo veicolo, int numeroPorte, String targa, int cilindrata) 
    {
        this.idMacchina = idMacchina;
        this.veicolo = veicolo;
        this.numeroPorte = numeroPorte;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    // Costruttore senza idMacchina, utilizzato quando non si ha ancora un ID
    public Macchina(Veicolo veicolo, int numeroPorte, String targa, int cilindrata) {
        this.veicolo = veicolo;
        this.numeroPorte = numeroPorte;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    public Integer getIdMacchina() 
    {
        return idMacchina;
    }
    public void setIdMacchina(Integer idMacchina) 
    {
        this.idMacchina = idMacchina;
    }

    public Veicolo getVeicolo()
    {
        return veicolo;
    }
    public void setVeicolo(Veicolo veicolo) 
    {
        this.veicolo = veicolo;
    }

    public int getNumeroPorte() 
    {
        return numeroPorte;
    }
    public void setNumeroPorte(int numeroPorte) 
    {
        this.numeroPorte = numeroPorte;
    }

    public String getTarga() 
    {
        return targa;
    }
    public void setTarga(String targa)
    {
        this.targa = targa;
    }

    public int getCilindrata() 
    {
        return cilindrata;
    }
    public void setCilindrata(int cilindrata) 
    {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() 
    {
        return "Macchina {" +
                "idMacchina=" + idMacchina +
                ", veicolo=" + veicolo +
                ", numeroPorte=" + numeroPorte +
                ", targa='" + targa + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }
}