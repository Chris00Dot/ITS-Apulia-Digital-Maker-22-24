package com.academy.car.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@ToString
@Builder
public class MotoDTO 
{
	private Integer idMoto;
    private String targa;
    private Integer cilindrata;
}
