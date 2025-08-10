package com.academy.car.services.implementations;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.academy.car.dto.MotoDTO;
import com.academy.car.exception.AcademyException;
import com.academy.car.models.Moto;
import com.academy.car.models.Veicolo;
import com.academy.car.repositories.IMotoRepository;
import com.academy.car.repositories.IVeicoloRepository;
import com.academy.car.requests.MotoReq;
import com.academy.car.services.interfaces.IMotoServices;
import com.academy.car.utils.Utilities;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class MotoImpl extends Utilities implements IMotoServices 
{
	private final IMotoRepository motoR;
	private final IVeicoloRepository veicoloR;
	
	public MotoImpl(IMotoRepository motoR, IVeicoloRepository veicoloR) 
	{
		this.motoR = motoR;
		this.veicoloR = veicoloR;
	}

	@Override
	public Integer insert(MotoReq req) throws AcademyException 
	{
		log.debug("Insert: " + req);

        Optional<Veicolo> v = veicoloR.findById(req.getIdVeicolo());
        if (v.isEmpty()) 
        {
            throw new AcademyException("Veicolo non trovato nel database con id: " + req.getIdVeicolo());
        }

        Moto moto = new Moto();
        
        moto.setVeicolo(v.get());
        moto.setTarga(req.getTarga());
        moto.setCilindrata(req.getCilindrata());

        return motoR.save(moto).getIdMoto();
	}

	@Override
	public void update(MotoReq req) throws AcademyException 
	{
		 log.debug("Update: " + req);

	     Optional<Moto> m = motoR.findById(req.getIdMoto());
	     if (m.isEmpty()) 
	     {
	         throw new AcademyException("Moto non trovata nel database con id: " + req.getIdMoto());
	     }

	     Moto moto = m.get();

	     Optional<Veicolo> v = veicoloR.findById(req.getIdVeicolo());
	        
	     if (v.isEmpty())
	     {
	         throw new AcademyException("Veicolo non trovato nel database con id: " + req.getIdVeicolo());
	     }

	     moto.setVeicolo(v.get());

	     if (req.getTarga() != null && !req.getTarga().isEmpty())
	     {
	    	 Optional<Moto> mT = motoR.findByTarga(req.getTarga());
				
			 if(mT.isPresent())
				throw new AcademyException("Targa presente in database");
				
			 moto.setTarga(req.getTarga());
	     }
	      
	     if (req.getCilindrata() != 0)
	         moto.setCilindrata(req.getCilindrata());

	     motoR.save(moto);
	}

	@Override
	public void delete(MotoReq req) throws AcademyException
	{
		log.debug("Delete: " + req);
		
		Optional<Moto> m = motoR.findById(req.getIdMoto());
		
		if(m.isEmpty())
		{
			throw new AcademyException("Moto non trovata nel database con id: " + req.getIdMoto());
		}
		
		// Recupero il veicolo associato alla moto che sto per eliminare
		// Se il veicolo non è null, annullo il collegamento da parte del veicolo verso la moto
		
		Veicolo veicolo = m.get().getVeicolo();
        
        if (veicolo != null)
        {
            veicolo.setMoto(null);  
        }
		
		motoR.delete(m.get());
	}

	@Override
	public List<MotoDTO> listAll() 
	{
		List<Moto> moto = motoR.findAll();
		return buildListMotoDTO(moto);
	}
}