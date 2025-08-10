package com.academy.car.dto;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@ToString
@Builder
public class VeicoloDTO 
{
    private Integer idVeicolo;

    private String colore;          // nome del colore
    private String marca;           // nome della marca
    private String alimentazione;   // tipo di alimentazione
    private String categoria;       // nome della categoria

    private String modello;
    private Integer annoProduzione;
    private LocalDate dataInserimento;
    private LocalDate dataAggiornamento;
    
    // Dettagli dei vari veicoli per il Builder
    private MacchinaDTO macchina;
    private MotoDTO moto;
    private BiciDTO bici;
}