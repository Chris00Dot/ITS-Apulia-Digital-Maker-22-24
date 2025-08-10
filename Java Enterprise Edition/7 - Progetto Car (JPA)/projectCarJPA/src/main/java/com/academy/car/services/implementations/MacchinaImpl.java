package com.academy.car.services.implementations;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.academy.car.dto.MacchinaDTO;
import com.academy.car.exception.AcademyException;
import com.academy.car.models.Macchina;
import com.academy.car.models.Veicolo;
import com.academy.car.repositories.IMacchinaRepository;
import com.academy.car.repositories.IVeicoloRepository;
import com.academy.car.requests.MacchinaReq;
import com.academy.car.services.interfaces.IMacchinaServices;
import com.academy.car.utils.Utilities;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class MacchinaImpl extends Utilities implements IMacchinaServices 
{
    private final IMacchinaRepository macchinaR;
    private final IVeicoloRepository veicoloR;

    public MacchinaImpl(IMacchinaRepository macchinaR, IVeicoloRepository veicoloR) 
    {
        this.macchinaR = macchinaR;
        this.veicoloR = veicoloR;
    }

    @Override
    public Integer insert(MacchinaReq req) throws AcademyException 
    {
        log.debug("Insert: " + req);

        Optional<Veicolo> v = veicoloR.findById(req.getIdVeicolo());
        if (v.isEmpty()) 
        {
            throw new AcademyException("Veicolo non trovato nel database con id: " + req.getIdVeicolo());
        }

        Macchina macchina = new Macchina();
        
        macchina.setVeicolo(v.get());
        macchina.setNumeroPorte(req.getNumeroPorte());
        macchina.setTarga(req.getTarga());
        macchina.setCilindrata(req.getCilindrata());

        return macchinaR.save(macchina).getIdMacchina();
    }

    @Override
    public void update(MacchinaReq req) throws AcademyException 
    {
        log.debug("Update: " + req);

        Optional<Macchina> m = macchinaR.findById(req.getIdMacchina());
        if (m.isEmpty()) 
        {
            throw new AcademyException("Macchina non trovata nel database con id: " + req.getIdMacchina());
        }

        Macchina macchina = m.get();

        Optional<Veicolo> v = veicoloR.findById(req.getIdVeicolo());
        
        if (v.isEmpty())
        {
            throw new AcademyException("Veicolo non trovato nel database con id: " + req.getIdVeicolo());
        }

        macchina.setVeicolo(v.get());
        
        if (req.getNumeroPorte() != 0) 
            macchina.setNumeroPorte(req.getNumeroPorte());
        
        if (req.getTarga() != null && !req.getTarga().isEmpty())
        {
        	Optional<Macchina> mT = macchinaR.findByTarga(req.getTarga());
			
			if(mT.isPresent())
				throw new AcademyException("Targa presente in database");
			
			macchina.setTarga(req.getTarga());
        }
      
        if (req.getCilindrata() != 0)
            macchina.setCilindrata(req.getCilindrata());

        macchinaR.save(macchina);
    }

    @Override
    public void delete(MacchinaReq req) throws AcademyException 
    {
        log.debug("Delete: " + req);

        Optional<Macchina> m = macchinaR.findById(req.getIdMacchina());
        
        if (m.isEmpty())
        {
            throw new AcademyException("Macchina non trovata nel database con id: " + req.getIdMacchina());
        }
        
        // Recupero il veicolo associato alla macchina che sto per eliminare
     	// Se il veicolo non è null, annullo il collegamento da parte del veicolo verso la macchina
        
        Veicolo veicolo = m.get().getVeicolo();
        
        if (veicolo != null)
        {
            veicolo.setMacchina(null);  
        }

        macchinaR.delete(m.get());
    }

    @Override
    public List<MacchinaDTO> listAll() 
    {
        List<Macchina> macchine = macchinaR.findAll();
        return buildListMacchinaDTO(macchine);
    }
}