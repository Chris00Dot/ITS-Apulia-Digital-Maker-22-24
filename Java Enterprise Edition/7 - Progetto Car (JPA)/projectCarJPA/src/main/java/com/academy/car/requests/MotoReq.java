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
public class MotoReq 
{
	private Integer idMoto;
    private Integer idVeicolo;     // Id dell'entità Veicolo (padre)
    private String targa;
    private Integer cilindrata;
}
