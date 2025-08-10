package com.academy.car.utils;

import java.util.List;
import java.util.stream.Collectors;

import com.academy.car.dto.BiciDTO;
import com.academy.car.dto.MacchinaDTO;
import com.academy.car.dto.MotoDTO;
import com.academy.car.dto.VeicoloDTO;
import com.academy.car.models.Bici;
import com.academy.car.models.Macchina;
import com.academy.car.models.Moto;
import com.academy.car.models.Veicolo;

public class Utilities 
{
	public List<VeicoloDTO> buildListVeicoloDTO(List<Veicolo> lV)
	{
		return lV.stream()
		        .map(v -> VeicoloDTO.builder()
		                .idVeicolo(v.getIdVeicolo())
		                .colore(v.getColore().getTipoColore())
		                .marca(v.getMarca().getNomeMarca())
		                .alimentazione(v.getAlimentazione().getTipoCarburante())
		                .categoria(v.getCategoria().getNomeCategoria())
		                .modello(v.getModello())
		                .annoProduzione(v.getAnnoProduzione())
		                .dataInserimento(v.getDataInserimento())
		                .dataAggiornamento(v.getDataAggiornamento())
		                .macchina(v.getMacchina() != null ? MacchinaDTO.builder()
	                            .idMacchina(v.getMacchina().getIdMacchina())
	                            .targa(v.getMacchina().getTarga())
	                            .numeroPorte(v.getMacchina().getNumeroPorte())
	                            .cilindrata(v.getMacchina().getCilindrata())
	                            .build() : null)  // Se non c'è una macchina, imposto null
		                .moto(v.getMoto() != null ? MotoDTO.builder()
	                            .idMoto(v.getMoto().getIdMoto())
	                            .targa(v.getMoto().getTarga())
	                            .cilindrata(v.getMoto().getCilindrata())
	                            .build() : null)  // Se non c'è una moto, imposto null
		                .bici(v.getBici() != null ? BiciDTO.builder()
	                            .idBici(v.getBici().getIdBici())
	                            .tipoSospensione(v.getBici().getSospensione().getTipoSospensione())
	                            .marcaSospensione(v.getBici().getSospensione().getMarcaSospensione())
	                            .materiale(v.getBici().getSospensione().getMateriale())
	                            .pieghevole(v.getBici().isPieghevole())
	                            .numeroMarche(v.getBici().getNumeroMarche())
	                            .build() : null)  // Se non c'è una moto, imposto null
		                .build()
		        )
		        .collect(Collectors.toList());
	}
	
	public List<MacchinaDTO> buildListMacchinaDTO(List<Macchina> lM) 
	{
        return lM.stream()
                .map(m -> MacchinaDTO.builder()
                        .idMacchina(m.getIdMacchina())
                        .targa(m.getTarga())
                        .numeroPorte(m.getNumeroPorte())
                        .cilindrata(m.getCilindrata())
                        .build()
                )
                .collect(Collectors.toList());
	}
	
	public List<MotoDTO> buildListMotoDTO(List<Moto> lM) 
	{
        return lM.stream()
                .map(m -> MotoDTO.builder()
                        .idMoto(m.getIdMoto())
                        .targa(m.getTarga())
                        .cilindrata(m.getCilindrata())
                        .build()
                )
                .collect(Collectors.toList());
	}
	
	public List<BiciDTO> buildListBiciDTO(List<Bici> lB)
	{
		return lB.stream()
				.map(bici -> BiciDTO.builder()
							 .idBici(bici.getIdBici())
							 .tipoSospensione(bici.getSospensione().getTipoSospensione())
							 .marcaSospensione(bici.getSospensione().getMarcaSospensione())
							 .materiale(bici.getSospensione().getMateriale())
							 .pieghevole(bici.isPieghevole())
							 .numeroMarche(bici.getNumeroMarche())
							 .build()
			    ).collect(Collectors.toList());
	}
}