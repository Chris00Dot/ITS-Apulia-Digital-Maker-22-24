package com.academy.car.services.interfaces;

import java.util.List;

import com.academy.car.dto.VeicoloDTO;
import com.academy.car.exception.AcademyException;
import com.academy.car.requests.VeicoloReq;

public interface IVeicoloServices 
{
	Integer insert(VeicoloReq req) throws AcademyException;
	void update(VeicoloReq req) throws AcademyException;
	void delete(VeicoloReq req) throws AcademyException;
	
    List<VeicoloDTO> listAll();
}
