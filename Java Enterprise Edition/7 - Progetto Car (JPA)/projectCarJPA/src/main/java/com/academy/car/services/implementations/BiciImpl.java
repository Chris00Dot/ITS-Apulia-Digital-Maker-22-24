package com.academy.car.services.implementations;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.academy.car.dto.BiciDTO;
import com.academy.car.exception.AcademyException;
import com.academy.car.models.Bici;
import com.academy.car.models.Sospensione;
import com.academy.car.models.Veicolo;
import com.academy.car.repositories.IBiciRepository;
import com.academy.car.repositories.ISospensioneRepository;
import com.academy.car.repositories.IVeicoloRepository;
import com.academy.car.requests.BiciReq;
import com.academy.car.services.interfaces.IBiciServices;
import com.academy.car.utils.Utilities;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class BiciImpl extends Utilities implements IBiciServices 
{
    private IBiciRepository biciR;
    private IVeicoloRepository veicoloR;
    private ISospensioneRepository sospensioneR;

    public BiciImpl(IBiciRepository biciR, IVeicoloRepository veicoloR, ISospensioneRepository sospensioneR) 
    {
        this.biciR = biciR;
        this.veicoloR = veicoloR;
        this.sospensioneR = sospensioneR;
    }

    @Override
    public Integer insert(BiciReq req) throws AcademyException 
    {
        log.debug("Insert: " + req);
        
        Optional<Veicolo> v = veicoloR.findById(req.getIdVeicolo());
        if (v.isEmpty()) 
            throw new AcademyException("Veicolo non trovato nel database con id: " + req.getIdVeicolo());

        Optional<Sospensione> s = sospensioneR.findById(req.getIdSospensione());
        if(s.isEmpty())
        	throw new AcademyException("Sospensione non trovata nel database con id: " + req.getIdSospensione());

        Bici bici = new Bici();
        
        bici.setVeicolo(v.get());
        bici.setSospensione(s.get());
        bici.setPieghevole(req.isPieghevole());
        bici.setNumeroMarche(req.getNumeroMarche());

        return biciR.save(bici).getIdBici();
    }

    @Override
    public void update(BiciReq req) throws AcademyException 
    {
        log.debug("Update: " + req);

        Optional<Bici> b = biciR.findById(req.getIdBici());

        if(b.isEmpty())
		{
			throw new AcademyException("Bici non trovata nel database con id: " + req.getIdBici());
		}

        Optional<Veicolo> v = veicoloR.findById(req.getIdVeicolo());
        
        if (v.isEmpty()) 
            throw new AcademyException("Veicolo non trovato nel database con id: " + req.getIdVeicolo());

        Optional<Sospensione> s = sospensioneR.findById(req.getIdSospensione());
        
        if(s.isEmpty())
        	throw new AcademyException("Sospensione non trovata nel database con id: " + req.getIdSospensione());
        
        Bici bici = b.get();

        bici.setPieghevole(req.isPieghevole());
        
        if(req.getNumeroMarche() != 0)
        {
        	Optional<Bici> bNM = biciR.findByNumeroMarche(req.getNumeroMarche());
			
			 if(bNM.isPresent())
				throw new AcademyException("Numero delle marche presente in database");
				
			 bici.setNumeroMarche(req.getNumeroMarche());
        }

        biciR.save(bici);
    }

    @Override
    public void delete(BiciReq req) throws AcademyException 
    {
        log.debug("Delete: " + req);
        
        Optional<Bici> b = biciR.findById(req.getIdBici());

        if(b.isEmpty())
		{
			throw new AcademyException("Bici non trovata nel database con id: " + req.getIdBici());
		}
        
        // Recupero il veicolo associato alla bici che sto per eliminare
     	// Se il veicolo non è null, annullo il collegamento da parte del veicolo verso la bici
        
        Veicolo veicolo = b.get().getVeicolo();
        
        if (veicolo != null)
        {
            veicolo.setBici(null);  
        }
		
		biciR.delete(b.get());
    }

    @Override
    public List<BiciDTO> listAll() 
    {
        List<Bici> bici = biciR.findAll();
		return buildListBiciDTO(bici);
    }
}