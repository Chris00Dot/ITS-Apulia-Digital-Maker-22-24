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
import com.academy.car.dto.MotoDTO;
import com.academy.car.requests.MotoReq;
import com.academy.car.services.interfaces.IMotoServices;

@RestController
@RequestMapping("/rest/moto")
public class MotoController 
{
	private IMotoServices motoS;

    public MotoController(IMotoServices motoS) 
    {
		this.motoS = motoS;
	}

	@GetMapping("/list")
    public ResponseList<MotoDTO> list() 
    {
        ResponseList<MotoDTO> r = new ResponseList<MotoDTO>();

        try 
        {
            r.setDati(motoS.listAll());

            // Return the success code
            r.setRc(true);
        } 
        catch (Exception e) 
        {
            r.setRc(false);
            r.setMsg(e.getMessage());
        }

        return r;
    }

    @PostMapping("/create")
    public ResponseBase create(@RequestBody(required = true) MotoReq req) 
    {
        ResponseBase r = new ResponseBase();

        try 
        {
            motoS.insert(req);
            r.setRc(true);
        } 
        catch (Exception e) 
        {
            r.setRc(false);
            r.setMsg(e.getMessage());
        }

        return r;
    }

    @PutMapping("/update")
    public ResponseBase update(@RequestBody(required = true) MotoReq req) 
    {
        ResponseBase r = new ResponseBase();

        try 
        {
            motoS.update(req);
            r.setRc(true);
        } 
        catch (Exception e) 
        {
            r.setRc(false);
            r.setMsg(e.getMessage());
        }

        return r;
    }

    @DeleteMapping("/delete")
    public ResponseBase delete(@RequestBody(required = true) MotoReq req) 
    {
        ResponseBase r = new ResponseBase();

        try 
        {
            motoS.delete(req);
            r.setRc(true);
        } 
        catch (Exception e) 
        {
            r.setRc(false);
            r.setMsg(e.getMessage());
        }

        return r;
    }
}
