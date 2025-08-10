package com.academy.car.services.implementations;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.academy.car.dto.VeicoloDTO;
import com.academy.car.exception.AcademyException;
import com.academy.car.models.Alimentazione;
import com.academy.car.models.Categoria;
import com.academy.car.models.Colore;
import com.academy.car.models.Marca;
import com.academy.car.models.Veicolo;
import com.academy.car.repositories.IAlimentazioneRepository;
import com.academy.car.repositories.ICategoriaRepository;
import com.academy.car.repositories.IColoreRepository;
import com.academy.car.repositories.IMarcaRepository;
import com.academy.car.repositories.IVeicoloRepository;
import com.academy.car.requests.VeicoloReq;
import com.academy.car.services.interfaces.IVeicoloServices;
import com.academy.car.utils.Utilities;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class VeicoloImpl extends Utilities implements IVeicoloServices 
{
	private IVeicoloRepository veicoloR;
	private IColoreRepository coloreR;
    private IMarcaRepository marcaR;
    private IAlimentazioneRepository alimentazioneR;
    private ICategoriaRepository categoriaR;
	
    public VeicoloImpl(IVeicoloRepository veicoloR, IColoreRepository coloreR, IMarcaRepository marcaR, IAlimentazioneRepository alimentazioneR, ICategoriaRepository categoriaR) 
    {
    	this.veicoloR = veicoloR;
    	this.coloreR = coloreR;
    	this.marcaR = marcaR;
    	this.alimentazioneR = alimentazioneR;
    	this.categoriaR = categoriaR;
    }

	@Override
	public Integer insert(VeicoloReq req) throws AcademyException 
	{
		log.debug("Insert: " + req);
		
		Optional<Veicolo> v = veicoloR.findByModello(req.getModello());
		if(v.isPresent())
		{
			throw new AcademyException("Veicolo esistente in database");
		}
		
		Veicolo veicolo = new Veicolo();
		
		Colore colore = coloreR.findById(req.getIdColore())
	               .orElseThrow(() -> new AcademyException("Colore non trovato"));
		
	    Marca marca = marcaR.findById(req.getIdMarca())
	               .orElseThrow(() -> new AcademyException("Marca non trovata"));
	    
	    Alimentazione alimentazione = alimentazioneR.findById(req.getIdAlimentazione())
	                .orElseThrow(() -> new AcademyException("Alimentazione non trovata"));
	    
	    Categoria categoria = categoriaR.findById(req.getIdCategoria())
	                .orElseThrow(() -> new AcademyException("Categoria non trovata"));
		
		veicolo.setColore(colore);
		veicolo.setMarca(marca);
		veicolo.setAlimentazione(alimentazione);
		veicolo.setCategoria(categoria);
		veicolo.setModello(req.getModello());
		veicolo.setAnnoProduzione(req.getAnnoProduzione());
		veicolo.setDataInserimento(req.getDataInserimento());
		veicolo.setDataAggiornamento(req.getDataAggiornamento());
		
		return veicoloR.save(veicolo).getIdVeicolo();
	}
	
	@Override
	public void update(VeicoloReq req) throws AcademyException 
	{
		log.debug("Update: " + req);
		
		Optional<Veicolo> v = veicoloR.findById(req.getIdVeicolo());
		
		if(v.isEmpty())
		{
			throw new AcademyException("Socio non trovato in database: " + req.getIdVeicolo());
		}
		
		Veicolo veicolo = v.get();
		
		if(req.getAnnoProduzione() != null)
		{
			veicolo.setAnnoProduzione(req.getAnnoProduzione());
		}
		if(req.getDataInserimento() != null)
		{
			veicolo.setDataInserimento(req.getDataInserimento());
		}
		if(req.getDataAggiornamento() != null)
		{
			veicolo.setDataAggiornamento(req.getDataAggiornamento());
		}
		if(req.getModello() != null)
		{
			Optional<Veicolo> vM = veicoloR.findByModello(req.getModello());
			
			if(vM.isPresent())
				throw new AcademyException("Modello presente in database");
			
			veicolo.setModello(req.getModello());
		}
		
		// Update 
		veicoloR.save(veicolo);
	}
	
	@Override
	public void delete(VeicoloReq req) throws AcademyException 
	{
		log.debug("Delete: " + req);	
		
		Optional<Veicolo> v = veicoloR.findById(req.getIdVeicolo());
		
		if(v.isEmpty())
		{
			throw new AcademyException("Veicolo non trovato in database" + req.getIdVeicolo());
		}
		
		veicoloR.delete(v.get());
	}

	@Override
	public List<VeicoloDTO> listAll() 
	{
		List<Veicolo> veicoli = veicoloR.findAll();
		return buildListVeicoloDTO(veicoli);
	}
}