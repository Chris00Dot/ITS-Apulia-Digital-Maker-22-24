package com.academy.car.services.interfaces;

import java.util.List;

import com.academy.car.dto.BiciDTO;
import com.academy.car.exception.AcademyException;
import com.academy.car.requests.BiciReq;

public interface IBiciServices 
{
    Integer insert(BiciReq req) throws AcademyException;
    void update(BiciReq req) throws AcademyException;
    void delete(BiciReq req) throws AcademyException;
    
    List<BiciDTO> listAll();
}
