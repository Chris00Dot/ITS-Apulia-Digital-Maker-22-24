package com.academy.car.process;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Component;

import com.academy.car.dto.VeicoloDTO;
import com.academy.car.exception.AcademyException;
import com.academy.car.requests.VeicoloReq;
import com.academy.car.services.interfaces.IVeicoloServices;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class VeicoloProcess 
{
    private final IVeicoloServices veicoloS;

    public VeicoloProcess(IVeicoloServices veicoloS) 
    {
        this.veicoloS = veicoloS;
    }

    public void execute() 
    {
        log.debug("Begin VeicoloProcess");

        try 
        {
            VeicoloReq req = new VeicoloReq();

            req.setModello("Panda");
            req.setAnnoProduzione(2020);
            req.setDataInserimento(LocalDate.parse("2025-03-02"));
            req.setDataAggiornamento(LocalDate.parse("2025-07-21"));

            req.setIdColore(1);           // Assumendo che ci sia già un colore con id=1
            req.setIdMarca(1);           // Id di una marca esistente
            req.setIdAlimentazione(1);   // Id di una alimentazione esistente
            req.setIdCategoria(1);       // Id di una categoria esistente

            veicoloS.insert(req);
            
            //
            
            req = new VeicoloReq();

            req.setModello("Fiat");
            req.setAnnoProduzione(2021);
            req.setDataInserimento(LocalDate.parse("2025-04-01"));
            req.setDataAggiornamento(LocalDate.parse("2025-07-21"));

            req.setIdColore(2);          
            req.setIdMarca(2);           
            req.setIdAlimentazione(2);   
            req.setIdCategoria(2);       

            veicoloS.insert(req);
			
			//
			
			req = new VeicoloReq();

            req.setModello("ID.4");
            req.setAnnoProduzione(2022);
            req.setDataInserimento(LocalDate.parse("2025-05-01"));
            req.setDataAggiornamento(LocalDate.parse("2025-07-21"));

            req.setIdColore(3);          
            req.setIdMarca(3);           
            req.setIdAlimentazione(3);   
            req.setIdCategoria(3);       

            veicoloS.insert(req);
			
        } 
        catch (AcademyException e) 
        {
            log.error(e.getMessage());
        }

        List<VeicoloDTO> veicoli = veicoloS.listAll();
        veicoli.forEach(v -> log.debug(v.toString()));

        log.debug("Fine VeicoloProcess");
    }
}
