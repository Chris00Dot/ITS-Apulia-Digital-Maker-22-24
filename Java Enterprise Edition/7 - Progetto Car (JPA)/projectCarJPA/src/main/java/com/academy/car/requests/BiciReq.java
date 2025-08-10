package com.academy.car.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BiciReq 
{
    private Integer idBici;
    private Integer idVeicolo;		// Id dell'entità Veicolo (padre)
    private Integer idSospensione;
    private boolean pieghevole;
    private int numeroMarche;
}
