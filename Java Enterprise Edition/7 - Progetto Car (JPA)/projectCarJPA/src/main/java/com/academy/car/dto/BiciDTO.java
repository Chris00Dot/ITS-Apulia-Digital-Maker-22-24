package com.academy.car.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@ToString
@Builder
public class BiciDTO 
{
    private Integer idBici;
    private String tipoSospensione;
    private String marcaSospensione;
    private String materiale;
    private boolean pieghevole;
    private int numeroMarche;
}
