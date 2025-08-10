package com.academy.car.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@ToString
@Builder
public class MacchinaDTO 
{
    private Integer idMacchina;
    private String targa;
    private Integer numeroPorte;
    private Integer cilindrata;
}
