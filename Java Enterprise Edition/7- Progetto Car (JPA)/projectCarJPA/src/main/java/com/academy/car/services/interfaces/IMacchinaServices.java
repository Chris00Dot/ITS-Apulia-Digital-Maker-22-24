package com.academy.car.services.interfaces;

import java.util.List;

import com.academy.car.dto.MacchinaDTO;
import com.academy.car.exception.AcademyException;
import com.academy.car.requests.MacchinaReq;

public interface IMacchinaServices 
{
    Integer insert(MacchinaReq req) throws AcademyException;
    void update(MacchinaReq req) throws AcademyException;
    void delete(MacchinaReq req) throws AcademyException;

    List<MacchinaDTO> listAll();
}
