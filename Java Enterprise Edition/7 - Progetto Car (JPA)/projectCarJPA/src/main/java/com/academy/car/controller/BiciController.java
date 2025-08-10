package com.academy.car.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.academy.car.controller.response.ResponseBase;
import com.academy.car.controller.response.ResponseList;
import com.academy.car.dto.BiciDTO;
import com.academy.car.requests.BiciReq;
import com.academy.car.services.interfaces.IBiciServices;

@RestController
@RequestMapping("/rest/bici")
public class BiciController 
{
    private IBiciServices biciS;

    public BiciController(IBiciServices biciS) 
    {
        this.biciS = biciS;
    }

    @GetMapping("/list")
    public ResponseList<BiciDTO> list() 
    {
        ResponseList<BiciDTO> r = new ResponseList<>();

        try 
        {
            List<BiciDTO> dati = biciS.listAll();
            r.setDati(dati);
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
    public ResponseBase create(@RequestBody BiciReq req) 
    {
        ResponseBase r = new ResponseBase();

        try 
        {
            biciS.insert(req);
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
    public ResponseBase update(@RequestBody BiciReq req) 
    {
        ResponseBase r = new ResponseBase();

        try 
        {
            biciS.update(req);
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
    public ResponseBase delete(@RequestBody BiciReq req) 
    {
        ResponseBase r = new ResponseBase();

        try 
        {
            biciS.delete(req);
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