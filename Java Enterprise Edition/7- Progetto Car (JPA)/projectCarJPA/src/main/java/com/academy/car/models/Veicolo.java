package com.academy.car.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "veicolo")
public class Veicolo 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVeicolo;

    // Ogni Veicolo ha una sola alimentazione, categoria, colore e marca
    // Molti veicoli posso avere la stessa alimentazione, categoria, colore e marca
    
    @ManyToOne
    @JoinColumn(name = "id_alimentazione", nullable = false)
    private Alimentazione alimentazione;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_colore", nullable = false)
    private Colore colore;

    @ManyToOne
    @JoinColumn(name = "id_marca", nullable = false)
    private Marca marca;

    private String modello;
    private int annoProduzione;
    private LocalDate dataInserimento;
    private LocalDate dataAggiornamento;
    
    // Il veicolo può essere una macchina, moto o bici

    @OneToOne(mappedBy = "veicolo")
    private Macchina macchina;
    
    @OneToOne(mappedBy = "veicolo")
    private Moto moto;
    
    @OneToOne(mappedBy = "veicolo")
    private Bici bici;
    
    public Veicolo() 
    {}

    public Veicolo(Integer idVeicolo, Colore colore, Marca marca, Alimentazione alimentazione, Categoria categoria, String modello, int annoProduzione, LocalDate dataInserimento, LocalDate dataAggiornamento, Macchina macchina, Moto moto, Bici bici) 
    {
        this.idVeicolo = idVeicolo;
        this.colore = colore;
        this.marca = marca;
        this.alimentazione = alimentazione;
        this.categoria = categoria;
        this.modello = modello;
        this.annoProduzione = annoProduzione;
        this.dataInserimento = dataInserimento;
        this.dataAggiornamento = dataAggiornamento;
        this.macchina = macchina;
        this.moto = moto;
        this.bici = bici;
    }

    public Integer getIdVeicolo() 
    {
        return idVeicolo;
    }
    public void setIdVeicolo(Integer idVeicolo) 
    {
        this.idVeicolo = idVeicolo;
    }

    public Alimentazione getAlimentazione() 
    {
        return alimentazione;
    }
    public void setAlimentazione(Alimentazione alimentazione) 
    {
        this.alimentazione = alimentazione;
    }

    public Categoria getCategoria() 
    {
        return categoria;
    }
    public void setCategoria(Categoria categoria) 
    {
        this.categoria = categoria;
    }

    public Colore getColore() 
    {
        return colore;
    }
    public void setColore(Colore colore) 
    {
        this.colore = colore;
    }

    public Marca getMarca() 
    {
        return marca;
    }
    public void setMarca(Marca marca) 
    {
        this.marca = marca;
    }
    
    public String getModello() 
    {
        return modello;
    }
    public void setModello(String modello) 
    {
        this.modello = modello;
    }

    public int getAnnoProduzione() 
    {
        return annoProduzione;
    }
    public void setAnnoProduzione(int annoProduzione) 
    {
        this.annoProduzione = annoProduzione;
    }

    public LocalDate getDataInserimento() 
    {
        return dataInserimento;
    }
    public void setDataInserimento(LocalDate dataInserimento) 
    {
        this.dataInserimento = dataInserimento;
    }

    public LocalDate getDataAggiornamento() 
    {
        return dataAggiornamento;
    }
    public void setDataAggiornamento(LocalDate dataAggiornamento) 
    {
        this.dataAggiornamento = dataAggiornamento;
    }

    public Macchina getMacchina() 
    {
        return macchina;
    }
    public void setMacchina(Macchina macchina) 
    {
        this.macchina = macchina;
    }
    
    public Moto getMoto() 
    {
        return moto;
    }
    public void setMoto(Moto moto) 
    {
        this.moto = moto;
    }
    
    public Bici getBici() 
    {
        return bici;
    }
    public void setBici(Bici bici) 
    {
        this.bici = bici;
    }

    @Override
    public String toString() 
    {
        return "Veicolo{" +
                "idVeicolo=" + idVeicolo +
                ", alimentazione=" + alimentazione +
                ", categoria=" + categoria +
                ", colore=" + colore +
                ", marca=" + marca +
                ", modello='" + modello + '\'' +
                ", annoProduzione=" + annoProduzione +
                ", dataInserimento=" + dataInserimento +
                ", dataAggiornamento=" + dataAggiornamento +
                ", macchina=" + macchina +
                ", moto=" + moto +
                ", bici=" + bici +
                '}';
    }
}