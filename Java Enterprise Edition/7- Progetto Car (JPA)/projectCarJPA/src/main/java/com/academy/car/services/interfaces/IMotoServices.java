package com.academy.car.services.interfaces;

import java.util.List;

import com.academy.car.dto.MotoDTO;
import com.academy.car.exception.AcademyException;
import com.academy.car.requests.MotoReq;

public interface IMotoServices 
{
	Integer insert(MotoReq req) throws AcademyException;
    void update(MotoReq req) throws AcademyException;
    void delete(MotoReq req) throws AcademyException;

    List<MotoDTO> listAll();
}
