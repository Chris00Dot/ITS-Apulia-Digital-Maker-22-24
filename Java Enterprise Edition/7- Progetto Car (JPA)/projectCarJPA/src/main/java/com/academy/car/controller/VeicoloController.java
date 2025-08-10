package com.academy.car.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academy.car.controller.response.ResponseBase;
import com.academy.car.controller.response.ResponseList;
import com.academy.car.dto.VeicoloDTO;
import com.academy.car.requests.VeicoloReq;
import com.academy.car.services.interfaces.IVeicoloServices;

@RestController
@RequestMapping("/rest/veicolo")
public class VeicoloController 
{
	private IVeicoloServices veicoloS;

	public VeicoloController(IVeicoloServices veicoloS) 
	{
		this.veicoloS = veicoloS;
	}
	
	@GetMapping("/list")
	public ResponseList<VeicoloDTO> list()
	{
		ResponseList<VeicoloDTO> r = new ResponseList<VeicoloDTO>();
		
		try
		{
			r.setDati(veicoloS.listAll());
			
			// Ritorna il codice
			r.setRc(true);
		}
		catch(Exception e)
		{
			r.setRc(false);
			r.setMsg(e.getMessage());
		}
		
		return r;
	}
	
	@PostMapping("/create")
	public ResponseBase create(@RequestBody(required = true) VeicoloReq req)
	{
		ResponseBase r = new ResponseBase();
		
		try
		{
			veicoloS.insert(req);
			r.setRc(true);
		}
		catch(Exception e)
		{
			r.setRc(false);
			r.setMsg(e.getMessage());
		}
		
		return r;
	}
	
	@PutMapping("/update")
	public ResponseBase update(@RequestBody(required = true) VeicoloReq req)
	{
		ResponseBase r = new ResponseBase();
		
		try
		{
			veicoloS.update(req);
			r.setRc(true);
		}
		catch(Exception e)
		{
			r.setRc(false);
			r.setMsg(e.getMessage());
		}
		
		return r;
	}
	
	@DeleteMapping("/delete")
	public ResponseBase delete(@RequestBody(required = true) VeicoloReq req)
	{
		ResponseBase r = new ResponseBase();
		
		try
		{
			veicoloS.delete(req);
			r.setRc(true);
		}
		catch(Exception e)
		{
			r.setRc(false);
			r.setMsg(e.getMessage());
		}
		
		return r;
	}
}