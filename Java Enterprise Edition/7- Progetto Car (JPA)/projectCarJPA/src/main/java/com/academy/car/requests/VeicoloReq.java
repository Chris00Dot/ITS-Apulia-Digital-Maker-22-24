package com.academy.car.requests;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VeicoloReq 
{
    private Integer idVeicolo;
    private Integer idColore;
    private Integer idMarca;
    private Integer idAlimentazione;
    private Integer idCategoria;
    private String modello;
    private Integer annoProduzione;
    private LocalDate dataInserimento;
    private LocalDate dataAggiornamento;
}